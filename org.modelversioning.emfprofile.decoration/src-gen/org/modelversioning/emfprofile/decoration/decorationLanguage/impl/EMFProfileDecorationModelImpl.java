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

import org.modelversioning.emfprofile.decoration.decorationLanguage.Decoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage;
import org.modelversioning.emfprofile.decoration.decorationLanguage.EMFProfileDecorationModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Profile Decoration Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.EMFProfileDecorationModelImpl#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.EMFProfileDecorationModelImpl#getDecorations <em>Decorations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMFProfileDecorationModelImpl extends MinimalEObjectImpl.Container implements EMFProfileDecorationModel
{
  /**
   * The default value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportURI()
   * @generated
   * @ordered
   */
  protected static final String IMPORT_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportURI()
   * @generated
   * @ordered
   */
  protected String importURI = IMPORT_URI_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMFProfileDecorationModelImpl()
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
    return DecorationLanguagePackage.Literals.EMF_PROFILE_DECORATION_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportURI()
  {
    return importURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportURI(String newImportURI)
  {
    String oldImportURI = importURI;
    importURI = newImportURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.EMF_PROFILE_DECORATION_MODEL__IMPORT_URI, oldImportURI, importURI));
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
      decorations = new EObjectContainmentEList<Decoration>(Decoration.class, this, DecorationLanguagePackage.EMF_PROFILE_DECORATION_MODEL__DECORATIONS);
    }
    return decorations;
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
      case DecorationLanguagePackage.EMF_PROFILE_DECORATION_MODEL__DECORATIONS:
        return ((InternalEList<?>)getDecorations()).basicRemove(otherEnd, msgs);
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
      case DecorationLanguagePackage.EMF_PROFILE_DECORATION_MODEL__IMPORT_URI:
        return getImportURI();
      case DecorationLanguagePackage.EMF_PROFILE_DECORATION_MODEL__DECORATIONS:
        return getDecorations();
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
      case DecorationLanguagePackage.EMF_PROFILE_DECORATION_MODEL__IMPORT_URI:
        setImportURI((String)newValue);
        return;
      case DecorationLanguagePackage.EMF_PROFILE_DECORATION_MODEL__DECORATIONS:
        getDecorations().clear();
        getDecorations().addAll((Collection<? extends Decoration>)newValue);
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
      case DecorationLanguagePackage.EMF_PROFILE_DECORATION_MODEL__IMPORT_URI:
        setImportURI(IMPORT_URI_EDEFAULT);
        return;
      case DecorationLanguagePackage.EMF_PROFILE_DECORATION_MODEL__DECORATIONS:
        getDecorations().clear();
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
      case DecorationLanguagePackage.EMF_PROFILE_DECORATION_MODEL__IMPORT_URI:
        return IMPORT_URI_EDEFAULT == null ? importURI != null : !IMPORT_URI_EDEFAULT.equals(importURI);
      case DecorationLanguagePackage.EMF_PROFILE_DECORATION_MODEL__DECORATIONS:
        return decorations != null && !decorations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (importURI: ");
    result.append(importURI);
    result.append(')');
    return result.toString();
  }

} //EMFProfileDecorationModelImpl
