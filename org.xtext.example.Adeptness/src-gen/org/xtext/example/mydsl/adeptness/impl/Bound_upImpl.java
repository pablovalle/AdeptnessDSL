/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.adeptness.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.adeptness.AdeptnessPackage;
import org.xtext.example.mydsl.adeptness.Bound_up;
import org.xtext.example.mydsl.adeptness.DOUBLE;
import org.xtext.example.mydsl.adeptness.ExpressionsModel;
import org.xtext.example.mydsl.adeptness.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound up</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.Bound_upImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.Bound_upImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.Bound_upImpl#getEm <em>Em</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bound_upImpl extends MinimalEObjectImpl.Container implements Bound_up
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected DOUBLE value;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variable variable;

  /**
   * The cached value of the '{@link #getEm() <em>Em</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEm()
   * @generated
   * @ordered
   */
  protected ExpressionsModel em;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Bound_upImpl()
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
    return AdeptnessPackage.Literals.BOUND_UP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DOUBLE getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(DOUBLE newValue, NotificationChain msgs)
  {
    DOUBLE oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.BOUND_UP__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(DOUBLE newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.BOUND_UP__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.BOUND_UP__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.BOUND_UP__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs)
  {
    Variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.BOUND_UP__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariable(Variable newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.BOUND_UP__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.BOUND_UP__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.BOUND_UP__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionsModel getEm()
  {
    return em;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEm(ExpressionsModel newEm, NotificationChain msgs)
  {
    ExpressionsModel oldEm = em;
    em = newEm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.BOUND_UP__EM, oldEm, newEm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEm(ExpressionsModel newEm)
  {
    if (newEm != em)
    {
      NotificationChain msgs = null;
      if (em != null)
        msgs = ((InternalEObject)em).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.BOUND_UP__EM, null, msgs);
      if (newEm != null)
        msgs = ((InternalEObject)newEm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.BOUND_UP__EM, null, msgs);
      msgs = basicSetEm(newEm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.BOUND_UP__EM, newEm, newEm));
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
      case AdeptnessPackage.BOUND_UP__VALUE:
        return basicSetValue(null, msgs);
      case AdeptnessPackage.BOUND_UP__VARIABLE:
        return basicSetVariable(null, msgs);
      case AdeptnessPackage.BOUND_UP__EM:
        return basicSetEm(null, msgs);
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
      case AdeptnessPackage.BOUND_UP__VALUE:
        return getValue();
      case AdeptnessPackage.BOUND_UP__VARIABLE:
        return getVariable();
      case AdeptnessPackage.BOUND_UP__EM:
        return getEm();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdeptnessPackage.BOUND_UP__VALUE:
        setValue((DOUBLE)newValue);
        return;
      case AdeptnessPackage.BOUND_UP__VARIABLE:
        setVariable((Variable)newValue);
        return;
      case AdeptnessPackage.BOUND_UP__EM:
        setEm((ExpressionsModel)newValue);
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
      case AdeptnessPackage.BOUND_UP__VALUE:
        setValue((DOUBLE)null);
        return;
      case AdeptnessPackage.BOUND_UP__VARIABLE:
        setVariable((Variable)null);
        return;
      case AdeptnessPackage.BOUND_UP__EM:
        setEm((ExpressionsModel)null);
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
      case AdeptnessPackage.BOUND_UP__VALUE:
        return value != null;
      case AdeptnessPackage.BOUND_UP__VARIABLE:
        return variable != null;
      case AdeptnessPackage.BOUND_UP__EM:
        return em != null;
    }
    return super.eIsSet(featureID);
  }

} //Bound_upImpl
