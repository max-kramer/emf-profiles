/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Direction;
import org.modelversioning.emfprofile.decoration.decorationLanguage.IconDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Margin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Icon Decoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.IconDecorationImpl#getLocation_uri <em>Location uri</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.IconDecorationImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.IconDecorationImpl#getMargin <em>Margin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IconDecorationImpl extends AbstractDecorationImpl implements IconDecoration
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
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected Direction direction;

  /**
   * The cached value of the '{@link #getMargin() <em>Margin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMargin()
   * @generated
   * @ordered
   */
  protected Margin margin;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IconDecorationImpl()
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
    return DecorationLanguagePackage.Literals.ICON_DECORATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.ICON_DECORATION__LOCATION_URI, oldLocation_uri, location_uri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirection(Direction newDirection, NotificationChain msgs)
  {
    Direction oldDirection = direction;
    direction = newDirection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.ICON_DECORATION__DIRECTION, oldDirection, newDirection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(Direction newDirection)
  {
    if (newDirection != direction)
    {
      NotificationChain msgs = null;
      if (direction != null)
        msgs = ((InternalEObject)direction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.ICON_DECORATION__DIRECTION, null, msgs);
      if (newDirection != null)
        msgs = ((InternalEObject)newDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.ICON_DECORATION__DIRECTION, null, msgs);
      msgs = basicSetDirection(newDirection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.ICON_DECORATION__DIRECTION, newDirection, newDirection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Margin getMargin()
  {
    return margin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMargin(Margin newMargin, NotificationChain msgs)
  {
    Margin oldMargin = margin;
    margin = newMargin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.ICON_DECORATION__MARGIN, oldMargin, newMargin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMargin(Margin newMargin)
  {
    if (newMargin != margin)
    {
      NotificationChain msgs = null;
      if (margin != null)
        msgs = ((InternalEObject)margin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.ICON_DECORATION__MARGIN, null, msgs);
      if (newMargin != null)
        msgs = ((InternalEObject)newMargin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.ICON_DECORATION__MARGIN, null, msgs);
      msgs = basicSetMargin(newMargin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.ICON_DECORATION__MARGIN, newMargin, newMargin));
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
      case DecorationLanguagePackage.ICON_DECORATION__DIRECTION:
        return basicSetDirection(null, msgs);
      case DecorationLanguagePackage.ICON_DECORATION__MARGIN:
        return basicSetMargin(null, msgs);
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
      case DecorationLanguagePackage.ICON_DECORATION__LOCATION_URI:
        return getLocation_uri();
      case DecorationLanguagePackage.ICON_DECORATION__DIRECTION:
        return getDirection();
      case DecorationLanguagePackage.ICON_DECORATION__MARGIN:
        return getMargin();
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
      case DecorationLanguagePackage.ICON_DECORATION__LOCATION_URI:
        setLocation_uri((String)newValue);
        return;
      case DecorationLanguagePackage.ICON_DECORATION__DIRECTION:
        setDirection((Direction)newValue);
        return;
      case DecorationLanguagePackage.ICON_DECORATION__MARGIN:
        setMargin((Margin)newValue);
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
      case DecorationLanguagePackage.ICON_DECORATION__LOCATION_URI:
        setLocation_uri(LOCATION_URI_EDEFAULT);
        return;
      case DecorationLanguagePackage.ICON_DECORATION__DIRECTION:
        setDirection((Direction)null);
        return;
      case DecorationLanguagePackage.ICON_DECORATION__MARGIN:
        setMargin((Margin)null);
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
      case DecorationLanguagePackage.ICON_DECORATION__LOCATION_URI:
        return LOCATION_URI_EDEFAULT == null ? location_uri != null : !LOCATION_URI_EDEFAULT.equals(location_uri);
      case DecorationLanguagePackage.ICON_DECORATION__DIRECTION:
        return direction != null;
      case DecorationLanguagePackage.ICON_DECORATION__MARGIN:
        return margin != null;
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
    result.append(')');
    return result.toString();
  }

} //IconDecorationImpl
