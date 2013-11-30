/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorConstant;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConcreteColor;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ColorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ColorImpl#getConcrete <em>Concrete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorImpl extends MinimalEObjectImpl.Container implements Color
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ColorConstant value;

  /**
   * The cached value of the '{@link #getConcrete() <em>Concrete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcrete()
   * @generated
   * @ordered
   */
  protected ConcreteColor concrete;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColorImpl()
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
    return DecorationLanguagePackage.Literals.COLOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorConstant getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(ColorConstant newValue, NotificationChain msgs)
  {
    ColorConstant oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.COLOR__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ColorConstant newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.COLOR__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.COLOR__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.COLOR__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteColor getConcrete()
  {
    return concrete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConcrete(ConcreteColor newConcrete, NotificationChain msgs)
  {
    ConcreteColor oldConcrete = concrete;
    concrete = newConcrete;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.COLOR__CONCRETE, oldConcrete, newConcrete);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcrete(ConcreteColor newConcrete)
  {
    if (newConcrete != concrete)
    {
      NotificationChain msgs = null;
      if (concrete != null)
        msgs = ((InternalEObject)concrete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.COLOR__CONCRETE, null, msgs);
      if (newConcrete != null)
        msgs = ((InternalEObject)newConcrete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.COLOR__CONCRETE, null, msgs);
      msgs = basicSetConcrete(newConcrete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.COLOR__CONCRETE, newConcrete, newConcrete));
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
      case DecorationLanguagePackage.COLOR__VALUE:
        return basicSetValue(null, msgs);
      case DecorationLanguagePackage.COLOR__CONCRETE:
        return basicSetConcrete(null, msgs);
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
      case DecorationLanguagePackage.COLOR__VALUE:
        return getValue();
      case DecorationLanguagePackage.COLOR__CONCRETE:
        return getConcrete();
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
      case DecorationLanguagePackage.COLOR__VALUE:
        setValue((ColorConstant)newValue);
        return;
      case DecorationLanguagePackage.COLOR__CONCRETE:
        setConcrete((ConcreteColor)newValue);
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
      case DecorationLanguagePackage.COLOR__VALUE:
        setValue((ColorConstant)null);
        return;
      case DecorationLanguagePackage.COLOR__CONCRETE:
        setConcrete((ConcreteColor)null);
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
      case DecorationLanguagePackage.COLOR__VALUE:
        return value != null;
      case DecorationLanguagePackage.COLOR__CONCRETE:
        return concrete != null;
    }
    return super.eIsSet(featureID);
  }

} //ColorImpl
