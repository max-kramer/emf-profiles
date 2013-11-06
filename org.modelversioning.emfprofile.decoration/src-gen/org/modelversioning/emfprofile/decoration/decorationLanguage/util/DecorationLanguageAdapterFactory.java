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
      public Adapter caseDecoration(Decoration object)
      {
        return createDecorationAdapter();
      }
      @Override
      public Adapter caseIconDecoration(IconDecoration object)
      {
        return createIconDecorationAdapter();
      }
      @Override
      public Adapter caseBorderDecoration(BorderDecoration object)
      {
        return createBorderDecorationAdapter();
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
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.Decoration <em>Decoration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Decoration
   * @generated
   */
  public Adapter createDecorationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.IconDecoration <em>Icon Decoration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.IconDecoration
   * @generated
   */
  public Adapter createIconDecorationAdapter()
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
