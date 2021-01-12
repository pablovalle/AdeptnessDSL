/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.adeptness.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.adeptness.AdeptnessPackage;
import org.xtext.example.mydsl.adeptness.MonitoringFile;
import org.xtext.example.mydsl.adeptness.Test;
import org.xtext.example.mydsl.adeptness.ValidationPlan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.ValidationPlanImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.ValidationPlanImpl#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidationPlanImpl extends TypeImpl implements ValidationPlan
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected MonitoringFile superType;

  /**
   * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected EList<Test> test;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValidationPlanImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AdeptnessPackage.Literals.VALIDATION_PLAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MonitoringFile getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (MonitoringFile)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdeptnessPackage.VALIDATION_PLAN__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonitoringFile basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSuperType(MonitoringFile newSuperType)
  {
    MonitoringFile oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.VALIDATION_PLAN__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Test> getTest()
  {
    if (test == null)
    {
      test = new EObjectContainmentEList<Test>(Test.class, this, AdeptnessPackage.VALIDATION_PLAN__TEST);
    }
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AdeptnessPackage.VALIDATION_PLAN__TEST:
        return ((InternalEList<?>)getTest()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AdeptnessPackage.VALIDATION_PLAN__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case AdeptnessPackage.VALIDATION_PLAN__TEST:
        return getTest();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdeptnessPackage.VALIDATION_PLAN__SUPER_TYPE:
        setSuperType((MonitoringFile)newValue);
        return;
      case AdeptnessPackage.VALIDATION_PLAN__TEST:
        getTest().clear();
        getTest().addAll((Collection<? extends Test>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AdeptnessPackage.VALIDATION_PLAN__SUPER_TYPE:
        setSuperType((MonitoringFile)null);
        return;
      case AdeptnessPackage.VALIDATION_PLAN__TEST:
        getTest().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AdeptnessPackage.VALIDATION_PLAN__SUPER_TYPE:
        return superType != null;
      case AdeptnessPackage.VALIDATION_PLAN__TEST:
        return test != null && !test.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ValidationPlanImpl
