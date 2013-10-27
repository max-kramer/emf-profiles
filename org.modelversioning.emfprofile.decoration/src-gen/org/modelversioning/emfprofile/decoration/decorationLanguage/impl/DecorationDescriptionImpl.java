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

import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Activation;
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
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationDescriptionImpl#getActive <em>Active</em>}</li>
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
  protected EList<AbstractDecoration> decorations;

  /**
   * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActive()
   * @generated
   * @ordered
   */
  protected Activation active;

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
  public EList<AbstractDecoration> getDecorations()
  {
    if (decorations == null)
    {
      decorations = new EObjectContainmentEList<AbstractDecoration>(AbstractDecoration.class, this, DecorationLanguagePackage.DECORATION_DESCRIPTION__DECORATIONS);
    }
    return decorations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activation getActive()
  {
    return active;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActive(Activation newActive, NotificationChain msgs)
  {
    Activation oldActive = active;
    active = newActive;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVE, oldActive, newActive);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActive(Activation newActive)
  {
    if (newActive != active)
    {
      NotificationChain msgs = null;
      if (active != null)
        msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVE, null, msgs);
      if (newActive != null)
        msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVE, null, msgs);
      msgs = basicSetActive(newActive, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVE, newActive, newActive));
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
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVE:
        return basicSetActive(null, msgs);
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
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVE:
        return getActive();
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
        getDecorations().addAll((Collection<? extends AbstractDecoration>)newValue);
        return;
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVE:
        setActive((Activation)newValue);
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
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVE:
        setActive((Activation)null);
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
      case DecorationLanguagePackage.DECORATION_DESCRIPTION__ACTIVE:
        return active != null;
    }
    return super.eIsSet(featureID);
  }

} //DecorationDescriptionImpl
