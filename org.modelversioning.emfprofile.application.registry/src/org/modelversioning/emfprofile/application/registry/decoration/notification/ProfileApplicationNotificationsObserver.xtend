package org.modelversioning.emfprofile.application.registry.decoration.notification

import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.util.EContentAdapter
import org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationWrapperImpl
import org.modelversioning.emfprofileapplication.EMFProfileApplicationPackage
import org.modelversioning.emfprofileapplication.ProfileApplication
import org.modelversioning.emfprofileapplication.StereotypeApplication

/**
 * Is used to listen for all model changes under {@link ProfileApplication}.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
class ProfileApplicationNotificationsObserver extends EContentAdapter {

	val ProfileApplicationWrapperImpl profileApplicationWrapper

	new(ProfileApplicationWrapperImpl profileApplicationWrapper) {
		this.profileApplicationWrapper = profileApplicationWrapper
	}

	/*
	 * ----------------------------------
	 * 
	 * PA ... ProfileApplication
	 * 
	 * SA ... StereotypeApplication
	 * 
	 * 
	 * Notifier | Event | Feature | oldValue | newValue | should notify
	 * decorator? --> (comment)
	 * 
	 * 
	 * NOTIFICATIONS:
	 * 
	 * 0: ignore event-type REMOVING_ADAPTER
	 * 
	 * 1: PA | ADD/REMOVE/REMOVING_ADAPTER | stereotypeApplications | null | SA | Yes -->
	 * (for Add do nothing because appliedTo is still not set, for Remove refresh viewer,
	 * for Removing_Adapter we unload the profile application wrapper). 
	 * For Add we have to wait until the applied to was set. So, ADD must be handled differently.
	 * 
	 * 2: SA | SET | EAttribute(appliedTo) | null | some-object |
	 * Yes 
	 * 
	 * 3: SA | SET | EAttribute(extension) | null/object |
	 * null/object | No -->(will be ignored because these should not be
	 * played with, like e.g., in properties view)
	 * 
	 * 4: SA | SET | EReference(profileApplication) | PA | null | No -->
	 * (comes when stereotype removed, handled by 1.)
	 * 
	 * 5: SA | SET | EAttribute | any | any | Yes --> (the attribute of a
	 * stereotype has changed, relevant for decoration)
	 * 
	 * 6: SA | SET/ADD | EReference | any | any | No --> (ignoring the
	 * changes in contained objects, not relevant for decoration. This also
	 * handles 4.)
	 *
	 * 7: SA | Removing_Adapter | EReference | any | any | Yes --> 
	 * observer is removed so the decoration will be removed		
	 * 
	 * 8: other | any | any | any | any | No --> (ignoring objects that are
	 * children, grand children, etc., from stereotype applications, not
	 * relevant for decorations)
	 * 
	 * ----------------------------------
	 */
	 
	override def notifyChanged(Notification notification){
		super.notifyChanged(notification) 
		// in any case with every incoming notification there has to be a
		// change in the model, so notification to update the profile
		// application wrapper in the viewer is desired.
		profileApplicationWrapper.sendNotificationToUpdateProfileApplicationWrapperInViewer
		
		/* ***** Handling Notifications ***** */ 
		val notifier = notification.getNotifier
		val eventType = notification.eventType
		switch notifier {
			
			ProfileApplication : {
//				println("PROFILE APPLICATION NOTIFICATION: " + notification.toString())
				switch eventType {
					case eventType == Notification.ADD : {
						// NOTE: at this moment the stereotype application does not
						// have the 'appliedTo' property set, so we have to wait
						// until that notification comes in order to trigger the
						// process of decoration!
						
						// structural change, must refresh
						profileApplicationWrapper.sendNotificationToRefreshProfileApplicationWrapperInViewer
					}
					case eventType == Notification.REMOVE : {
						// structural change, must refresh
						profileApplicationWrapper.sendNotificationToRefreshProfileApplicationWrapperInViewer
					}
					case eventType == Notification.REMOVING_ADAPTER : {
						// this happens in most cases when the model resource is unloading
						// this may also be triggered by the editor synchronizer
						// in any case we have to unload the profile application too
						profileApplicationWrapper.unload
					}
				}
			}
			
			StereotypeApplication : {
//				println("STEREOTYPE APPLICATION NOTIFICATION: " + notification.toString())
				switch eventType {
					case eventType == Notification.SET : {
						
						switch notification.feature {
							// for every attribute that is set
							EAttribute : {
								profileApplicationWrapper.dispatcher.acceptSetNotification(notifier)
							}
							// if the reference 'appliedTo' was set
							case notification.feature == EMFProfileApplicationPackage.eINSTANCE
							.getStereotypeApplication_AppliedTo() : {
								profileApplicationWrapper.dispatcher.acceptAddNotification(notifier)
							}
						}
					}
					case eventType == Notification.REMOVING_ADAPTER : {
 						// when the observer detaches itself from the stereotype application object
 						// we must send remove notification to the decorator
 						profileApplicationWrapper.dispatcher?.acceptRemoveNotification(notifier)   
					}
				}
			}
			
			default:
				// All other notifications will be ignored
//				println("IGNORED NOTIFICATION: " + notification.toString())
				return
		}
		
	}

}
