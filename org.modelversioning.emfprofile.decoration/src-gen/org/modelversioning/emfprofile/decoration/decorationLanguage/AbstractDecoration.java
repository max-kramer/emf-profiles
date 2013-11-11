/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Decoration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration#getActivation <em>Activation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getAbstractDecoration()
 * @model
 * @generated
 */
public interface AbstractDecoration extends EObject
{
  /**
   * Returns the value of the '<em><b>Activation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activation</em>' containment reference.
   * @see #setActivation(Activation)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getAbstractDecoration_Activation()
   * @model containment="true"
   * @generated
   */
  Activation getActivation();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration#getActivation <em>Activation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activation</em>' containment reference.
   * @see #getActivation()
   * @generated
   */
  void setActivation(Activation value);

} // AbstractDecoration
