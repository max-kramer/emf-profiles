/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.modelversioning.emfprofile.Stereotype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decoration Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription#getDecorations <em>Decorations</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription#getActive <em>Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getDecorationDescription()
 * @model
 * @generated
 */
public interface DecorationDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Stereotype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stereotype</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stereotype</em>' reference.
   * @see #setStereotype(Stereotype)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getDecorationDescription_Stereotype()
   * @model
   * @generated
   */
  Stereotype getStereotype();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription#getStereotype <em>Stereotype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stereotype</em>' reference.
   * @see #getStereotype()
   * @generated
   */
  void setStereotype(Stereotype value);

  /**
   * Returns the value of the '<em><b>Decorations</b></em>' containment reference list.
   * The list contents are of type {@link org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decorations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decorations</em>' containment reference list.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getDecorationDescription_Decorations()
   * @model containment="true"
   * @generated
   */
  EList<AbstractDecoration> getDecorations();

  /**
   * Returns the value of the '<em><b>Active</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Active</em>' containment reference.
   * @see #setActive(Activation)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getDecorationDescription_Active()
   * @model containment="true"
   * @generated
   */
  Activation getActive();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription#getActive <em>Active</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Active</em>' containment reference.
   * @see #getActive()
   * @generated
   */
  void setActive(Activation value);

} // DecorationDescription
