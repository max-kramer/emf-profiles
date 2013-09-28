/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;

import org.eclipse.emf.ecore.EObject;

import org.modelversioning.emfprofile.Stereotype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decoration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Decoration#getDecorations <em>Decorations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getDecoration()
 * @model
 * @generated
 */
public interface Decoration extends EObject
{
  /**
   * Returns the value of the '<em><b>Decorations</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decorations</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decorations</em>' reference.
   * @see #setDecorations(Stereotype)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getDecoration_Decorations()
   * @model
   * @generated
   */
  Stereotype getDecorations();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Decoration#getDecorations <em>Decorations</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decorations</em>' reference.
   * @see #getDecorations()
   * @generated
   */
  void setDecorations(Stereotype value);

} // Decoration
