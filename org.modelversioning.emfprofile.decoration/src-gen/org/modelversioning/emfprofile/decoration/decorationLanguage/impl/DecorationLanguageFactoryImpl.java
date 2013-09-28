/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage.impl;

import org.eclipse.emf.ecore.EClass;
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
      case DecorationLanguagePackage.EMF_PROFILE_DECORATION_MODEL: return createEMFProfileDecorationModel();
      case DecorationLanguagePackage.DECORATION: return createDecoration();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMFProfileDecorationModel createEMFProfileDecorationModel()
  {
    EMFProfileDecorationModelImpl emfProfileDecorationModel = new EMFProfileDecorationModelImpl();
    return emfProfileDecorationModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decoration createDecoration()
  {
    DecorationImpl decoration = new DecorationImpl();
    return decoration;
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
