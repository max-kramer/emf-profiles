/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImage;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImageOrientation;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Box Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxImageImpl#getLocation_uri <em>Location uri</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxImageImpl#getPlacement <em>Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoxImageImpl extends MinimalEObjectImpl.Container implements BoxImage
{
  /**
   * The default value of the '{@link #getLocation_uri() <em>Location uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation_uri()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation_uri() <em>Location uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation_uri()
   * @generated
   * @ordered
   */
  protected String location_uri = LOCATION_URI_EDEFAULT;

  /**
   * The default value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlacement()
   * @generated
   * @ordered
   */
  protected static final BoxImageOrientation PLACEMENT_EDEFAULT = BoxImageOrientation.WEST;

  /**
   * The cached value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlacement()
   * @generated
   * @ordered
   */
  protected BoxImageOrientation placement = PLACEMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BoxImageImpl()
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
    return DecorationLanguagePackage.Literals.BOX_IMAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocation_uri()
  {
    return location_uri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation_uri(String newLocation_uri)
  {
    String oldLocation_uri = location_uri;
    location_uri = newLocation_uri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_IMAGE__LOCATION_URI, oldLocation_uri, location_uri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoxImageOrientation getPlacement()
  {
    return placement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlacement(BoxImageOrientation newPlacement)
  {
    BoxImageOrientation oldPlacement = placement;
    placement = newPlacement == null ? PLACEMENT_EDEFAULT : newPlacement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_IMAGE__PLACEMENT, oldPlacement, placement));
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
      case DecorationLanguagePackage.BOX_IMAGE__LOCATION_URI:
        return getLocation_uri();
      case DecorationLanguagePackage.BOX_IMAGE__PLACEMENT:
        return getPlacement();
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
      case DecorationLanguagePackage.BOX_IMAGE__LOCATION_URI:
        setLocation_uri((String)newValue);
        return;
      case DecorationLanguagePackage.BOX_IMAGE__PLACEMENT:
        setPlacement((BoxImageOrientation)newValue);
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
      case DecorationLanguagePackage.BOX_IMAGE__LOCATION_URI:
        setLocation_uri(LOCATION_URI_EDEFAULT);
        return;
      case DecorationLanguagePackage.BOX_IMAGE__PLACEMENT:
        setPlacement(PLACEMENT_EDEFAULT);
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
      case DecorationLanguagePackage.BOX_IMAGE__LOCATION_URI:
        return LOCATION_URI_EDEFAULT == null ? location_uri != null : !LOCATION_URI_EDEFAULT.equals(location_uri);
      case DecorationLanguagePackage.BOX_IMAGE__PLACEMENT:
        return placement != PLACEMENT_EDEFAULT;
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
    result.append(" (location_uri: ");
    result.append(location_uri);
    result.append(", placement: ");
    result.append(placement);
    result.append(')');
    return result.toString();
  }

} //BoxImageImpl
