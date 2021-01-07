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
import org.xtext.example.mydsl.adeptness.CompOp;
import org.xtext.example.mydsl.adeptness.LogicOp;
import org.xtext.example.mydsl.adeptness.Op;
import org.xtext.example.mydsl.adeptness.Operators;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operators</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.OperatorsImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.OperatorsImpl#getComparation <em>Comparation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.OperatorsImpl#getLogicOperator <em>Logic Operator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.OperatorsImpl#getBackParentheses <em>Back Parentheses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatorsImpl extends MinimalEObjectImpl.Container implements Operators
{
  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected Op operator;

  /**
   * The cached value of the '{@link #getComparation() <em>Comparation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComparation()
   * @generated
   * @ordered
   */
  protected CompOp comparation;

  /**
   * The cached value of the '{@link #getLogicOperator() <em>Logic Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicOperator()
   * @generated
   * @ordered
   */
  protected LogicOp logicOperator;

  /**
   * The default value of the '{@link #getBackParentheses() <em>Back Parentheses</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackParentheses()
   * @generated
   * @ordered
   */
  protected static final String BACK_PARENTHESES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBackParentheses() <em>Back Parentheses</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackParentheses()
   * @generated
   * @ordered
   */
  protected String backParentheses = BACK_PARENTHESES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatorsImpl()
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
    return AdeptnessPackage.Literals.OPERATORS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Op getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperator(Op newOperator, NotificationChain msgs)
  {
    Op oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.OPERATORS__OPERATOR, oldOperator, newOperator);
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
  public void setOperator(Op newOperator)
  {
    if (newOperator != operator)
    {
      NotificationChain msgs = null;
      if (operator != null)
        msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.OPERATORS__OPERATOR, null, msgs);
      if (newOperator != null)
        msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.OPERATORS__OPERATOR, null, msgs);
      msgs = basicSetOperator(newOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.OPERATORS__OPERATOR, newOperator, newOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompOp getComparation()
  {
    return comparation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComparation(CompOp newComparation, NotificationChain msgs)
  {
    CompOp oldComparation = comparation;
    comparation = newComparation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.OPERATORS__COMPARATION, oldComparation, newComparation);
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
  public void setComparation(CompOp newComparation)
  {
    if (newComparation != comparation)
    {
      NotificationChain msgs = null;
      if (comparation != null)
        msgs = ((InternalEObject)comparation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.OPERATORS__COMPARATION, null, msgs);
      if (newComparation != null)
        msgs = ((InternalEObject)newComparation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.OPERATORS__COMPARATION, null, msgs);
      msgs = basicSetComparation(newComparation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.OPERATORS__COMPARATION, newComparation, newComparation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicOp getLogicOperator()
  {
    return logicOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLogicOperator(LogicOp newLogicOperator, NotificationChain msgs)
  {
    LogicOp oldLogicOperator = logicOperator;
    logicOperator = newLogicOperator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.OPERATORS__LOGIC_OPERATOR, oldLogicOperator, newLogicOperator);
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
  public void setLogicOperator(LogicOp newLogicOperator)
  {
    if (newLogicOperator != logicOperator)
    {
      NotificationChain msgs = null;
      if (logicOperator != null)
        msgs = ((InternalEObject)logicOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.OPERATORS__LOGIC_OPERATOR, null, msgs);
      if (newLogicOperator != null)
        msgs = ((InternalEObject)newLogicOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.OPERATORS__LOGIC_OPERATOR, null, msgs);
      msgs = basicSetLogicOperator(newLogicOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.OPERATORS__LOGIC_OPERATOR, newLogicOperator, newLogicOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBackParentheses()
  {
    return backParentheses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBackParentheses(String newBackParentheses)
  {
    String oldBackParentheses = backParentheses;
    backParentheses = newBackParentheses;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.OPERATORS__BACK_PARENTHESES, oldBackParentheses, backParentheses));
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
      case AdeptnessPackage.OPERATORS__OPERATOR:
        return basicSetOperator(null, msgs);
      case AdeptnessPackage.OPERATORS__COMPARATION:
        return basicSetComparation(null, msgs);
      case AdeptnessPackage.OPERATORS__LOGIC_OPERATOR:
        return basicSetLogicOperator(null, msgs);
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
      case AdeptnessPackage.OPERATORS__OPERATOR:
        return getOperator();
      case AdeptnessPackage.OPERATORS__COMPARATION:
        return getComparation();
      case AdeptnessPackage.OPERATORS__LOGIC_OPERATOR:
        return getLogicOperator();
      case AdeptnessPackage.OPERATORS__BACK_PARENTHESES:
        return getBackParentheses();
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
      case AdeptnessPackage.OPERATORS__OPERATOR:
        setOperator((Op)newValue);
        return;
      case AdeptnessPackage.OPERATORS__COMPARATION:
        setComparation((CompOp)newValue);
        return;
      case AdeptnessPackage.OPERATORS__LOGIC_OPERATOR:
        setLogicOperator((LogicOp)newValue);
        return;
      case AdeptnessPackage.OPERATORS__BACK_PARENTHESES:
        setBackParentheses((String)newValue);
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
      case AdeptnessPackage.OPERATORS__OPERATOR:
        setOperator((Op)null);
        return;
      case AdeptnessPackage.OPERATORS__COMPARATION:
        setComparation((CompOp)null);
        return;
      case AdeptnessPackage.OPERATORS__LOGIC_OPERATOR:
        setLogicOperator((LogicOp)null);
        return;
      case AdeptnessPackage.OPERATORS__BACK_PARENTHESES:
        setBackParentheses(BACK_PARENTHESES_EDEFAULT);
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
      case AdeptnessPackage.OPERATORS__OPERATOR:
        return operator != null;
      case AdeptnessPackage.OPERATORS__COMPARATION:
        return comparation != null;
      case AdeptnessPackage.OPERATORS__LOGIC_OPERATOR:
        return logicOperator != null;
      case AdeptnessPackage.OPERATORS__BACK_PARENTHESES:
        return BACK_PARENTHESES_EDEFAULT == null ? backParentheses != null : !BACK_PARENTHESES_EDEFAULT.equals(backParentheses);
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
    result.append(" (backParentheses: ");
    result.append(backParentheses);
    result.append(')');
    return result.toString();
  }

} //OperatorsImpl
