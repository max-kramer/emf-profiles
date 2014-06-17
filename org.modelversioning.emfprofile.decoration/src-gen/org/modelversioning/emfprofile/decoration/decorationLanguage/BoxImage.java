/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImage#getLocation_uri <em>Location uri</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImage#getPlacement <em>Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxImage()
 * @model
 * @generated
 */
public interface BoxImage extends EObject
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
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxImage_Location_uri()
   * @model
   * @generated
   */
  String getLocation_uri();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImage#getLocation_uri <em>Location uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location uri</em>' attribute.
   * @see #getLocation_uri()
   * @generated
   */
  void setLocation_uri(String value);

  /**
   * Returns the value of the '<em><b>Placement</b></em>' attribute.
   * The literals are from the enumeration {@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImageOrientation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Placement</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Placement</em>' attribute.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImageOrientation
   * @see #setPlacement(BoxImageOrientation)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxImage_Placement()
   * @model
   * @generated
   */
  BoxImageOrientation getPlacement();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImage#getPlacement <em>Placement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Placement</em>' attribute.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImageOrientation
   * @see #getPlacement()
   * @generated
   */
  void setPlacement(BoxImageOrientation value);

} // BoxImage
