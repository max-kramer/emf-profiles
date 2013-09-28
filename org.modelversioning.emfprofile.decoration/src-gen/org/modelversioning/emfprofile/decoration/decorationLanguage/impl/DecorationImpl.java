/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.modelversioning.emfprofile.Stereotype;

import org.modelversioning.emfprofile.decoration.decorationLanguage.Decoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationImpl#getDecorations <em>Decorations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecorationImpl extends MinimalEObjectImpl.Container implements Decoration
{
  /**
   * The cached value of the '{@link #getDecorations() <em>Decorations</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecorations()
   * @generated
   * @ordered
   */
  protected Stereotype decorations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecorationImpl()
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
    return DecorationLanguagePackage.Literals.DECORATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stereotype getDecorations()
  {
    if (decorations != null && decorations.eIsProxy())
    {
      InternalEObject oldDecorations = (InternalEObject)decorations;
      decorations = (Stereotype)eResolveProxy(oldDecorations);
      if (decorations != oldDecorations)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DecorationLanguagePackage.DECORATION__DECORATIONS, oldDecorations, decorations));
      }
    }
    return decorations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stereotype basicGetDecorations()
  {
    return decorations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecorations(Stereotype newDecorations)
  {
    Stereotype oldDecorations = decorations;
    decorations = newDecorations;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.DECORATION__DECORATIONS, oldDecorations, decorations));
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
      case DecorationLanguagePackage.DECORATION__DECORATIONS:
        if (resolve) return getDecorations();
        return basicGetDecorations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DecorationLanguagePackage.DECORATION__DECORATIONS:
        setDecorations((Stereotype)newValue);
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
      case DecorationLanguagePackage.DECORATION__DECORATIONS:
        setDecorations((Stereotype)null);
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
      case DecorationLanguagePackage.DECORATION__DECORATIONS:
        return decorations != null;
    }
    return super.eIsSet(featureID);
  }

} //DecorationImpl
