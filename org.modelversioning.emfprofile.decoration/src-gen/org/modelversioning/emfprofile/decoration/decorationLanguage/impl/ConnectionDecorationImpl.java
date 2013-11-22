/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConnectionDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Size;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Decoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ConnectionDecorationImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ConnectionDecorationImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ConnectionDecorationImpl#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ConnectionDecorationImpl#getBackgroundColor <em>Background Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionDecorationImpl extends AbstractDecorationImpl implements ConnectionDecoration
{
  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected Size size;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color;

  /**
   * The cached value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForegroundColor()
   * @generated
   * @ordered
   */
  protected Color foregroundColor;

  /**
   * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackgroundColor()
   * @generated
   * @ordered
   */
  protected Color backgroundColor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectionDecorationImpl()
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
    return DecorationLanguagePackage.Literals.CONNECTION_DECORATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSize(Size newSize, NotificationChain msgs)
  {
    Size oldSize = size;
    size = newSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.CONNECTION_DECORATION__SIZE, oldSize, newSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(Size newSize)
  {
    if (newSize != size)
    {
      NotificationChain msgs = null;
      if (size != null)
        msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.CONNECTION_DECORATION__SIZE, null, msgs);
      if (newSize != null)
        msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.CONNECTION_DECORATION__SIZE, null, msgs);
      msgs = basicSetSize(newSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.CONNECTION_DECORATION__SIZE, newSize, newSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColor(Color newColor, NotificationChain msgs)
  {
    Color oldColor = color;
    color = newColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.CONNECTION_DECORATION__COLOR, oldColor, newColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(Color newColor)
  {
    if (newColor != color)
    {
      NotificationChain msgs = null;
      if (color != null)
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.CONNECTION_DECORATION__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.CONNECTION_DECORATION__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.CONNECTION_DECORATION__COLOR, newColor, newColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getForegroundColor()
  {
    return foregroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForegroundColor(Color newForegroundColor, NotificationChain msgs)
  {
    Color oldForegroundColor = foregroundColor;
    foregroundColor = newForegroundColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.CONNECTION_DECORATION__FOREGROUND_COLOR, oldForegroundColor, newForegroundColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForegroundColor(Color newForegroundColor)
  {
    if (newForegroundColor != foregroundColor)
    {
      NotificationChain msgs = null;
      if (foregroundColor != null)
        msgs = ((InternalEObject)foregroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.CONNECTION_DECORATION__FOREGROUND_COLOR, null, msgs);
      if (newForegroundColor != null)
        msgs = ((InternalEObject)newForegroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.CONNECTION_DECORATION__FOREGROUND_COLOR, null, msgs);
      msgs = basicSetForegroundColor(newForegroundColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.CONNECTION_DECORATION__FOREGROUND_COLOR, newForegroundColor, newForegroundColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getBackgroundColor()
  {
    return backgroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBackgroundColor(Color newBackgroundColor, NotificationChain msgs)
  {
    Color oldBackgroundColor = backgroundColor;
    backgroundColor = newBackgroundColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.CONNECTION_DECORATION__BACKGROUND_COLOR, oldBackgroundColor, newBackgroundColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackgroundColor(Color newBackgroundColor)
  {
    if (newBackgroundColor != backgroundColor)
    {
      NotificationChain msgs = null;
      if (backgroundColor != null)
        msgs = ((InternalEObject)backgroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.CONNECTION_DECORATION__BACKGROUND_COLOR, null, msgs);
      if (newBackgroundColor != null)
        msgs = ((InternalEObject)newBackgroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.CONNECTION_DECORATION__BACKGROUND_COLOR, null, msgs);
      msgs = basicSetBackgroundColor(newBackgroundColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.CONNECTION_DECORATION__BACKGROUND_COLOR, newBackgroundColor, newBackgroundColor));
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
      case DecorationLanguagePackage.CONNECTION_DECORATION__SIZE:
        return basicSetSize(null, msgs);
      case DecorationLanguagePackage.CONNECTION_DECORATION__COLOR:
        return basicSetColor(null, msgs);
      case DecorationLanguagePackage.CONNECTION_DECORATION__FOREGROUND_COLOR:
        return basicSetForegroundColor(null, msgs);
      case DecorationLanguagePackage.CONNECTION_DECORATION__BACKGROUND_COLOR:
        return basicSetBackgroundColor(null, msgs);
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
      case DecorationLanguagePackage.CONNECTION_DECORATION__SIZE:
        return getSize();
      case DecorationLanguagePackage.CONNECTION_DECORATION__COLOR:
        return getColor();
      case DecorationLanguagePackage.CONNECTION_DECORATION__FOREGROUND_COLOR:
        return getForegroundColor();
      case DecorationLanguagePackage.CONNECTION_DECORATION__BACKGROUND_COLOR:
        return getBackgroundColor();
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
      case DecorationLanguagePackage.CONNECTION_DECORATION__SIZE:
        setSize((Size)newValue);
        return;
      case DecorationLanguagePackage.CONNECTION_DECORATION__COLOR:
        setColor((Color)newValue);
        return;
      case DecorationLanguagePackage.CONNECTION_DECORATION__FOREGROUND_COLOR:
        setForegroundColor((Color)newValue);
        return;
      case DecorationLanguagePackage.CONNECTION_DECORATION__BACKGROUND_COLOR:
        setBackgroundColor((Color)newValue);
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
      case DecorationLanguagePackage.CONNECTION_DECORATION__SIZE:
        setSize((Size)null);
        return;
      case DecorationLanguagePackage.CONNECTION_DECORATION__COLOR:
        setColor((Color)null);
        return;
      case DecorationLanguagePackage.CONNECTION_DECORATION__FOREGROUND_COLOR:
        setForegroundColor((Color)null);
        return;
      case DecorationLanguagePackage.CONNECTION_DECORATION__BACKGROUND_COLOR:
        setBackgroundColor((Color)null);
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
      case DecorationLanguagePackage.CONNECTION_DECORATION__SIZE:
        return size != null;
      case DecorationLanguagePackage.CONNECTION_DECORATION__COLOR:
        return color != null;
      case DecorationLanguagePackage.CONNECTION_DECORATION__FOREGROUND_COLOR:
        return foregroundColor != null;
      case DecorationLanguagePackage.CONNECTION_DECORATION__BACKGROUND_COLOR:
        return backgroundColor != null;
    }
    return super.eIsSet(featureID);
  }

} //ConnectionDecorationImpl
