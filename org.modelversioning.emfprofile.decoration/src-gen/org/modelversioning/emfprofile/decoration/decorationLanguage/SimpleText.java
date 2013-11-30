/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.SimpleText#getText <em>Text</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.SimpleText#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getSimpleText()
 * @model
 * @generated
 */
public interface SimpleText extends Text
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getSimpleText_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.SimpleText#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(EAttribute)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getSimpleText_Attribute()
   * @model
   * @generated
   */
  EAttribute getAttribute();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.SimpleText#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(EAttribute value);

} // SimpleText
