/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ComplexText#getLeft <em>Left</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ComplexText#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getComplexText()
 * @model
 * @generated
 */
public interface ComplexText extends Text
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(SimpleText)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getComplexText_Left()
   * @model containment="true"
   * @generated
   */
  SimpleText getLeft();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ComplexText#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(SimpleText value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Text)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getComplexText_Right()
   * @model containment="true"
   * @generated
   */
  Text getRight();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ComplexText#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Text value);

} // ComplexText
