/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Decoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ColorDecorationImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ColorDecorationImpl#getForeground <em>Foreground</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorDecorationImpl extends AbstractDecorationImpl implements ColorDecoration
{
  /**
   * The cached value of the '{@link #getBackground() <em>Background</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackground()
   * @generated
   * @ordered
   */
  protected Color background;

  /**
   * The cached value of the '{@link #getForeground() <em>Foreground</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeground()
   * @generated
   * @ordered
   */
  protected Color foreground;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColorDecorationImpl()
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
    return DecorationLanguagePackage.Literals.COLOR_DECORATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getBackground()
  {
    return background;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBackground(Color newBackground, NotificationChain msgs)
  {
    Color oldBackground = background;
    background = newBackground;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.COLOR_DECORATION__BACKGROUND, oldBackground, newBackground);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackground(Color newBackground)
  {
    if (newBackground != background)
    {
      NotificationChain msgs = null;
      if (background != null)
        msgs = ((InternalEObject)background).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.COLOR_DECORATION__BACKGROUND, null, msgs);
      if (newBackground != null)
        msgs = ((InternalEObject)newBackground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.COLOR_DECORATION__BACKGROUND, null, msgs);
      msgs = basicSetBackground(newBackground, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.COLOR_DECORATION__BACKGROUND, newBackground, newBackground));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getForeground()
  {
    return foreground;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForeground(Color newForeground, NotificationChain msgs)
  {
    Color oldForeground = foreground;
    foreground = newForeground;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.COLOR_DECORATION__FOREGROUND, oldForeground, newForeground);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForeground(Color newForeground)
  {
    if (newForeground != foreground)
    {
      NotificationChain msgs = null;
      if (foreground != null)
        msgs = ((InternalEObject)foreground).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.COLOR_DECORATION__FOREGROUND, null, msgs);
      if (newForeground != null)
        msgs = ((InternalEObject)newForeground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.COLOR_DECORATION__FOREGROUND, null, msgs);
      msgs = basicSetForeground(newForeground, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.COLOR_DECORATION__FOREGROUND, newForeground, newForeground));
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
      case DecorationLanguagePackage.COLOR_DECORATION__BACKGROUND:
        return basicSetBackground(null, msgs);
      case DecorationLanguagePackage.COLOR_DECORATION__FOREGROUND:
        return basicSetForeground(null, msgs);
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
      case DecorationLanguagePackage.COLOR_DECORATION__BACKGROUND:
        return getBackground();
      case DecorationLanguagePackage.COLOR_DECORATION__FOREGROUND:
        return getForeground();
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
      case DecorationLanguagePackage.COLOR_DECORATION__BACKGROUND:
        setBackground((Color)newValue);
        return;
      case DecorationLanguagePackage.COLOR_DECORATION__FOREGROUND:
        setForeground((Color)newValue);
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
      case DecorationLanguagePackage.COLOR_DECORATION__BACKGROUND:
        setBackground((Color)null);
        return;
      case DecorationLanguagePackage.COLOR_DECORATION__FOREGROUND:
        setForeground((Color)null);
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
      case DecorationLanguagePackage.COLOR_DECORATION__BACKGROUND:
        return background != null;
      case DecorationLanguagePackage.COLOR_DECORATION__FOREGROUND:
        return foreground != null;
    }
    return super.eIsSet(featureID);
  }

} //ColorDecorationImpl
