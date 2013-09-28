/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modelversioning.emfprofile.EMFProfilePackage;

import org.modelversioning.emfprofile.decoration.decorationLanguage.Decoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguageFactory;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage;
import org.modelversioning.emfprofile.decoration.decorationLanguage.EMFProfileDecorationModel;

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
  private EClass emfProfileDecorationModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decorationEClass = null;

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
  public EClass getEMFProfileDecorationModel()
  {
    return emfProfileDecorationModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMFProfileDecorationModel_ImportURI()
  {
    return (EAttribute)emfProfileDecorationModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMFProfileDecorationModel_Decorations()
  {
    return (EReference)emfProfileDecorationModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecoration()
  {
    return decorationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecoration_Decorations()
  {
    return (EReference)decorationEClass.getEStructuralFeatures().get(0);
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
    emfProfileDecorationModelEClass = createEClass(EMF_PROFILE_DECORATION_MODEL);
    createEAttribute(emfProfileDecorationModelEClass, EMF_PROFILE_DECORATION_MODEL__IMPORT_URI);
    createEReference(emfProfileDecorationModelEClass, EMF_PROFILE_DECORATION_MODEL__DECORATIONS);

    decorationEClass = createEClass(DECORATION);
    createEReference(decorationEClass, DECORATION__DECORATIONS);
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

    // Initialize classes and features; add operations and parameters
    initEClass(emfProfileDecorationModelEClass, EMFProfileDecorationModel.class, "EMFProfileDecorationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEMFProfileDecorationModel_ImportURI(), theEcorePackage.getEString(), "importURI", null, 0, 1, EMFProfileDecorationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMFProfileDecorationModel_Decorations(), this.getDecoration(), null, "decorations", null, 0, -1, EMFProfileDecorationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decorationEClass, Decoration.class, "Decoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDecoration_Decorations(), theEMFProfilePackage.getStereotype(), null, "decorations", null, 0, 1, Decoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DecorationLanguagePackageImpl
