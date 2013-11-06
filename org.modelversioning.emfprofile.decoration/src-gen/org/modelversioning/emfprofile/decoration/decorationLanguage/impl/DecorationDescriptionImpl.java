/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.modelversioning.emfprofile.Stereotype;

import org.modelversioning.emfprofile.decoration.decorationLanguage.Activation;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Decoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decoration Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationDescriptionImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationDescriptionImpl#getDecorations <em>Decorations</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationDescriptionImpl#getActivation <em>Activation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecorationDescriptionImpl extends MinimalEObjectImpl.Container implements DecorationDescription
{
  /**
   * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStereotype()
   * @generated
   * @ordered
   */
  protected Stereotype stereotype;

  /**
   * The cached value of the '{@link #getDecorations() <em>Decorations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecorations()
   * @generated
   * @ordered
   */
  protected EList<Decoration> decorations;

  /**
   * The cached value of the '{@link #getActivation() <em>Activation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivation()
   * @generated
   * @ordered
   */
  protected Activation activation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecorationDescriptionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DecorationLanguagePackage.Literals.DECORATION_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stereotype getStereotype()
  {
    if (stereotype != null && stereotype.eIsProxy())
    {
      InternalEObject oldStereotype = (InternalEObject)stereotype;
      stereotype = (Stereotype)eResolveProxy(oldStereotype);
      if (stereotype != oldStereotype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DecorationLanguagePackage.DECORATION_DESCRIPTION__STEREOTYPE, oldStereotype, stereotype));
      }
    }
    return stereotype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stereotype basicGetStereotype()
  {
    return stereotype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStereotype(Stereotype newStereotype)
  {
    Stereotype oldStereotype = stereotype;
    stereotype = newStereotype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.DECORATION_DESCRIPTION__STEREOTYPE, oldStereotype, stereotype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Decoration> getDecorations()
  {
    if (decorations == null)
    {
      decorations = new EObjectContainmentEList<Decoration>(Decoration.class, this, DecorationLanguagePackage.DECORATION_DESCRIPTION__DECORATIONS);
    }
    return decorations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activation getActivation()
  {
    return activation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActivation(Activation newActivation, NotificationChain msgs)
  {
    Activation oldActivation = activation;
    activation = newActivation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVATION, oldActivation, newActivation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActivation(Activation newActivation)
  {
    if (newActivation != activation)
    {
      NotificationChain msgs = null;
      if (activation != null)
        msgs = ((InternalEObject)activation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVATION, null, msgs);
      if (newActivation != null)
        msgs = ((InternalEObject)newActivation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVATION, null, msgs);
      msgs = basicSetActivation(newActivation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVATION, newActivation, newActivation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__DECORATIONS:
        return ((InternalEList<?>)getDecorations()).basicRemove(otherEnd, msgs);
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVATION:
        return basicSetActivation(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__STEREOTYPE:
        if (resolve) return getStereotype();
        return basicGetStereotype();
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__DECORATIONS:
        return getDecorations();
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVATION:
        return getActivation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__STEREOTYPE:
        setStereotype((Stereotype)newValue);
        return;
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__DECORATIONS:
        getDecorations().clear();
        getDecorations().addAll((Collection<? extends Decoration>)newValue);
        return;
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVATION:
        setActivation((Activation)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__STEREOTYPE:
        setStereotype((Stereotype)null);
        return;
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__DECORATIONS:
        getDecorations().clear();
        return;
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVATION:
        setActivation((Activation)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__STEREOTYPE:
        return stereotype != null;
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__DECORATIONS:
        return decorations != null && !decorations.isEmpty();
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVATION:
        return activation != null;
    }
    return super.eIsSet(featureID);
  }

} //DecorationDescriptionImpl
