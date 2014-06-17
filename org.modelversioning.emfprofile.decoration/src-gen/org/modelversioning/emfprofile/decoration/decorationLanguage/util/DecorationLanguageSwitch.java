/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.modelversioning.emfprofile.decoration.decorationLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage
 * @generated
 */
public class DecorationLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DecorationLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecorationLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DecorationLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DecorationLanguagePackage.DECORATION_MODEL:
      {
        DecorationModel decorationModel = (DecorationModel)theEObject;
        T result = caseDecorationModel(decorationModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.NAMESPACE:
      {
        Namespace namespace = (Namespace)theEObject;
        T result = caseNamespace(namespace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.DECORATION_DESCRIPTION:
      {
        DecorationDescription decorationDescription = (DecorationDescription)theEObject;
        T result = caseDecorationDescription(decorationDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.ABSTRACT_DECORATION:
      {
        AbstractDecoration abstractDecoration = (AbstractDecoration)theEObject;
        T result = caseAbstractDecoration(abstractDecoration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.IMAGE_DECORATION:
      {
        ImageDecoration imageDecoration = (ImageDecoration)theEObject;
        T result = caseImageDecoration(imageDecoration);
        if (result == null) result = caseAbstractDecoration(imageDecoration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.BOX_DECORATION:
      {
        BoxDecoration boxDecoration = (BoxDecoration)theEObject;
        T result = caseBoxDecoration(boxDecoration);
        if (result == null) result = caseAbstractDecoration(boxDecoration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.BORDER_DECORATION:
      {
        BorderDecoration borderDecoration = (BorderDecoration)theEObject;
        T result = caseBorderDecoration(borderDecoration);
        if (result == null) result = caseAbstractDecoration(borderDecoration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.COLOR_DECORATION:
      {
        ColorDecoration colorDecoration = (ColorDecoration)theEObject;
        T result = caseColorDecoration(colorDecoration);
        if (result == null) result = caseAbstractDecoration(colorDecoration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.CONNECTION_DECORATION:
      {
        ConnectionDecoration connectionDecoration = (ConnectionDecoration)theEObject;
        T result = caseConnectionDecoration(connectionDecoration);
        if (result == null) result = caseAbstractDecoration(connectionDecoration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.SIMPLE_TEXT:
      {
        SimpleText simpleText = (SimpleText)theEObject;
        T result = caseSimpleText(simpleText);
        if (result == null) result = caseText(simpleText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.COMPLEX_TEXT:
      {
        ComplexText complexText = (ComplexText)theEObject;
        T result = caseComplexText(complexText);
        if (result == null) result = caseText(complexText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.BORDER:
      {
        Border border = (Border)theEObject;
        T result = caseBorder(border);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.BOX_IMAGE:
      {
        BoxImage boxImage = (BoxImage)theEObject;
        T result = caseBoxImage(boxImage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.STYLE:
      {
        Style style = (Style)theEObject;
        T result = caseStyle(style);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.SIZE:
      {
        Size size = (Size)theEObject;
        T result = caseSize(size);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.DIRECTION:
      {
        Direction direction = (Direction)theEObject;
        T result = caseDirection(direction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.MARGIN:
      {
        Margin margin = (Margin)theEObject;
        T result = caseMargin(margin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.RELATIVE_POSITION:
      {
        RelativePosition relativePosition = (RelativePosition)theEObject;
        T result = caseRelativePosition(relativePosition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.COLOR:
      {
        Color color = (Color)theEObject;
        T result = caseColor(color);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.CONCRETE_COLOR:
      {
        ConcreteColor concreteColor = (ConcreteColor)theEObject;
        T result = caseConcreteColor(concreteColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.RGB:
      {
        RGB rgb = (RGB)theEObject;
        T result = caseRGB(rgb);
        if (result == null) result = caseConcreteColor(rgb);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.HEX_COLOR:
      {
        HexColor hexColor = (HexColor)theEObject;
        T result = caseHexColor(hexColor);
        if (result == null) result = caseConcreteColor(hexColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.COLOR_CONSTANT:
      {
        ColorConstant colorConstant = (ColorConstant)theEObject;
        T result = caseColorConstant(colorConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.ACTIVATION:
      {
        Activation activation = (Activation)theEObject;
        T result = caseActivation(activation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.ABSTRACT_CONDITION:
      {
        AbstractCondition abstractCondition = (AbstractCondition)theEObject;
        T result = caseAbstractCondition(abstractCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.OCL_EXPRESSION:
      {
        OclExpression oclExpression = (OclExpression)theEObject;
        T result = caseOclExpression(oclExpression);
        if (result == null) result = caseAbstractCondition(oclExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = caseAbstractCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DecorationLanguagePackage.COMPOSITE_CONDITION:
      {
        CompositeCondition compositeCondition = (CompositeCondition)theEObject;
        T result = caseCompositeCondition(compositeCondition);
        if (result == null) result = caseAbstractCondition(compositeCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decoration Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decoration Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecorationModel(DecorationModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespace(Namespace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decoration Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decoration Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecorationDescription(DecorationDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Decoration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Decoration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDecoration(AbstractDecoration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Decoration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Decoration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageDecoration(ImageDecoration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Box Decoration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Box Decoration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoxDecoration(BoxDecoration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Border Decoration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Border Decoration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorderDecoration(BorderDecoration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Decoration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Decoration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorDecoration(ColorDecoration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connection Decoration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connection Decoration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnectionDecoration(ConnectionDecoration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleText(SimpleText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexText(ComplexText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Border</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Border</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorder(Border object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Box Image</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Box Image</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoxImage(BoxImage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyle(Style object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSize(Size object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirection(Direction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Margin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Margin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMargin(Margin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relative Position</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relative Position</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelativePosition(RelativePosition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColor(Color object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concrete Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concrete Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcreteColor(ConcreteColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RGB</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RGB</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRGB(RGB object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hex Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hex Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHexColor(HexColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorConstant(ColorConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivation(Activation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractCondition(AbstractCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclExpression(OclExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeCondition(CompositeCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DecorationLanguageSwitch
