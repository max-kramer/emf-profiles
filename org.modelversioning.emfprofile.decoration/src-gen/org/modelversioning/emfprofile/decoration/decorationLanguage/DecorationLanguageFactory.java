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
   * Returns a new object of class '<em>Decoration Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decoration Model</em>'.
   * @generated
   */
  DecorationModel createDecorationModel();

  /**
   * Returns a new object of class '<em>Namespace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace</em>'.
   * @generated
   */
  Namespace createNamespace();

  /**
   * Returns a new object of class '<em>Decoration Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decoration Description</em>'.
   * @generated
   */
  DecorationDescription createDecorationDescription();

  /**
   * Returns a new object of class '<em>Abstract Decoration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Decoration</em>'.
   * @generated
   */
  AbstractDecoration createAbstractDecoration();

  /**
   * Returns a new object of class '<em>Image Decoration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image Decoration</em>'.
   * @generated
   */
  ImageDecoration createImageDecoration();

  /**
   * Returns a new object of class '<em>Border Decoration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Border Decoration</em>'.
   * @generated
   */
  BorderDecoration createBorderDecoration();

  /**
   * Returns a new object of class '<em>Background Decoration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Background Decoration</em>'.
   * @generated
   */
  BackgroundDecoration createBackgroundDecoration();

  /**
   * Returns a new object of class '<em>Foreground Decoration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foreground Decoration</em>'.
   * @generated
   */
  ForegroundDecoration createForegroundDecoration();

  /**
   * Returns a new object of class '<em>Connection Decoration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connection Decoration</em>'.
   * @generated
   */
  ConnectionDecoration createConnectionDecoration();

  /**
   * Returns a new object of class '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text</em>'.
   * @generated
   */
  Text createText();

  /**
   * Returns a new object of class '<em>Simple Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Text</em>'.
   * @generated
   */
  SimpleText createSimpleText();

  /**
   * Returns a new object of class '<em>Complex Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Text</em>'.
   * @generated
   */
  ComplexText createComplexText();

  /**
   * Returns a new object of class '<em>Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Style</em>'.
   * @generated
   */
  Style createStyle();

  /**
   * Returns a new object of class '<em>Size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Size</em>'.
   * @generated
   */
  Size createSize();

  /**
   * Returns a new object of class '<em>Direction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direction</em>'.
   * @generated
   */
  Direction createDirection();

  /**
   * Returns a new object of class '<em>Margin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Margin</em>'.
   * @generated
   */
  Margin createMargin();

  /**
   * Returns a new object of class '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color</em>'.
   * @generated
   */
  Color createColor();

  /**
   * Returns a new object of class '<em>Concrete Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concrete Color</em>'.
   * @generated
   */
  ConcreteColor createConcreteColor();

  /**
   * Returns a new object of class '<em>Color Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Constant</em>'.
   * @generated
   */
  ColorConstant createColorConstant();

  /**
   * Returns a new object of class '<em>Activation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activation</em>'.
   * @generated
   */
  Activation createActivation();

  /**
   * Returns a new object of class '<em>Abstract Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Condition</em>'.
   * @generated
   */
  AbstractCondition createAbstractCondition();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Composite Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Condition</em>'.
   * @generated
   */
  CompositeCondition createCompositeCondition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DecorationLanguagePackage getDecorationLanguagePackage();

} //DecorationLanguageFactory
