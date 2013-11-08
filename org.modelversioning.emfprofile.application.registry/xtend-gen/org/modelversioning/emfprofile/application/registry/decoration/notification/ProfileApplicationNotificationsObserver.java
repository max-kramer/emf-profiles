package org.modelversioning.emfprofile.application.registry.decoration.notification;

import com.google.common.base.Objects;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.modelversioning.emfprofile.application.registry.decoration.notification.DecorationNotificationDispatcher;
import org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationWrapperImpl;
import org.modelversioning.emfprofileapplication.EMFProfileApplicationPackage;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * Is used to listen for all model changes under {@link ProfileApplication}.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
@SuppressWarnings("all")
public class ProfileApplicationNotificationsObserver extends EContentAdapter {
  private final ProfileApplicationWrapperImpl profileApplicationWrapper;
  
  public ProfileApplicationNotificationsObserver(final ProfileApplicationWrapperImpl profileApplicationWrapper) {
    this.profileApplicationWrapper = profileApplicationWrapper;
  }
  
  /**
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
  public void notifyChanged(final Notification notification) {
    super.notifyChanged(notification);
    this.profileApplicationWrapper.sendNotificationToUpdateProfileApplicationWrapperInViewer();
    final Object notifier = notification.getNotifier();
    final int eventType = notification.getEventType();
    boolean _matched = false;
    if (!_matched) {
      if (notifier instanceof ProfileApplication) {
        final ProfileApplication _profileApplication = (ProfileApplication)notifier;
        _matched=true;
        String _string = notification.toString();
        String _plus = ("PROFILE APPLICATION NOTIFICATION: " + _string);
        InputOutput.<String>println(_plus);
        boolean _matched_1 = false;
        if (!_matched_1) {
          boolean _equals = (eventType == Notification.ADD);
          if (_equals) {
            _matched_1=true;
            this.profileApplicationWrapper.sendNotificationToRefreshProfileApplicationWrapperInViewer();
          }
        }
        if (!_matched_1) {
          boolean _equals_1 = (eventType == Notification.REMOVE);
          if (_equals_1) {
            _matched_1=true;
            this.profileApplicationWrapper.sendNotificationToRefreshProfileApplicationWrapperInViewer();
          }
        }
        if (!_matched_1) {
          boolean _equals_2 = (eventType == Notification.REMOVING_ADAPTER);
          if (_equals_2) {
            _matched_1=true;
            this.profileApplicationWrapper.unload();
          }
        }
      }
    }
    if (!_matched) {
      if (notifier instanceof StereotypeApplication) {
        final StereotypeApplication _stereotypeApplication = (StereotypeApplication)notifier;
        _matched=true;
        String _string = notification.toString();
        String _plus = ("STEREOTYPE APPLICATION NOTIFICATION: " + _string);
        InputOutput.<String>println(_plus);
        boolean _matched_1 = false;
        if (!_matched_1) {
          boolean _equals = (eventType == Notification.SET);
          if (_equals) {
            _matched_1=true;
            Object _feature = notification.getFeature();
            final Object _switchValue = _feature;
            boolean _matched_2 = false;
            if (!_matched_2) {
              if (_switchValue instanceof EAttribute) {
                final EAttribute _eAttribute = (EAttribute)_switchValue;
                _matched_2=true;
                DecorationNotificationDispatcher _dispatcher = this.profileApplicationWrapper.getDispatcher();
                _dispatcher.acceptSetNotification(_stereotypeApplication);
              }
            }
            if (!_matched_2) {
              Object _feature_1 = notification.getFeature();
              EReference _stereotypeApplication_AppliedTo = EMFProfileApplicationPackage.eINSTANCE.getStereotypeApplication_AppliedTo();
              boolean _equals_1 = Objects.equal(_feature_1, _stereotypeApplication_AppliedTo);
              if (_equals_1) {
                _matched_2=true;
                DecorationNotificationDispatcher _dispatcher = this.profileApplicationWrapper.getDispatcher();
                _dispatcher.acceptAddNotification(_stereotypeApplication);
              }
            }
          }
        }
        if (!_matched_1) {
          boolean _equals_2 = (eventType == Notification.REMOVING_ADAPTER);
          if (_equals_2) {
            _matched_1=true;
            DecorationNotificationDispatcher _dispatcher_1 = this.profileApplicationWrapper.getDispatcher();
            _dispatcher_1.acceptRemoveNotification(_stereotypeApplication);
          }
        }
      }
    }
    if (!_matched) {
      String _string = notification.toString();
      String _plus = ("IGNORED NOTIFICATION: " + _string);
      InputOutput.<String>println(_plus);
    }
  }
}
