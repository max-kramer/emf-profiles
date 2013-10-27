/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface DecorationLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "decorationLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.modelversioning.org/emfprofile/decoration/EMFProfileDecorationLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "decorationLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DecorationLanguagePackage eINSTANCE = org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationModelImpl <em>Decoration Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationModelImpl
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getDecorationModel()
   * @generated
   */
  int DECORATION_MODEL = 0;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATION_MODEL__IMPORT_URI = 0;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATION_MODEL__NAMESPACE = 1;

  /**
   * The feature id for the '<em><b>Decoration Descriptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATION_MODEL__DECORATION_DESCRIPTIONS = 2;

  /**
   * The number of structural features of the '<em>Decoration Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATION_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.NamespaceImpl <em>Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.NamespaceImpl
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getNamespace()
   * @generated
   */
  int NAMESPACE = 1;

  /**
   * The feature id for the '<em><b>Profile</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__PROFILE = 0;

  /**
   * The number of structural features of the '<em>Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationDescriptionImpl <em>Decoration Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationDescriptionImpl
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getDecorationDescription()
   * @generated
   */
  int DECORATION_DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Stereotype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATION_DESCRIPTION__STEREOTYPE = 0;

  /**
   * The feature id for the '<em><b>Decorations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATION_DESCRIPTION__DECORATIONS = 1;

  /**
   * The feature id for the '<em><b>Active</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATION_DESCRIPTION__ACTIVE = 2;

  /**
   * The number of structural features of the '<em>Decoration Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECORATION_DESCRIPTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.AbstractDecorationImpl <em>Abstract Decoration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.AbstractDecorationImpl
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getAbstractDecoration()
   * @generated
   */
  int ABSTRACT_DECORATION = 3;

  /**
   * The feature id for the '<em><b>Active</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DECORATION__ACTIVE = 0;

  /**
   * The number of structural features of the '<em>Abstract Decoration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DECORATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.IconDecorationImpl <em>Icon Decoration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.IconDecorationImpl
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getIconDecoration()
   * @generated
   */
  int ICON_DECORATION = 4;

  /**
   * The feature id for the '<em><b>Active</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICON_DECORATION__ACTIVE = ABSTRACT_DECORATION__ACTIVE;

  /**
   * The feature id for the '<em><b>Location uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICON_DECORATION__LOCATION_URI = ABSTRACT_DECORATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Icon Decoration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICON_DECORATION_FEATURE_COUNT = ABSTRACT_DECORATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BorderDecorationImpl <em>Border Decoration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BorderDecorationImpl
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getBorderDecoration()
   * @generated
   */
  int BORDER_DECORATION = 5;

  /**
   * The feature id for the '<em><b>Active</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_DECORATION__ACTIVE = ABSTRACT_DECORATION__ACTIVE;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_DECORATION__SIZE = ABSTRACT_DECORATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Border Decoration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_DECORATION_FEATURE_COUNT = ABSTRACT_DECORATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ActivationImpl <em>Activation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ActivationImpl
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getActivation()
   * @generated
   */
  int ACTIVATION = 6;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVATION__CONDITION = 0;

  /**
   * The number of structural features of the '<em>Activation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.AbstractConditionImpl <em>Abstract Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.AbstractConditionImpl
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getAbstractCondition()
   * @generated
   */
  int ABSTRACT_CONDITION = 7;

  /**
   * The number of structural features of the '<em>Abstract Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONDITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ConditionImpl
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 8;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__ATTRIBUTE = ABSTRACT_CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OPERATOR = ABSTRACT_CONDITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__VALUE = ABSTRACT_CONDITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = ABSTRACT_CONDITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.CompositeConditionImpl
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getCompositeCondition()
   * @generated
   */
  int COMPOSITE_CONDITION = 9;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_CONDITION__OPERATOR = ABSTRACT_CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_CONDITION__CONDITIONS = ABSTRACT_CONDITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Composite Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_CONDITION_FEATURE_COUNT = ABSTRACT_CONDITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ComparisonOperator <em>Comparison Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.ComparisonOperator
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getComparisonOperator()
   * @generated
   */
  int COMPARISON_OPERATOR = 10;

  /**
   * The meta object id for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.LogicalOperator <em>Logical Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.LogicalOperator
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getLogicalOperator()
   * @generated
   */
  int LOGICAL_OPERATOR = 11;


  /**
   * Returns the meta object for class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel <em>Decoration Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decoration Model</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel
   * @generated
   */
  EClass getDecorationModel();

  /**
   * Returns the meta object for the attribute '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel#getImportURI()
   * @see #getDecorationModel()
   * @generated
   */
  EAttribute getDecorationModel_ImportURI();

  /**
   * Returns the meta object for the containment reference '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel#getNamespace()
   * @see #getDecorationModel()
   * @generated
   */
  EReference getDecorationModel_Namespace();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel#getDecorationDescriptions <em>Decoration Descriptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decoration Descriptions</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel#getDecorationDescriptions()
   * @see #getDecorationModel()
   * @generated
   */
  EReference getDecorationModel_DecorationDescriptions();

  /**
   * Returns the meta object for class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Namespace
   * @generated
   */
  EClass getNamespace();

  /**
   * Returns the meta object for the reference '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Namespace#getProfile <em>Profile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Profile</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Namespace#getProfile()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_Profile();

  /**
   * Returns the meta object for class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription <em>Decoration Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decoration Description</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription
   * @generated
   */
  EClass getDecorationDescription();

  /**
   * Returns the meta object for the reference '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription#getStereotype <em>Stereotype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stereotype</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription#getStereotype()
   * @see #getDecorationDescription()
   * @generated
   */
  EReference getDecorationDescription_Stereotype();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription#getDecorations <em>Decorations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decorations</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription#getDecorations()
   * @see #getDecorationDescription()
   * @generated
   */
  EReference getDecorationDescription_Decorations();

  /**
   * Returns the meta object for the containment reference '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription#getActive <em>Active</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Active</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription#getActive()
   * @see #getDecorationDescription()
   * @generated
   */
  EReference getDecorationDescription_Active();

  /**
   * Returns the meta object for class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration <em>Abstract Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Decoration</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration
   * @generated
   */
  EClass getAbstractDecoration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration#getActive <em>Active</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Active</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration#getActive()
   * @see #getAbstractDecoration()
   * @generated
   */
  EReference getAbstractDecoration_Active();

  /**
   * Returns the meta object for class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.IconDecoration <em>Icon Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Icon Decoration</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.IconDecoration
   * @generated
   */
  EClass getIconDecoration();

  /**
   * Returns the meta object for the attribute '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.IconDecoration#getLocation_uri <em>Location uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location uri</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.IconDecoration#getLocation_uri()
   * @see #getIconDecoration()
   * @generated
   */
  EAttribute getIconDecoration_Location_uri();

  /**
   * Returns the meta object for class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration <em>Border Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Border Decoration</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration
   * @generated
   */
  EClass getBorderDecoration();

  /**
   * Returns the meta object for the attribute '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration#getSize()
   * @see #getBorderDecoration()
   * @generated
   */
  EAttribute getBorderDecoration_Size();

  /**
   * Returns the meta object for class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Activation <em>Activation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activation</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Activation
   * @generated
   */
  EClass getActivation();

  /**
   * Returns the meta object for the containment reference '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Activation#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Activation#getCondition()
   * @see #getActivation()
   * @generated
   */
  EReference getActivation_Condition();

  /**
   * Returns the meta object for class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition <em>Abstract Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Condition</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition
   * @generated
   */
  EClass getAbstractCondition();

  /**
   * Returns the meta object for class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the reference '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Condition#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Condition#getAttribute()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Attribute();

  /**
   * Returns the meta object for the attribute '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Condition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Condition#getOperator()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Operator();

  /**
   * Returns the meta object for the attribute '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Condition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Condition#getValue()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Value();

  /**
   * Returns the meta object for class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition <em>Composite Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Condition</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition
   * @generated
   */
  EClass getCompositeCondition();

  /**
   * Returns the meta object for the attribute '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition#getOperator()
   * @see #getCompositeCondition()
   * @generated
   */
  EAttribute getCompositeCondition_Operator();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition#getConditions()
   * @see #getCompositeCondition()
   * @generated
   */
  EReference getCompositeCondition_Conditions();

  /**
   * Returns the meta object for enum '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ComparisonOperator <em>Comparison Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Comparison Operator</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.ComparisonOperator
   * @generated
   */
  EEnum getComparisonOperator();

  /**
   * Returns the meta object for enum '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.LogicalOperator <em>Logical Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Logical Operator</em>'.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.LogicalOperator
   * @generated
   */
  EEnum getLogicalOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DecorationLanguageFactory getDecorationLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationModelImpl <em>Decoration Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationModelImpl
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getDecorationModel()
     * @generated
     */
    EClass DECORATION_MODEL = eINSTANCE.getDecorationModel();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECORATION_MODEL__IMPORT_URI = eINSTANCE.getDecorationModel_ImportURI();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECORATION_MODEL__NAMESPACE = eINSTANCE.getDecorationModel_Namespace();

    /**
     * The meta object literal for the '<em><b>Decoration Descriptions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECORATION_MODEL__DECORATION_DESCRIPTIONS = eINSTANCE.getDecorationModel_DecorationDescriptions();

    /**
     * The meta object literal for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.NamespaceImpl <em>Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.NamespaceImpl
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getNamespace()
     * @generated
     */
    EClass NAMESPACE = eINSTANCE.getNamespace();

    /**
     * The meta object literal for the '<em><b>Profile</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__PROFILE = eINSTANCE.getNamespace_Profile();

    /**
     * The meta object literal for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationDescriptionImpl <em>Decoration Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationDescriptionImpl
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getDecorationDescription()
     * @generated
     */
    EClass DECORATION_DESCRIPTION = eINSTANCE.getDecorationDescription();

    /**
     * The meta object literal for the '<em><b>Stereotype</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECORATION_DESCRIPTION__STEREOTYPE = eINSTANCE.getDecorationDescription_Stereotype();

    /**
     * The meta object literal for the '<em><b>Decorations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECORATION_DESCRIPTION__DECORATIONS = eINSTANCE.getDecorationDescription_Decorations();

    /**
     * The meta object literal for the '<em><b>Active</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECORATION_DESCRIPTION__ACTIVE = eINSTANCE.getDecorationDescription_Active();

    /**
     * The meta object literal for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.AbstractDecorationImpl <em>Abstract Decoration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.AbstractDecorationImpl
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getAbstractDecoration()
     * @generated
     */
    EClass ABSTRACT_DECORATION = eINSTANCE.getAbstractDecoration();

    /**
     * The meta object literal for the '<em><b>Active</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_DECORATION__ACTIVE = eINSTANCE.getAbstractDecoration_Active();

    /**
     * The meta object literal for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.IconDecorationImpl <em>Icon Decoration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.IconDecorationImpl
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getIconDecoration()
     * @generated
     */
    EClass ICON_DECORATION = eINSTANCE.getIconDecoration();

    /**
     * The meta object literal for the '<em><b>Location uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ICON_DECORATION__LOCATION_URI = eINSTANCE.getIconDecoration_Location_uri();

    /**
     * The meta object literal for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BorderDecorationImpl <em>Border Decoration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BorderDecorationImpl
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getBorderDecoration()
     * @generated
     */
    EClass BORDER_DECORATION = eINSTANCE.getBorderDecoration();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BORDER_DECORATION__SIZE = eINSTANCE.getBorderDecoration_Size();

    /**
     * The meta object literal for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ActivationImpl <em>Activation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ActivationImpl
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getActivation()
     * @generated
     */
    EClass ACTIVATION = eINSTANCE.getActivation();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVATION__CONDITION = eINSTANCE.getActivation_Condition();

    /**
     * The meta object literal for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.AbstractConditionImpl <em>Abstract Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.AbstractConditionImpl
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getAbstractCondition()
     * @generated
     */
    EClass ABSTRACT_CONDITION = eINSTANCE.getAbstractCondition();

    /**
     * The meta object literal for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ConditionImpl
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__ATTRIBUTE = eINSTANCE.getCondition_Attribute();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__VALUE = eINSTANCE.getCondition_Value();

    /**
     * The meta object literal for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.CompositeConditionImpl
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getCompositeCondition()
     * @generated
     */
    EClass COMPOSITE_CONDITION = eINSTANCE.getCompositeCondition();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOSITE_CONDITION__OPERATOR = eINSTANCE.getCompositeCondition_Operator();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_CONDITION__CONDITIONS = eINSTANCE.getCompositeCondition_Conditions();

    /**
     * The meta object literal for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ComparisonOperator <em>Comparison Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.ComparisonOperator
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getComparisonOperator()
     * @generated
     */
    EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

    /**
     * The meta object literal for the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.LogicalOperator <em>Logical Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.LogicalOperator
     * @see org.modelversioning.emfprofile.decoration.decorationLanguage.impl.DecorationLanguagePackageImpl#getLogicalOperator()
     * @generated
     */
    EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

  }

} //DecorationLanguagePackage
