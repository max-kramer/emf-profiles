/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background Decoration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BackgroundDecoration#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBackgroundDecoration()
 * @model
 * @generated
 */
public interface BackgroundDecoration extends AbstractDecoration
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(Color)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBackgroundDecoration_Color()
   * @model containment="true"
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BackgroundDecoration#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

} // BackgroundDecoration
