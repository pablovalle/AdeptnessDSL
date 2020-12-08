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
import org.xtext.example.mydsl.adeptness.Bound_Down;
import org.xtext.example.mydsl.adeptness.DOUBLE;
import org.xtext.example.mydsl.adeptness.ExpressionsModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound Down</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.Bound_DownImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.Bound_DownImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.Bound_DownImpl#getEm <em>Em</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bound_DownImpl extends MinimalEObjectImpl.Container implements Bound_Down
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
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
  protected Bound_DownImpl()
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
    return AdeptnessPackage.Literals.BOUND_DOWN;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.BOUND_DOWN__VALUE, oldValue, newValue);
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
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.BOUND_DOWN__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.BOUND_DOWN__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.BOUND_DOWN__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.BOUND_DOWN__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.BOUND_DOWN__EM, oldEm, newEm);
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
        msgs = ((InternalEObject)em).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.BOUND_DOWN__EM, null, msgs);
      if (newEm != null)
        msgs = ((InternalEObject)newEm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.BOUND_DOWN__EM, null, msgs);
      msgs = basicSetEm(newEm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.BOUND_DOWN__EM, newEm, newEm));
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
      case AdeptnessPackage.BOUND_DOWN__VALUE:
        return basicSetValue(null, msgs);
      case AdeptnessPackage.BOUND_DOWN__EM:
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
      case AdeptnessPackage.BOUND_DOWN__VALUE:
        return getValue();
      case AdeptnessPackage.BOUND_DOWN__NAME:
        return getName();
      case AdeptnessPackage.BOUND_DOWN__EM:
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
      case AdeptnessPackage.BOUND_DOWN__VALUE:
        setValue((DOUBLE)newValue);
        return;
      case AdeptnessPackage.BOUND_DOWN__NAME:
        setName((String)newValue);
        return;
      case AdeptnessPackage.BOUND_DOWN__EM:
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
      case AdeptnessPackage.BOUND_DOWN__VALUE:
        setValue((DOUBLE)null);
        return;
      case AdeptnessPackage.BOUND_DOWN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdeptnessPackage.BOUND_DOWN__EM:
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
      case AdeptnessPackage.BOUND_DOWN__VALUE:
        return value != null;
      case AdeptnessPackage.BOUND_DOWN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdeptnessPackage.BOUND_DOWN__EM:
        return em != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //Bound_DownImpl
