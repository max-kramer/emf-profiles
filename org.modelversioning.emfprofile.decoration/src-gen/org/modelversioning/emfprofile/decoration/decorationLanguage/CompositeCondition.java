/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getCompositeCondition()
 * @model
 * @generated
 */
public interface CompositeCondition extends AbstractCondition
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.modelversioning.emfprofile.decoration.decorationLanguage.LogicalOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.LogicalOperator
   * @see #setOperator(LogicalOperator)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getCompositeCondition_Operator()
   * @model
   * @generated
   */
  LogicalOperator getOperator();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.LogicalOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(LogicalOperator value);

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getCompositeCondition_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<AbstractCondition> getConditions();

} // CompositeCondition
