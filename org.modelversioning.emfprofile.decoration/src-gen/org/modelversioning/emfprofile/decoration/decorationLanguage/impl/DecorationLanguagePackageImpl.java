/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modelversioning.emfprofile.EMFProfilePackage;

import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Activation;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Border;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImage;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImageOrientation;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorConstant;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Colors;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ComparisonOperator;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ComplexText;
import org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConcreteColor;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Condition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConnectionDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguageFactory;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Direction;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Directions;
import org.modelversioning.emfprofile.decoration.decorationLanguage.HexColor;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.LineStyle;
import org.modelversioning.emfprofile.decoration.decorationLanguage.LogicalOperator;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Margin;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Namespace;
import org.modelversioning.emfprofile.decoration.decorationLanguage.OclExpression;
import org.modelversioning.emfprofile.decoration.decorationLanguage.SimpleText;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Size;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Style;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecorationLanguagePackageImpl extends EPackageImpl implements DecorationLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decorationModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decorationDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractDecorationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageDecorationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boxDecorationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borderDecorationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorDecorationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectionDecorationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boxImageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass styleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass marginEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concreteColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rgbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hexColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositeConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum boxImageOrientationEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum comparisonOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum logicalOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum lineStyleEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum directionsEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DecorationLanguagePackageImpl()
  {
    super(eNS_URI, DecorationLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DecorationLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DecorationLanguagePackage init()
  {
    if (isInited) return (DecorationLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(DecorationLanguagePackage.eNS_URI);

    // Obtain or create and register package
    DecorationLanguagePackageImpl theDecorationLanguagePackage = (DecorationLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DecorationLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DecorationLanguagePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EMFProfilePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theDecorationLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theDecorationLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDecorationLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DecorationLanguagePackage.eNS_URI, theDecorationLanguagePackage);
    return theDecorationLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecorationModel()
  {
    return decorationModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecorationModel_ImportURI()
  {
    return (EAttribute)decorationModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecorationModel_Namespace()
  {
    return (EReference)decorationModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecorationModel_DecorationDescriptions()
  {
    return (EReference)decorationModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespace()
  {
    return namespaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_Profile()
  {
    return (EReference)namespaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecorationDescription()
  {
    return decorationDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecorationDescription_Stereotype()
  {
    return (EReference)decorationDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecorationDescription_Decorations()
  {
    return (EReference)decorationDescriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecorationDescription_Activation()
  {
    return (EReference)decorationDescriptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractDecoration()
  {
    return abstractDecorationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractDecoration_Activation()
  {
    return (EReference)abstractDecorationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImageDecoration()
  {
    return imageDecorationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageDecoration_Location_uri()
  {
    return (EAttribute)imageDecorationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageDecoration_Direction()
  {
    return (EReference)imageDecorationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageDecoration_Margin()
  {
    return (EReference)imageDecorationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageDecoration_Tooltip()
  {
    return (EReference)imageDecorationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoxDecoration()
  {
    return boxDecorationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxDecoration_Text()
  {
    return (EReference)boxDecorationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoxDecoration_Widht()
  {
    return (EAttribute)boxDecorationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoxDecoration_Height()
  {
    return (EAttribute)boxDecorationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxDecoration_Image()
  {
    return (EReference)boxDecorationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxDecoration_Border()
  {
    return (EReference)boxDecorationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxDecoration_ForegroundColor()
  {
    return (EReference)boxDecorationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxDecoration_BackgroundColor()
  {
    return (EReference)boxDecorationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxDecoration_Direction()
  {
    return (EReference)boxDecorationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxDecoration_Margin()
  {
    return (EReference)boxDecorationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoxDecoration_ContentDirection()
  {
    return (EAttribute)boxDecorationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxDecoration_Tooltip()
  {
    return (EReference)boxDecorationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorderDecoration()
  {
    return borderDecorationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorderDecoration_Border()
  {
    return (EReference)borderDecorationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorDecoration()
  {
    return colorDecorationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorDecoration_Background()
  {
    return (EReference)colorDecorationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorDecoration_Foreground()
  {
    return (EReference)colorDecorationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnectionDecoration()
  {
    return connectionDecorationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnectionDecoration_Size()
  {
    return (EReference)connectionDecorationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnectionDecoration_Style()
  {
    return (EReference)connectionDecorationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnectionDecoration_Color()
  {
    return (EReference)connectionDecorationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getText()
  {
    return textEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleText()
  {
    return simpleTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleText_Text()
  {
    return (EAttribute)simpleTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleText_Attribute()
  {
    return (EReference)simpleTextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexText()
  {
    return complexTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexText_Left()
  {
    return (EReference)complexTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexText_Right()
  {
    return (EReference)complexTextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorder()
  {
    return borderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorder_Size()
  {
    return (EReference)borderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorder_Color()
  {
    return (EReference)borderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorder_Style()
  {
    return (EReference)borderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoxImage()
  {
    return boxImageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoxImage_Location_uri()
  {
    return (EAttribute)boxImageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoxImage_Placement()
  {
    return (EAttribute)boxImageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStyle()
  {
    return styleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStyle_Value()
  {
    return (EAttribute)styleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSize()
  {
    return sizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSize_Value()
  {
    return (EAttribute)sizeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirection()
  {
    return directionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDirection_Value()
  {
    return (EAttribute)directionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMargin()
  {
    return marginEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMargin_Value()
  {
    return (EAttribute)marginEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColor()
  {
    return colorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColor_Value()
  {
    return (EReference)colorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColor_Concrete()
  {
    return (EReference)colorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcreteColor()
  {
    return concreteColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRGB()
  {
    return rgbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGB_Red()
  {
    return (EAttribute)rgbEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGB_Green()
  {
    return (EAttribute)rgbEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGB_Blue()
  {
    return (EAttribute)rgbEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHexColor()
  {
    return hexColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHexColor_HexCode()
  {
    return (EAttribute)hexColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorConstant()
  {
    return colorConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorConstant_Value()
  {
    return (EAttribute)colorConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivation()
  {
    return activationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivation_Condition()
  {
    return (EReference)activationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractCondition()
  {
    return abstractConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclExpression()
  {
    return oclExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOclExpression_Expression()
  {
    return (EAttribute)oclExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_Attribute()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_Operator()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_Value()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositeCondition()
  {
    return compositeConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompositeCondition_Operator()
  {
    return (EAttribute)compositeConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeCondition_Conditions()
  {
    return (EReference)compositeConditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBoxImageOrientation()
  {
    return boxImageOrientationEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getComparisonOperator()
  {
    return comparisonOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLogicalOperator()
  {
    return logicalOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLineStyle()
  {
    return lineStyleEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColors()
  {
    return colorsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDirections()
  {
    return directionsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecorationLanguageFactory getDecorationLanguageFactory()
  {
    return (DecorationLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    decorationModelEClass = createEClass(DECORATION_MODEL);
    createEAttribute(decorationModelEClass, DECORATION_MODEL__IMPORT_URI);
    createEReference(decorationModelEClass, DECORATION_MODEL__NAMESPACE);
    createEReference(decorationModelEClass, DECORATION_MODEL__DECORATION_DESCRIPTIONS);

    namespaceEClass = createEClass(NAMESPACE);
    createEReference(namespaceEClass, NAMESPACE__PROFILE);

    decorationDescriptionEClass = createEClass(DECORATION_DESCRIPTION);
    createEReference(decorationDescriptionEClass, DECORATION_DESCRIPTION__STEREOTYPE);
    createEReference(decorationDescriptionEClass, DECORATION_DESCRIPTION__DECORATIONS);
    createEReference(decorationDescriptionEClass, DECORATION_DESCRIPTION__ACTIVATION);

    abstractDecorationEClass = createEClass(ABSTRACT_DECORATION);
    createEReference(abstractDecorationEClass, ABSTRACT_DECORATION__ACTIVATION);

    imageDecorationEClass = createEClass(IMAGE_DECORATION);
    createEAttribute(imageDecorationEClass, IMAGE_DECORATION__LOCATION_URI);
    createEReference(imageDecorationEClass, IMAGE_DECORATION__DIRECTION);
    createEReference(imageDecorationEClass, IMAGE_DECORATION__MARGIN);
    createEReference(imageDecorationEClass, IMAGE_DECORATION__TOOLTIP);

    boxDecorationEClass = createEClass(BOX_DECORATION);
    createEReference(boxDecorationEClass, BOX_DECORATION__TEXT);
    createEAttribute(boxDecorationEClass, BOX_DECORATION__WIDHT);
    createEAttribute(boxDecorationEClass, BOX_DECORATION__HEIGHT);
    createEReference(boxDecorationEClass, BOX_DECORATION__IMAGE);
    createEReference(boxDecorationEClass, BOX_DECORATION__BORDER);
    createEReference(boxDecorationEClass, BOX_DECORATION__FOREGROUND_COLOR);
    createEReference(boxDecorationEClass, BOX_DECORATION__BACKGROUND_COLOR);
    createEReference(boxDecorationEClass, BOX_DECORATION__DIRECTION);
    createEReference(boxDecorationEClass, BOX_DECORATION__MARGIN);
    createEAttribute(boxDecorationEClass, BOX_DECORATION__CONTENT_DIRECTION);
    createEReference(boxDecorationEClass, BOX_DECORATION__TOOLTIP);

    borderDecorationEClass = createEClass(BORDER_DECORATION);
    createEReference(borderDecorationEClass, BORDER_DECORATION__BORDER);

    colorDecorationEClass = createEClass(COLOR_DECORATION);
    createEReference(colorDecorationEClass, COLOR_DECORATION__BACKGROUND);
    createEReference(colorDecorationEClass, COLOR_DECORATION__FOREGROUND);

    connectionDecorationEClass = createEClass(CONNECTION_DECORATION);
    createEReference(connectionDecorationEClass, CONNECTION_DECORATION__SIZE);
    createEReference(connectionDecorationEClass, CONNECTION_DECORATION__STYLE);
    createEReference(connectionDecorationEClass, CONNECTION_DECORATION__COLOR);

    textEClass = createEClass(TEXT);

    simpleTextEClass = createEClass(SIMPLE_TEXT);
    createEAttribute(simpleTextEClass, SIMPLE_TEXT__TEXT);
    createEReference(simpleTextEClass, SIMPLE_TEXT__ATTRIBUTE);

    complexTextEClass = createEClass(COMPLEX_TEXT);
    createEReference(complexTextEClass, COMPLEX_TEXT__LEFT);
    createEReference(complexTextEClass, COMPLEX_TEXT__RIGHT);

    borderEClass = createEClass(BORDER);
    createEReference(borderEClass, BORDER__SIZE);
    createEReference(borderEClass, BORDER__COLOR);
    createEReference(borderEClass, BORDER__STYLE);

    boxImageEClass = createEClass(BOX_IMAGE);
    createEAttribute(boxImageEClass, BOX_IMAGE__LOCATION_URI);
    createEAttribute(boxImageEClass, BOX_IMAGE__PLACEMENT);

    styleEClass = createEClass(STYLE);
    createEAttribute(styleEClass, STYLE__VALUE);

    sizeEClass = createEClass(SIZE);
    createEAttribute(sizeEClass, SIZE__VALUE);

    directionEClass = createEClass(DIRECTION);
    createEAttribute(directionEClass, DIRECTION__VALUE);

    marginEClass = createEClass(MARGIN);
    createEAttribute(marginEClass, MARGIN__VALUE);

    colorEClass = createEClass(COLOR);
    createEReference(colorEClass, COLOR__VALUE);
    createEReference(colorEClass, COLOR__CONCRETE);

    concreteColorEClass = createEClass(CONCRETE_COLOR);

    rgbEClass = createEClass(RGB);
    createEAttribute(rgbEClass, RGB__RED);
    createEAttribute(rgbEClass, RGB__GREEN);
    createEAttribute(rgbEClass, RGB__BLUE);

    hexColorEClass = createEClass(HEX_COLOR);
    createEAttribute(hexColorEClass, HEX_COLOR__HEX_CODE);

    colorConstantEClass = createEClass(COLOR_CONSTANT);
    createEAttribute(colorConstantEClass, COLOR_CONSTANT__VALUE);

    activationEClass = createEClass(ACTIVATION);
    createEReference(activationEClass, ACTIVATION__CONDITION);

    abstractConditionEClass = createEClass(ABSTRACT_CONDITION);

    oclExpressionEClass = createEClass(OCL_EXPRESSION);
    createEAttribute(oclExpressionEClass, OCL_EXPRESSION__EXPRESSION);

    conditionEClass = createEClass(CONDITION);
    createEReference(conditionEClass, CONDITION__ATTRIBUTE);
    createEAttribute(conditionEClass, CONDITION__OPERATOR);
    createEAttribute(conditionEClass, CONDITION__VALUE);

    compositeConditionEClass = createEClass(COMPOSITE_CONDITION);
    createEAttribute(compositeConditionEClass, COMPOSITE_CONDITION__OPERATOR);
    createEReference(compositeConditionEClass, COMPOSITE_CONDITION__CONDITIONS);

    // Create enums
    boxImageOrientationEEnum = createEEnum(BOX_IMAGE_ORIENTATION);
    comparisonOperatorEEnum = createEEnum(COMPARISON_OPERATOR);
    logicalOperatorEEnum = createEEnum(LOGICAL_OPERATOR);
    lineStyleEEnum = createEEnum(LINE_STYLE);
    colorsEEnum = createEEnum(COLORS);
    directionsEEnum = createEEnum(DIRECTIONS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    EMFProfilePackage theEMFProfilePackage = (EMFProfilePackage)EPackage.Registry.INSTANCE.getEPackage(EMFProfilePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    imageDecorationEClass.getESuperTypes().add(this.getAbstractDecoration());
    boxDecorationEClass.getESuperTypes().add(this.getAbstractDecoration());
    borderDecorationEClass.getESuperTypes().add(this.getAbstractDecoration());
    colorDecorationEClass.getESuperTypes().add(this.getAbstractDecoration());
    connectionDecorationEClass.getESuperTypes().add(this.getAbstractDecoration());
    simpleTextEClass.getESuperTypes().add(this.getText());
    complexTextEClass.getESuperTypes().add(this.getText());
    rgbEClass.getESuperTypes().add(this.getConcreteColor());
    hexColorEClass.getESuperTypes().add(this.getConcreteColor());
    oclExpressionEClass.getESuperTypes().add(this.getAbstractCondition());
    conditionEClass.getESuperTypes().add(this.getAbstractCondition());
    compositeConditionEClass.getESuperTypes().add(this.getAbstractCondition());

    // Initialize classes and features; add operations and parameters
    initEClass(decorationModelEClass, DecorationModel.class, "DecorationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecorationModel_ImportURI(), theEcorePackage.getEString(), "importURI", null, 0, 1, DecorationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecorationModel_Namespace(), this.getNamespace(), null, "namespace", null, 0, 1, DecorationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecorationModel_DecorationDescriptions(), this.getDecorationDescription(), null, "decorationDescriptions", null, 0, -1, DecorationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamespace_Profile(), theEMFProfilePackage.getProfile(), null, "profile", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decorationDescriptionEClass, DecorationDescription.class, "DecorationDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDecorationDescription_Stereotype(), theEMFProfilePackage.getStereotype(), null, "stereotype", null, 0, 1, DecorationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecorationDescription_Decorations(), this.getAbstractDecoration(), null, "decorations", null, 0, -1, DecorationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecorationDescription_Activation(), this.getActivation(), null, "activation", null, 0, 1, DecorationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractDecorationEClass, AbstractDecoration.class, "AbstractDecoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractDecoration_Activation(), this.getActivation(), null, "activation", null, 0, 1, AbstractDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageDecorationEClass, ImageDecoration.class, "ImageDecoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImageDecoration_Location_uri(), theEcorePackage.getEString(), "location_uri", null, 0, 1, ImageDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImageDecoration_Direction(), this.getDirection(), null, "direction", null, 0, 1, ImageDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImageDecoration_Margin(), this.getMargin(), null, "margin", null, 0, 1, ImageDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImageDecoration_Tooltip(), this.getText(), null, "tooltip", null, 0, 1, ImageDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boxDecorationEClass, BoxDecoration.class, "BoxDecoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBoxDecoration_Text(), this.getText(), null, "text", null, 0, 1, BoxDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBoxDecoration_Widht(), theEcorePackage.getEInt(), "widht", null, 0, 1, BoxDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBoxDecoration_Height(), theEcorePackage.getEInt(), "height", null, 0, 1, BoxDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoxDecoration_Image(), this.getBoxImage(), null, "image", null, 0, 1, BoxDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoxDecoration_Border(), this.getBorder(), null, "border", null, 0, 1, BoxDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoxDecoration_ForegroundColor(), this.getColor(), null, "foregroundColor", null, 0, 1, BoxDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoxDecoration_BackgroundColor(), this.getColor(), null, "backgroundColor", null, 0, 1, BoxDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoxDecoration_Direction(), this.getDirection(), null, "direction", null, 0, 1, BoxDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoxDecoration_Margin(), this.getMargin(), null, "margin", null, 0, 1, BoxDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBoxDecoration_ContentDirection(), this.getDirections(), "contentDirection", null, 0, 1, BoxDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoxDecoration_Tooltip(), this.getText(), null, "tooltip", null, 0, 1, BoxDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(borderDecorationEClass, BorderDecoration.class, "BorderDecoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBorderDecoration_Border(), this.getBorder(), null, "border", null, 0, 1, BorderDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorDecorationEClass, ColorDecoration.class, "ColorDecoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColorDecoration_Background(), this.getColor(), null, "background", null, 0, 1, ColorDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColorDecoration_Foreground(), this.getColor(), null, "foreground", null, 0, 1, ColorDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectionDecorationEClass, ConnectionDecoration.class, "ConnectionDecoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConnectionDecoration_Size(), this.getSize(), null, "size", null, 0, 1, ConnectionDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnectionDecoration_Style(), this.getStyle(), null, "style", null, 0, 1, ConnectionDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnectionDecoration_Color(), this.getColor(), null, "color", null, 0, 1, ConnectionDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleTextEClass, SimpleText.class, "SimpleText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleText_Text(), theEcorePackage.getEString(), "text", null, 0, 1, SimpleText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleText_Attribute(), theEcorePackage.getEAttribute(), null, "attribute", null, 0, 1, SimpleText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexTextEClass, ComplexText.class, "ComplexText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComplexText_Left(), this.getSimpleText(), null, "left", null, 0, 1, ComplexText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexText_Right(), this.getText(), null, "right", null, 0, 1, ComplexText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(borderEClass, Border.class, "Border", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBorder_Size(), this.getSize(), null, "size", null, 0, 1, Border.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBorder_Color(), this.getColor(), null, "color", null, 0, 1, Border.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBorder_Style(), this.getStyle(), null, "style", null, 0, 1, Border.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boxImageEClass, BoxImage.class, "BoxImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoxImage_Location_uri(), theEcorePackage.getEString(), "location_uri", null, 0, 1, BoxImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBoxImage_Placement(), this.getBoxImageOrientation(), "placement", null, 0, 1, BoxImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(styleEClass, Style.class, "Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStyle_Value(), this.getLineStyle(), "value", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSize_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directionEClass, Direction.class, "Direction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDirection_Value(), this.getDirections(), "value", null, 0, 1, Direction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(marginEClass, Margin.class, "Margin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMargin_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, Margin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColor_Value(), this.getColorConstant(), null, "value", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColor_Concrete(), this.getConcreteColor(), null, "concrete", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(concreteColorEClass, ConcreteColor.class, "ConcreteColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rgbEClass, org.modelversioning.emfprofile.decoration.decorationLanguage.RGB.class, "RGB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRGB_Red(), theEcorePackage.getEInt(), "red", null, 0, 1, org.modelversioning.emfprofile.decoration.decorationLanguage.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGB_Green(), theEcorePackage.getEInt(), "green", null, 0, 1, org.modelversioning.emfprofile.decoration.decorationLanguage.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGB_Blue(), theEcorePackage.getEInt(), "blue", null, 0, 1, org.modelversioning.emfprofile.decoration.decorationLanguage.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hexColorEClass, HexColor.class, "HexColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHexColor_HexCode(), theEcorePackage.getEString(), "hexCode", null, 0, 1, HexColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorConstantEClass, ColorConstant.class, "ColorConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColorConstant_Value(), this.getColors(), "value", null, 0, 1, ColorConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activationEClass, Activation.class, "Activation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActivation_Condition(), this.getAbstractCondition(), null, "condition", null, 0, 1, Activation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractConditionEClass, AbstractCondition.class, "AbstractCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(oclExpressionEClass, OclExpression.class, "OclExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOclExpression_Expression(), theEcorePackage.getEString(), "expression", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondition_Attribute(), theEcorePackage.getEAttribute(), null, "attribute", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCondition_Operator(), this.getComparisonOperator(), "operator", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCondition_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositeConditionEClass, CompositeCondition.class, "CompositeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCompositeCondition_Operator(), this.getLogicalOperator(), "operator", null, 0, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositeCondition_Conditions(), this.getAbstractCondition(), null, "conditions", null, 0, -1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(boxImageOrientationEEnum, BoxImageOrientation.class, "BoxImageOrientation");
    addEEnumLiteral(boxImageOrientationEEnum, BoxImageOrientation.WEST);
    addEEnumLiteral(boxImageOrientationEEnum, BoxImageOrientation.NORTH);
    addEEnumLiteral(boxImageOrientationEEnum, BoxImageOrientation.EAST);
    addEEnumLiteral(boxImageOrientationEEnum, BoxImageOrientation.SOUTH);

    initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQUAL);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.UNEQUAL);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATEROREQUAL);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LOWER);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LOWEROREQUAL);

    initEEnum(logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
    addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.ALL);
    addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.ANY);

    initEEnum(lineStyleEEnum, LineStyle.class, "LineStyle");
    addEEnumLiteral(lineStyleEEnum, LineStyle.LINE_SOLID);
    addEEnumLiteral(lineStyleEEnum, LineStyle.LINE_DOT);
    addEEnumLiteral(lineStyleEEnum, LineStyle.LINE_DASH);
    addEEnumLiteral(lineStyleEEnum, LineStyle.LINE_DASHDOT);
    addEEnumLiteral(lineStyleEEnum, LineStyle.LINE_DASHDOTDOT);

    initEEnum(colorsEEnum, Colors.class, "Colors");
    addEEnumLiteral(colorsEEnum, Colors.RED);
    addEEnumLiteral(colorsEEnum, Colors.BLACK);
    addEEnumLiteral(colorsEEnum, Colors.WHITE);
    addEEnumLiteral(colorsEEnum, Colors.GREEN);
    addEEnumLiteral(colorsEEnum, Colors.GREEN_LIGHT);
    addEEnumLiteral(colorsEEnum, Colors.GREEN_DARK);
    addEEnumLiteral(colorsEEnum, Colors.BLUE);
    addEEnumLiteral(colorsEEnum, Colors.BLUE_LIGHT);
    addEEnumLiteral(colorsEEnum, Colors.BLUE_DARK);
    addEEnumLiteral(colorsEEnum, Colors.GRAY);
    addEEnumLiteral(colorsEEnum, Colors.GRAY_LIGHT);
    addEEnumLiteral(colorsEEnum, Colors.GRAY_DARK);
    addEEnumLiteral(colorsEEnum, Colors.ORANGE);
    addEEnumLiteral(colorsEEnum, Colors.YELLOW);
    addEEnumLiteral(colorsEEnum, Colors.CYAN);

    initEEnum(directionsEEnum, Directions.class, "Directions");
    addEEnumLiteral(directionsEEnum, Directions.CENTER);
    addEEnumLiteral(directionsEEnum, Directions.NORTH);
    addEEnumLiteral(directionsEEnum, Directions.SOUTH);
    addEEnumLiteral(directionsEEnum, Directions.WEST);
    addEEnumLiteral(directionsEEnum, Directions.EAST);
    addEEnumLiteral(directionsEEnum, Directions.NORTH_EAST);
    addEEnumLiteral(directionsEEnum, Directions.NORTH_WEST);
    addEEnumLiteral(directionsEEnum, Directions.SOUTH_EAST);
    addEEnumLiteral(directionsEEnum, Directions.SOUTH_WEST);

    // Create resource
    createResource(eNS_URI);
  }

} //DecorationLanguagePackageImpl
