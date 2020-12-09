/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.adeptness.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.adeptness.*;

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
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage
 * @generated
 */
public class AdeptnessSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AdeptnessPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdeptnessSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AdeptnessPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
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
      case AdeptnessPackage.ADEPTNESS:
      {
        Adeptness adeptness = (Adeptness)theEObject;
        T result = caseAdeptness(adeptness);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.IMPORTS:
      {
        Imports imports = (Imports)theEObject;
        T result = caseImports(imports);
        if (result == null) result = caseAbstractElement(imports);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseAbstractElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.MONITORING_FILE:
      {
        MonitoringFile monitoringFile = (MonitoringFile)theEObject;
        T result = caseMonitoringFile(monitoringFile);
        if (result == null) result = caseType(monitoringFile);
        if (result == null) result = caseAbstractElement(monitoringFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.MONITORING_PLAN:
      {
        MonitoringPlan monitoringPlan = (MonitoringPlan)theEObject;
        T result = caseMonitoringPlan(monitoringPlan);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.MONITORING_VARIABLE:
      {
        MonitoringVariable monitoringVariable = (MonitoringVariable)theEObject;
        T result = caseMonitoringVariable(monitoringVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.SIG_TYPE:
      {
        Sig_type sig_type = (Sig_type)theEObject;
        T result = caseSig_type(sig_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.SIGNAL:
      {
        Signal signal = (Signal)theEObject;
        T result = caseSignal(signal);
        if (result == null) result = caseType(signal);
        if (result == null) result = caseAbstractElement(signal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.IMPORT_MONITORING_PLAN:
      {
        ImportMonitoringPlan importMonitoringPlan = (ImportMonitoringPlan)theEObject;
        T result = caseImportMonitoringPlan(importMonitoringPlan);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.ORACLE:
      {
        Oracle oracle = (Oracle)theEObject;
        T result = caseOracle(oracle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.WHILE:
      {
        While while_ = (While)theEObject;
        T result = caseWhile(while_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.WHEN:
      {
        When when = (When)theEObject;
        T result = caseWhen(when);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.CHECKS:
      {
        Checks checks = (Checks)theEObject;
        T result = caseChecks(checks);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.DESCRIPTION:
      {
        Description description = (Description)theEObject;
        T result = caseDescription(description);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.FAIL_REASON:
      {
        FailReason failReason = (FailReason)theEObject;
        T result = caseFailReason(failReason);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.REASON:
      {
        Reason reason = (Reason)theEObject;
        T result = caseReason(reason);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.XPEAKS:
      {
        XPeaks xPeaks = (XPeaks)theEObject;
        T result = caseXPeaks(xPeaks);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.CONST_DEG:
      {
        ConstDeg constDeg = (ConstDeg)theEObject;
        T result = caseConstDeg(constDeg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.HIGH_TIME:
      {
        HighTime highTime = (HighTime)theEObject;
        T result = caseHighTime(highTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.HIGH_PEAK:
      {
        HighPeak highPeak = (HighPeak)theEObject;
        T result = caseHighPeak(highPeak);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.PRECOND_REFERENCE:
      {
        PrecondReference precondReference = (PrecondReference)theEObject;
        T result = casePrecondReference(precondReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.SAME:
      {
        Same same = (Same)theEObject;
        T result = caseSame(same);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.NOT_SAME:
      {
        NotSame notSame = (NotSame)theEObject;
        T result = caseNotSame(notSame);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.UPPER:
      {
        Upper upper = (Upper)theEObject;
        T result = caseUpper(upper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.LOWER:
      {
        Lower lower = (Lower)theEObject;
        T result = caseLower(lower);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.RANGE:
      {
        Range range = (Range)theEObject;
        T result = caseRange(range);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.GAP:
      {
        Gap gap = (Gap)theEObject;
        T result = caseGap(gap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.INCLUSIVE_BOUND:
      {
        InclusiveBound inclusiveBound = (InclusiveBound)theEObject;
        T result = caseInclusiveBound(inclusiveBound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.BOUND_UP:
      {
        Bound_up bound_up = (Bound_up)theEObject;
        T result = caseBound_up(bound_up);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.BOUND_DOWN:
      {
        Bound_Down bound_Down = (Bound_Down)theEObject;
        T result = caseBound_Down(bound_Down);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.BOOLEAN:
      {
        BOOLEAN boolean_ = (BOOLEAN)theEObject;
        T result = caseBOOLEAN(boolean_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.DOUBLE:
      {
        DOUBLE double_ = (DOUBLE)theEObject;
        T result = caseDOUBLE(double_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.TIME_TYPE:
      {
        TimeType timeType = (TimeType)theEObject;
        T result = caseTimeType(timeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = caseType(dataType);
        if (result == null) result = caseAbstractElement(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.PACKAGE_DECLARATION:
      {
        PackageDeclaration packageDeclaration = (PackageDeclaration)theEObject;
        T result = casePackageDeclaration(packageDeclaration);
        if (result == null) result = caseAbstractElement(packageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.EXPRESSIONS_MODEL:
      {
        ExpressionsModel expressionsModel = (ExpressionsModel)theEObject;
        T result = caseExpressionsModel(expressionsModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.ABSTRACT_ELEMENT2:
      {
        AbstractElement2 abstractElement2 = (AbstractElement2)theEObject;
        T result = caseAbstractElement2(abstractElement2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.COMP_OP:
      {
        CompOp compOp = (CompOp)theEObject;
        T result = caseCompOp(compOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.LOGIC_OP:
      {
        LogicOp logicOp = (LogicOp)theEObject;
        T result = caseLogicOp(logicOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdeptnessPackage.OP:
      {
        Op op = (Op)theEObject;
        T result = caseOp(op);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adeptness</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adeptness</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdeptness(Adeptness object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imports</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imports</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImports(Imports object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monitoring File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monitoring File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonitoringFile(MonitoringFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monitoring Plan</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monitoring Plan</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonitoringPlan(MonitoringPlan object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monitoring Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monitoring Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonitoringVariable(MonitoringVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sig type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sig type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSig_type(Sig_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignal(Signal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Monitoring Plan</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Monitoring Plan</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportMonitoringPlan(ImportMonitoringPlan object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Oracle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Oracle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOracle(Oracle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhile(While object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhen(When object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Checks</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Checks</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChecks(Checks object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescription(Description object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fail Reason</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fail Reason</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFailReason(FailReason object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reason</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reason</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReason(Reason object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XPeaks</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XPeaks</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXPeaks(XPeaks object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Const Deg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Const Deg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstDeg(ConstDeg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>High Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>High Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHighTime(HighTime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>High Peak</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>High Peak</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHighPeak(HighPeak object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precond Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precond Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrecondReference(PrecondReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Same</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Same</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSame(Same object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Same</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Same</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotSame(NotSame object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Upper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Upper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpper(Upper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lower</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lower</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLower(Lower object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRange(Range object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gap</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gap</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGap(Gap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inclusive Bound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inclusive Bound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInclusiveBound(InclusiveBound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bound up</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bound up</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBound_up(Bound_up object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bound Down</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bound Down</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBound_Down(Bound_Down object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BOOLEAN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BOOLEAN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBOOLEAN(BOOLEAN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DOUBLE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DOUBLE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDOUBLE(DOUBLE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeType(TimeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDeclaration(PackageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expressions Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expressions Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionsModel(ExpressionsModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement2(AbstractElement2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comp Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comp Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompOp(CompOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logic Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logic Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicOp(LogicOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOp(Op object)
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

} //AdeptnessSwitch
