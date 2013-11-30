/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Decoration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration#getLocation_uri <em>Location uri</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration#getTooltip <em>Tooltip</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getImageDecoration()
 * @model
 * @generated
 */
public interface ImageDecoration extends AbstractDecoration
{
  /**
   * Returns the value of the '<em><b>Location uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location uri</em>' attribute.
   * @see #setLocation_uri(String)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getImageDecoration_Location_uri()
   * @model
   * @generated
   */
  String getLocation_uri();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration#getLocation_uri <em>Location uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location uri</em>' attribute.
   * @see #getLocation_uri()
   * @generated
   */
  void setLocation_uri(String value);

  /**
   * Returns the value of the '<em><b>Direction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' containment reference.
   * @see #setDirection(Direction)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getImageDecoration_Direction()
   * @model containment="true"
   * @generated
   */
  Direction getDirection();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration#getDirection <em>Direction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' containment reference.
   * @see #getDirection()
   * @generated
   */
  void setDirection(Direction value);

  /**
   * Returns the value of the '<em><b>Margin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Margin</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Margin</em>' containment reference.
   * @see #setMargin(Margin)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getImageDecoration_Margin()
   * @model containment="true"
   * @generated
   */
  Margin getMargin();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration#getMargin <em>Margin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Margin</em>' containment reference.
   * @see #getMargin()
   * @generated
   */
  void setMargin(Margin value);

  /**
   * Returns the value of the '<em><b>Tooltip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tooltip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tooltip</em>' containment reference.
   * @see #setTooltip(Text)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getImageDecoration_Tooltip()
   * @model containment="true"
   * @generated
   */
  Text getTooltip();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration#getTooltip <em>Tooltip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tooltip</em>' containment reference.
   * @see #getTooltip()
   * @generated
   */
  void setTooltip(Text value);

} // ImageDecoration
