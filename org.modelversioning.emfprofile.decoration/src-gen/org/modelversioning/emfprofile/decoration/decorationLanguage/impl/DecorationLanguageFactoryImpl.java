/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.modelversioning.emfprofile.decoration.decorationLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecorationLanguageFactoryImpl extends EFactoryImpl implements DecorationLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DecorationLanguageFactory init()
  {
    try
    {
      DecorationLanguageFactory theDecorationLanguageFactory = (DecorationLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(DecorationLanguagePackage.eNS_URI);
      if (theDecorationLanguageFactory != null)
      {
        return theDecorationLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DecorationLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecorationLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DecorationLanguagePackage.DECORATION_MODEL: return createDecorationModel();
      case DecorationLanguagePackage.NAMESPACE: return createNamespace();
      case DecorationLanguagePackage.DECORATION_DESCRIPTION: return createDecorationDescription();
      case DecorationLanguagePackage.ABSTRACT_DECORATION: return createAbstractDecoration();
      case DecorationLanguagePackage.IMAGE_DECORATION: return createImageDecoration();
      case DecorationLanguagePackage.BOX_DECORATION: return createBoxDecoration();
      case DecorationLanguagePackage.BORDER_DECORATION: return createBorderDecoration();
      case DecorationLanguagePackage.COLOR_DECORATION: return createColorDecoration();
      case DecorationLanguagePackage.CONNECTION_DECORATION: return createConnectionDecoration();
      case DecorationLanguagePackage.TEXT: return createText();
      case DecorationLanguagePackage.SIMPLE_TEXT: return createSimpleText();
      case DecorationLanguagePackage.COMPLEX_TEXT: return createComplexText();
      case DecorationLanguagePackage.BORDER: return createBorder();
      case DecorationLanguagePackage.BOX_IMAGE: return createBoxImage();
      case DecorationLanguagePackage.STYLE: return createStyle();
      case DecorationLanguagePackage.SIZE: return createSize();
      case DecorationLanguagePackage.DIRECTION: return createDirection();
      case DecorationLanguagePackage.MARGIN: return createMargin();
      case DecorationLanguagePackage.RELATIVE_POSITION: return createRelativePosition();
      case DecorationLanguagePackage.COLOR: return createColor();
      case DecorationLanguagePackage.CONCRETE_COLOR: return createConcreteColor();
      case DecorationLanguagePackage.RGB: return createRGB();
      case DecorationLanguagePackage.HEX_COLOR: return createHexColor();
      case DecorationLanguagePackage.COLOR_CONSTANT: return createColorConstant();
      case DecorationLanguagePackage.ACTIVATION: return createActivation();
      case DecorationLanguagePackage.ABSTRACT_CONDITION: return createAbstractCondition();
      case DecorationLanguagePackage.OCL_EXPRESSION: return createOclExpression();
      case DecorationLanguagePackage.CONDITION: return createCondition();
      case DecorationLanguagePackage.COMPOSITE_CONDITION: return createCompositeCondition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DecorationLanguagePackage.BOX_IMAGE_ORIENTATION:
        return createBoxImageOrientationFromString(eDataType, initialValue);
      case DecorationLanguagePackage.COMPARISON_OPERATOR:
        return createComparisonOperatorFromString(eDataType, initialValue);
      case DecorationLanguagePackage.LOGICAL_OPERATOR:
        return createLogicalOperatorFromString(eDataType, initialValue);
      case DecorationLanguagePackage.LINE_STYLE:
        return createLineStyleFromString(eDataType, initialValue);
      case DecorationLanguagePackage.COLORS:
        return createColorsFromString(eDataType, initialValue);
      case DecorationLanguagePackage.DIRECTIONS:
        return createDirectionsFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DecorationLanguagePackage.BOX_IMAGE_ORIENTATION:
        return convertBoxImageOrientationToString(eDataType, instanceValue);
      case DecorationLanguagePackage.COMPARISON_OPERATOR:
        return convertComparisonOperatorToString(eDataType, instanceValue);
      case DecorationLanguagePackage.LOGICAL_OPERATOR:
        return convertLogicalOperatorToString(eDataType, instanceValue);
      case DecorationLanguagePackage.LINE_STYLE:
        return convertLineStyleToString(eDataType, instanceValue);
      case DecorationLanguagePackage.COLORS:
        return convertColorsToString(eDataType, instanceValue);
      case DecorationLanguagePackage.DIRECTIONS:
        return convertDirectionsToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecorationModel createDecorationModel()
  {
    DecorationModelImpl decorationModel = new DecorationModelImpl();
    return decorationModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace createNamespace()
  {
    NamespaceImpl namespace = new NamespaceImpl();
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecorationDescription createDecorationDescription()
  {
    DecorationDescriptionImpl decorationDescription = new DecorationDescriptionImpl();
    return decorationDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDecoration createAbstractDecoration()
  {
    AbstractDecorationImpl abstractDecoration = new AbstractDecorationImpl();
    return abstractDecoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageDecoration createImageDecoration()
  {
    ImageDecorationImpl imageDecoration = new ImageDecorationImpl();
    return imageDecoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoxDecoration createBoxDecoration()
  {
    BoxDecorationImpl boxDecoration = new BoxDecorationImpl();
    return boxDecoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderDecoration createBorderDecoration()
  {
    BorderDecorationImpl borderDecoration = new BorderDecorationImpl();
    return borderDecoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorDecoration createColorDecoration()
  {
    ColorDecorationImpl colorDecoration = new ColorDecorationImpl();
    return colorDecoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionDecoration createConnectionDecoration()
  {
    ConnectionDecorationImpl connectionDecoration = new ConnectionDecorationImpl();
    return connectionDecoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleText createSimpleText()
  {
    SimpleTextImpl simpleText = new SimpleTextImpl();
    return simpleText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexText createComplexText()
  {
    ComplexTextImpl complexText = new ComplexTextImpl();
    return complexText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Border createBorder()
  {
    BorderImpl border = new BorderImpl();
    return border;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoxImage createBoxImage()
  {
    BoxImageImpl boxImage = new BoxImageImpl();
    return boxImage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Style createStyle()
  {
    StyleImpl style = new StyleImpl();
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size createSize()
  {
    SizeImpl size = new SizeImpl();
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction createDirection()
  {
    DirectionImpl direction = new DirectionImpl();
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Margin createMargin()
  {
    MarginImpl margin = new MarginImpl();
    return margin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativePosition createRelativePosition()
  {
    RelativePositionImpl relativePosition = new RelativePositionImpl();
    return relativePosition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteColor createConcreteColor()
  {
    ConcreteColorImpl concreteColor = new ConcreteColorImpl();
    return concreteColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RGB createRGB()
  {
    RGBImpl rgb = new RGBImpl();
    return rgb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HexColor createHexColor()
  {
    HexColorImpl hexColor = new HexColorImpl();
    return hexColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorConstant createColorConstant()
  {
    ColorConstantImpl colorConstant = new ColorConstantImpl();
    return colorConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activation createActivation()
  {
    ActivationImpl activation = new ActivationImpl();
    return activation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractCondition createAbstractCondition()
  {
    AbstractConditionImpl abstractCondition = new AbstractConditionImpl();
    return abstractCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclExpression createOclExpression()
  {
    OclExpressionImpl oclExpression = new OclExpressionImpl();
    return oclExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeCondition createCompositeCondition()
  {
    CompositeConditionImpl compositeCondition = new CompositeConditionImpl();
    return compositeCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoxImageOrientation createBoxImageOrientationFromString(EDataType eDataType, String initialValue)
  {
    BoxImageOrientation result = BoxImageOrientation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBoxImageOrientationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparisonOperator createComparisonOperatorFromString(EDataType eDataType, String initialValue)
  {
    ComparisonOperator result = ComparisonOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertComparisonOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue)
  {
    LogicalOperator result = LogicalOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineStyle createLineStyleFromString(EDataType eDataType, String initialValue)
  {
    LineStyle result = LineStyle.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLineStyleToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Colors createColorsFromString(EDataType eDataType, String initialValue)
  {
    Colors result = Colors.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColorsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Directions createDirectionsFromString(EDataType eDataType, String initialValue)
  {
    Directions result = Directions.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDirectionsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecorationLanguagePackage getDecorationLanguagePackage()
  {
    return (DecorationLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DecorationLanguagePackage getPackage()
  {
    return DecorationLanguagePackage.eINSTANCE;
  }

} //DecorationLanguageFactoryImpl
