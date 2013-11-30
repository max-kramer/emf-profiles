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
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Margin;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Decoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ImageDecorationImpl#getLocation_uri <em>Location uri</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ImageDecorationImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ImageDecorationImpl#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ImageDecorationImpl#getTooltip <em>Tooltip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageDecorationImpl extends AbstractDecorationImpl implements ImageDecoration
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
   * The cached value of the '{@link #getTooltip() <em>Tooltip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTooltip()
   * @generated
   * @ordered
   */
  protected Text tooltip;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageDecorationImpl()
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
    return DecorationLanguagePackage.Literals.IMAGE_DECORATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.IMAGE_DECORATION__LOCATION_URI, oldLocation_uri, location_uri));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.IMAGE_DECORATION__DIRECTION, oldDirection, newDirection);
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
        msgs = ((InternalEObject)direction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.IMAGE_DECORATION__DIRECTION, null, msgs);
      if (newDirection != null)
        msgs = ((InternalEObject)newDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.IMAGE_DECORATION__DIRECTION, null, msgs);
      msgs = basicSetDirection(newDirection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.IMAGE_DECORATION__DIRECTION, newDirection, newDirection));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.IMAGE_DECORATION__MARGIN, oldMargin, newMargin);
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
        msgs = ((InternalEObject)margin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.IMAGE_DECORATION__MARGIN, null, msgs);
      if (newMargin != null)
        msgs = ((InternalEObject)newMargin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.IMAGE_DECORATION__MARGIN, null, msgs);
      msgs = basicSetMargin(newMargin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.IMAGE_DECORATION__MARGIN, newMargin, newMargin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text getTooltip()
  {
    return tooltip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTooltip(Text newTooltip, NotificationChain msgs)
  {
    Text oldTooltip = tooltip;
    tooltip = newTooltip;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.IMAGE_DECORATION__TOOLTIP, oldTooltip, newTooltip);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTooltip(Text newTooltip)
  {
    if (newTooltip != tooltip)
    {
      NotificationChain msgs = null;
      if (tooltip != null)
        msgs = ((InternalEObject)tooltip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.IMAGE_DECORATION__TOOLTIP, null, msgs);
      if (newTooltip != null)
        msgs = ((InternalEObject)newTooltip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.IMAGE_DECORATION__TOOLTIP, null, msgs);
      msgs = basicSetTooltip(newTooltip, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.IMAGE_DECORATION__TOOLTIP, newTooltip, newTooltip));
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
      case DecorationLanguagePackage.IMAGE_DECORATION__DIRECTION:
        return basicSetDirection(null, msgs);
      case DecorationLanguagePackage.IMAGE_DECORATION__MARGIN:
        return basicSetMargin(null, msgs);
      case DecorationLanguagePackage.IMAGE_DECORATION__TOOLTIP:
        return basicSetTooltip(null, msgs);
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
      case DecorationLanguagePackage.IMAGE_DECORATION__LOCATION_URI:
        return getLocation_uri();
      case DecorationLanguagePackage.IMAGE_DECORATION__DIRECTION:
        return getDirection();
      case DecorationLanguagePackage.IMAGE_DECORATION__MARGIN:
        return getMargin();
      case DecorationLanguagePackage.IMAGE_DECORATION__TOOLTIP:
        return getTooltip();
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
      case DecorationLanguagePackage.IMAGE_DECORATION__LOCATION_URI:
        setLocation_uri((String)newValue);
        return;
      case DecorationLanguagePackage.IMAGE_DECORATION__DIRECTION:
        setDirection((Direction)newValue);
        return;
      case DecorationLanguagePackage.IMAGE_DECORATION__MARGIN:
        setMargin((Margin)newValue);
        return;
      case DecorationLanguagePackage.IMAGE_DECORATION__TOOLTIP:
        setTooltip((Text)newValue);
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
      case DecorationLanguagePackage.IMAGE_DECORATION__LOCATION_URI:
        setLocation_uri(LOCATION_URI_EDEFAULT);
        return;
      case DecorationLanguagePackage.IMAGE_DECORATION__DIRECTION:
        setDirection((Direction)null);
        return;
      case DecorationLanguagePackage.IMAGE_DECORATION__MARGIN:
        setMargin((Margin)null);
        return;
      case DecorationLanguagePackage.IMAGE_DECORATION__TOOLTIP:
        setTooltip((Text)null);
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
      case DecorationLanguagePackage.IMAGE_DECORATION__LOCATION_URI:
        return LOCATION_URI_EDEFAULT == null ? location_uri != null : !LOCATION_URI_EDEFAULT.equals(location_uri);
      case DecorationLanguagePackage.IMAGE_DECORATION__DIRECTION:
        return direction != null;
      case DecorationLanguagePackage.IMAGE_DECORATION__MARGIN:
        return margin != null;
      case DecorationLanguagePackage.IMAGE_DECORATION__TOOLTIP:
        return tooltip != null;
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

} //ImageDecorationImpl
