/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.modelversioning.emfprofile.decoration.decorationLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage
 * @generated
 */
public class DecorationLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DecorationLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecorationLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DecorationLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecorationLanguageSwitch<Adapter> modelSwitch =
    new DecorationLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseDecorationModel(DecorationModel object)
      {
        return createDecorationModelAdapter();
      }
      @Override
      public Adapter caseNamespace(Namespace object)
      {
        return createNamespaceAdapter();
      }
      @Override
      public Adapter caseDecorationDescription(DecorationDescription object)
      {
        return createDecorationDescriptionAdapter();
      }
      @Override
      public Adapter caseAbstractDecoration(AbstractDecoration object)
      {
        return createAbstractDecorationAdapter();
      }
      @Override
      public Adapter caseImageDecoration(ImageDecoration object)
      {
        return createImageDecorationAdapter();
      }
      @Override
      public Adapter caseBorderDecoration(BorderDecoration object)
      {
        return createBorderDecorationAdapter();
      }
      @Override
      public Adapter caseColorDecoration(ColorDecoration object)
      {
        return createColorDecorationAdapter();
      }
      @Override
      public Adapter caseConnectionDecoration(ConnectionDecoration object)
      {
        return createConnectionDecorationAdapter();
      }
      @Override
      public Adapter caseText(Text object)
      {
        return createTextAdapter();
      }
      @Override
      public Adapter caseSimpleText(SimpleText object)
      {
        return createSimpleTextAdapter();
      }
      @Override
      public Adapter caseComplexText(ComplexText object)
      {
        return createComplexTextAdapter();
      }
      @Override
      public Adapter caseStyle(Style object)
      {
        return createStyleAdapter();
      }
      @Override
      public Adapter caseSize(Size object)
      {
        return createSizeAdapter();
      }
      @Override
      public Adapter caseDirection(Direction object)
      {
        return createDirectionAdapter();
      }
      @Override
      public Adapter caseMargin(Margin object)
      {
        return createMarginAdapter();
      }
      @Override
      public Adapter caseColor(Color object)
      {
        return createColorAdapter();
      }
      @Override
      public Adapter caseConcreteColor(ConcreteColor object)
      {
        return createConcreteColorAdapter();
      }
      @Override
      public Adapter caseRGB(RGB object)
      {
        return createRGBAdapter();
      }
      @Override
      public Adapter caseHexColor(HexColor object)
      {
        return createHexColorAdapter();
      }
      @Override
      public Adapter caseColorConstant(ColorConstant object)
      {
        return createColorConstantAdapter();
      }
      @Override
      public Adapter caseActivation(Activation object)
      {
        return createActivationAdapter();
      }
      @Override
      public Adapter caseAbstractCondition(AbstractCondition object)
      {
        return createAbstractConditionAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseCompositeCondition(CompositeCondition object)
      {
        return createCompositeConditionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel <em>Decoration Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel
   * @generated
   */
  public Adapter createDecorationModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Namespace
   * @generated
   */
  public Adapter createNamespaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription <em>Decoration Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription
   * @generated
   */
  public Adapter createDecorationDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration <em>Abstract Decoration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration
   * @generated
   */
  public Adapter createAbstractDecorationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration <em>Image Decoration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration
   * @generated
   */
  public Adapter createImageDecorationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration <em>Border Decoration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration
   * @generated
   */
  public Adapter createBorderDecorationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration <em>Color Decoration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration
   * @generated
   */
  public Adapter createColorDecorationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ConnectionDecoration <em>Connection Decoration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.ConnectionDecoration
   * @generated
   */
  public Adapter createConnectionDecorationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Text
   * @generated
   */
  public Adapter createTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.SimpleText <em>Simple Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.SimpleText
   * @generated
   */
  public Adapter createSimpleTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ComplexText <em>Complex Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.ComplexText
   * @generated
   */
  public Adapter createComplexTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Style <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Style
   * @generated
   */
  public Adapter createStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Size
   * @generated
   */
  public Adapter createSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Direction <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Direction
   * @generated
   */
  public Adapter createDirectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Margin <em>Margin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Margin
   * @generated
   */
  public Adapter createMarginAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Color
   * @generated
   */
  public Adapter createColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ConcreteColor <em>Concrete Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.ConcreteColor
   * @generated
   */
  public Adapter createConcreteColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.RGB <em>RGB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.RGB
   * @generated
   */
  public Adapter createRGBAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.HexColor <em>Hex Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.HexColor
   * @generated
   */
  public Adapter createHexColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.ColorConstant <em>Color Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.ColorConstant
   * @generated
   */
  public Adapter createColorConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Activation <em>Activation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Activation
   * @generated
   */
  public Adapter createActivationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition <em>Abstract Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition
   * @generated
   */
  public Adapter createAbstractConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition <em>Composite Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition
   * @generated
   */
  public Adapter createCompositeConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DecorationLanguageAdapterFactory
