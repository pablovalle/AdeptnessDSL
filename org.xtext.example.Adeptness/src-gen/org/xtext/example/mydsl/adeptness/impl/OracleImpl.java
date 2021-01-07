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
import org.xtext.example.mydsl.adeptness.Checks;
import org.xtext.example.mydsl.adeptness.Oracle;
import org.xtext.example.mydsl.adeptness.When;
import org.xtext.example.mydsl.adeptness.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oracle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.OracleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.OracleImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.OracleImpl#getWhile <em>While</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.OracleImpl#getCheck <em>Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OracleImpl extends MinimalEObjectImpl.Container implements Oracle
{
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
   * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhen()
   * @generated
   * @ordered
   */
  protected When when;

  /**
   * The cached value of the '{@link #getWhile() <em>While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhile()
   * @generated
   * @ordered
   */
  protected While while_;

  /**
   * The cached value of the '{@link #getCheck() <em>Check</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheck()
   * @generated
   * @ordered
   */
  protected Checks check;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OracleImpl()
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
    return AdeptnessPackage.Literals.ORACLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.ORACLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public When getWhen()
  {
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhen(When newWhen, NotificationChain msgs)
  {
    When oldWhen = when;
    when = newWhen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.ORACLE__WHEN, oldWhen, newWhen);
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
  public void setWhen(When newWhen)
  {
    if (newWhen != when)
    {
      NotificationChain msgs = null;
      if (when != null)
        msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.ORACLE__WHEN, null, msgs);
      if (newWhen != null)
        msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.ORACLE__WHEN, null, msgs);
      msgs = basicSetWhen(newWhen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.ORACLE__WHEN, newWhen, newWhen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public While getWhile()
  {
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhile(While newWhile, NotificationChain msgs)
  {
    While oldWhile = while_;
    while_ = newWhile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.ORACLE__WHILE, oldWhile, newWhile);
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
  public void setWhile(While newWhile)
  {
    if (newWhile != while_)
    {
      NotificationChain msgs = null;
      if (while_ != null)
        msgs = ((InternalEObject)while_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.ORACLE__WHILE, null, msgs);
      if (newWhile != null)
        msgs = ((InternalEObject)newWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.ORACLE__WHILE, null, msgs);
      msgs = basicSetWhile(newWhile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.ORACLE__WHILE, newWhile, newWhile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Checks getCheck()
  {
    return check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCheck(Checks newCheck, NotificationChain msgs)
  {
    Checks oldCheck = check;
    check = newCheck;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.ORACLE__CHECK, oldCheck, newCheck);
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
  public void setCheck(Checks newCheck)
  {
    if (newCheck != check)
    {
      NotificationChain msgs = null;
      if (check != null)
        msgs = ((InternalEObject)check).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.ORACLE__CHECK, null, msgs);
      if (newCheck != null)
        msgs = ((InternalEObject)newCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.ORACLE__CHECK, null, msgs);
      msgs = basicSetCheck(newCheck, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.ORACLE__CHECK, newCheck, newCheck));
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
      case AdeptnessPackage.ORACLE__WHEN:
        return basicSetWhen(null, msgs);
      case AdeptnessPackage.ORACLE__WHILE:
        return basicSetWhile(null, msgs);
      case AdeptnessPackage.ORACLE__CHECK:
        return basicSetCheck(null, msgs);
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
      case AdeptnessPackage.ORACLE__NAME:
        return getName();
      case AdeptnessPackage.ORACLE__WHEN:
        return getWhen();
      case AdeptnessPackage.ORACLE__WHILE:
        return getWhile();
      case AdeptnessPackage.ORACLE__CHECK:
        return getCheck();
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
      case AdeptnessPackage.ORACLE__NAME:
        setName((String)newValue);
        return;
      case AdeptnessPackage.ORACLE__WHEN:
        setWhen((When)newValue);
        return;
      case AdeptnessPackage.ORACLE__WHILE:
        setWhile((While)newValue);
        return;
      case AdeptnessPackage.ORACLE__CHECK:
        setCheck((Checks)newValue);
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
      case AdeptnessPackage.ORACLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdeptnessPackage.ORACLE__WHEN:
        setWhen((When)null);
        return;
      case AdeptnessPackage.ORACLE__WHILE:
        setWhile((While)null);
        return;
      case AdeptnessPackage.ORACLE__CHECK:
        setCheck((Checks)null);
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
      case AdeptnessPackage.ORACLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdeptnessPackage.ORACLE__WHEN:
        return when != null;
      case AdeptnessPackage.ORACLE__WHILE:
        return while_ != null;
      case AdeptnessPackage.ORACLE__CHECK:
        return check != null;
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

} //OracleImpl
