/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.adeptness.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.adeptness.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdeptnessFactoryImpl extends EFactoryImpl implements AdeptnessFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AdeptnessFactory init()
  {
    try
    {
      AdeptnessFactory theAdeptnessFactory = (AdeptnessFactory)EPackage.Registry.INSTANCE.getEFactory(AdeptnessPackage.eNS_URI);
      if (theAdeptnessFactory != null)
      {
        return theAdeptnessFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AdeptnessFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdeptnessFactoryImpl()
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
      case AdeptnessPackage.ADEPTNESS: return createAdeptness();
      case AdeptnessPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case AdeptnessPackage.IMPORTS: return createImports();
      case AdeptnessPackage.TYPE: return createType();
      case AdeptnessPackage.MONITORING_FILE: return createMonitoringFile();
      case AdeptnessPackage.MONITORING_PLAN: return createMonitoringPlan();
      case AdeptnessPackage.MONITORING_VARIABLE: return createMonitoringVariable();
      case AdeptnessPackage.SIG_TYPE: return createSig_type();
      case AdeptnessPackage.SIGNAL: return createSignal();
      case AdeptnessPackage.IMPORT_MONITORING_PLAN: return createImportMonitoringPlan();
      case AdeptnessPackage.ORACLE: return createOracle();
      case AdeptnessPackage.WHEN: return createWhen();
      case AdeptnessPackage.CHECKS: return createChecks();
      case AdeptnessPackage.DESCRIPTION: return createDescription();
      case AdeptnessPackage.FAIL_REASON: return createFailReason();
      case AdeptnessPackage.REASON: return createReason();
      case AdeptnessPackage.XPEAKS: return createXPeaks();
      case AdeptnessPackage.CONST_DEG: return createConstDeg();
      case AdeptnessPackage.HIGH_TIME: return createHighTime();
      case AdeptnessPackage.HIGH_PEAK: return createHighPeak();
      case AdeptnessPackage.REFERENCE: return createReference();
      case AdeptnessPackage.PRECOND_REFERENCE: return createPrecondReference();
      case AdeptnessPackage.UPPER: return createUpper();
      case AdeptnessPackage.LOWER: return createLower();
      case AdeptnessPackage.RANGE: return createRange();
      case AdeptnessPackage.GAP: return createGap();
      case AdeptnessPackage.INCLUSIVE_BOUND: return createInclusiveBound();
      case AdeptnessPackage.BOUND_UP: return createBound_up();
      case AdeptnessPackage.BOUND_DOWN: return createBound_Down();
      case AdeptnessPackage.BOOLEAN: return createBOOLEAN();
      case AdeptnessPackage.DOUBLE: return createDOUBLE();
      case AdeptnessPackage.TIME_TYPE: return createTimeType();
      case AdeptnessPackage.DATA_TYPE: return createDataType();
      case AdeptnessPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
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
  public Adeptness createAdeptness()
  {
    AdeptnessImpl adeptness = new AdeptnessImpl();
    return adeptness;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Imports createImports()
  {
    ImportsImpl imports = new ImportsImpl();
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MonitoringFile createMonitoringFile()
  {
    MonitoringFileImpl monitoringFile = new MonitoringFileImpl();
    return monitoringFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MonitoringPlan createMonitoringPlan()
  {
    MonitoringPlanImpl monitoringPlan = new MonitoringPlanImpl();
    return monitoringPlan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MonitoringVariable createMonitoringVariable()
  {
    MonitoringVariableImpl monitoringVariable = new MonitoringVariableImpl();
    return monitoringVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sig_type createSig_type()
  {
    Sig_typeImpl sig_type = new Sig_typeImpl();
    return sig_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Signal createSignal()
  {
    SignalImpl signal = new SignalImpl();
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImportMonitoringPlan createImportMonitoringPlan()
  {
    ImportMonitoringPlanImpl importMonitoringPlan = new ImportMonitoringPlanImpl();
    return importMonitoringPlan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Oracle createOracle()
  {
    OracleImpl oracle = new OracleImpl();
    return oracle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public When createWhen()
  {
    WhenImpl when = new WhenImpl();
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Checks createChecks()
  {
    ChecksImpl checks = new ChecksImpl();
    return checks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Description createDescription()
  {
    DescriptionImpl description = new DescriptionImpl();
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FailReason createFailReason()
  {
    FailReasonImpl failReason = new FailReasonImpl();
    return failReason;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Reason createReason()
  {
    ReasonImpl reason = new ReasonImpl();
    return reason;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public XPeaks createXPeaks()
  {
    XPeaksImpl xPeaks = new XPeaksImpl();
    return xPeaks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstDeg createConstDeg()
  {
    ConstDegImpl constDeg = new ConstDegImpl();
    return constDeg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HighTime createHighTime()
  {
    HighTimeImpl highTime = new HighTimeImpl();
    return highTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HighPeak createHighPeak()
  {
    HighPeakImpl highPeak = new HighPeakImpl();
    return highPeak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrecondReference createPrecondReference()
  {
    PrecondReferenceImpl precondReference = new PrecondReferenceImpl();
    return precondReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Upper createUpper()
  {
    UpperImpl upper = new UpperImpl();
    return upper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lower createLower()
  {
    LowerImpl lower = new LowerImpl();
    return lower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Gap createGap()
  {
    GapImpl gap = new GapImpl();
    return gap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InclusiveBound createInclusiveBound()
  {
    InclusiveBoundImpl inclusiveBound = new InclusiveBoundImpl();
    return inclusiveBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bound_up createBound_up()
  {
    Bound_upImpl bound_up = new Bound_upImpl();
    return bound_up;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bound_Down createBound_Down()
  {
    Bound_DownImpl bound_Down = new Bound_DownImpl();
    return bound_Down;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BOOLEAN createBOOLEAN()
  {
    BOOLEANImpl boolean_ = new BOOLEANImpl();
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DOUBLE createDOUBLE()
  {
    DOUBLEImpl double_ = new DOUBLEImpl();
    return double_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeType createTimeType()
  {
    TimeTypeImpl timeType = new TimeTypeImpl();
    return timeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AdeptnessPackage getAdeptnessPackage()
  {
    return (AdeptnessPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AdeptnessPackage getPackage()
  {
    return AdeptnessPackage.eINSTANCE;
  }

} //AdeptnessFactoryImpl
