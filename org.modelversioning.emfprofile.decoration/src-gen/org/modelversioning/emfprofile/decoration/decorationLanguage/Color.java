/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Color#getValue <em>Value</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Color#getConcrete <em>Concrete</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getColor()
 * @model
 * @generated
 */
public interface Color extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ColorConstant)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getColor_Value()
   * @model containment="true"
   * @generated
   */
  ColorConstant getValue();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Color#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ColorConstant value);

  /**
   * Returns the value of the '<em><b>Concrete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete</em>' containment reference.
   * @see #setConcrete(ConcreteColor)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getColor_Concrete()
   * @model containment="true"
   * @generated
   */
  ConcreteColor getConcrete();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Color#getConcrete <em>Concrete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concrete</em>' containment reference.
   * @see #getConcrete()
   * @generated
   */
  void setConcrete(ConcreteColor value);

} // Color
