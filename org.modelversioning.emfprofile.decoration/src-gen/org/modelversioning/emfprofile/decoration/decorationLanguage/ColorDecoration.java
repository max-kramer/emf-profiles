/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Decoration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration#getBackground <em>Background</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration#getForeground <em>Foreground</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getColorDecoration()
 * @model
 * @generated
 */
public interface ColorDecoration extends AbstractDecoration
{
  /**
   * Returns the value of the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Background</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Background</em>' containment reference.
   * @see #setBackground(Color)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getColorDecoration_Background()
   * @model containment="true"
   * @generated
   */
  Color getBackground();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration#getBackground <em>Background</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Background</em>' containment reference.
   * @see #getBackground()
   * @generated
   */
  void setBackground(Color value);

  /**
   * Returns the value of the '<em><b>Foreground</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreground</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreground</em>' containment reference.
   * @see #setForeground(Color)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getColorDecoration_Foreground()
   * @model containment="true"
   * @generated
   */
  Color getForeground();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration#getForeground <em>Foreground</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreground</em>' containment reference.
   * @see #getForeground()
   * @generated
   */
  void setForeground(Color value);

} // ColorDecoration
