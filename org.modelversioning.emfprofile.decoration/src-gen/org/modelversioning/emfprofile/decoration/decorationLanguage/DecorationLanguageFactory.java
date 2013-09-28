/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage
 * @generated
 */
public interface DecorationLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DecorationLanguageFactory eINSTANCE = org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>EMF Profile Decoration Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMF Profile Decoration Model</em>'.
   * @generated
   */
  EMFProfileDecorationModel createEMFProfileDecorationModel();

  /**
   * Returns a new object of class '<em>Decoration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decoration</em>'.
   * @generated
   */
  Decoration createDecoration();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DecorationLanguagePackage getDecorationLanguagePackage();

} //DecorationLanguageFactory
