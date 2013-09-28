/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Profile Decoration Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.EMFProfileDecorationModel#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.EMFProfileDecorationModel#getDecorations <em>Decorations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getEMFProfileDecorationModel()
 * @model
 * @generated
 */
public interface EMFProfileDecorationModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' attribute.
   * @see #setImportURI(String)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getEMFProfileDecorationModel_ImportURI()
   * @model
   * @generated
   */
  String getImportURI();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.EMFProfileDecorationModel#getImportURI <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import URI</em>' attribute.
   * @see #getImportURI()
   * @generated
   */
  void setImportURI(String value);

  /**
   * Returns the value of the '<em><b>Decorations</b></em>' containment reference list.
   * The list contents are of type {@link org.modelversioning.emfprofile.decoration.decorationLanguage.Decoration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decorations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decorations</em>' containment reference list.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getEMFProfileDecorationModel_Decorations()
   * @model containment="true"
   * @generated
   */
  EList<Decoration> getDecorations();

} // EMFProfileDecorationModel
