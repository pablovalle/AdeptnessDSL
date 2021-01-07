/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.adeptness.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.adeptness.AbstractElement2;
import org.xtext.example.mydsl.adeptness.AdeptnessPackage;
import org.xtext.example.mydsl.adeptness.DOUBLE;
import org.xtext.example.mydsl.adeptness.Operators;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Element2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.AbstractElement2Impl#getFrontParentheses <em>Front Parentheses</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.AbstractElement2Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.AbstractElement2Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.AbstractElement2Impl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractElement2Impl extends MinimalEObjectImpl.Container implements AbstractElement2
{
  /**
   * The cached value of the '{@link #getFrontParentheses() <em>Front Parentheses</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrontParentheses()
   * @generated
   * @ordered
   */
  protected EList<String> frontParentheses;

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
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected DOUBLE value;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected EList<Operators> op;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractElement2Impl()
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
    return AdeptnessPackage.Literals.ABSTRACT_ELEMENT2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getFrontParentheses()
  {
    if (frontParentheses == null)
    {
      frontParentheses = new EDataTypeEList<String>(String.class, this, AdeptnessPackage.ABSTRACT_ELEMENT2__FRONT_PARENTHESES);
    }
    return frontParentheses;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.ABSTRACT_ELEMENT2__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.ABSTRACT_ELEMENT2__VALUE, oldValue, newValue);
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
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.ABSTRACT_ELEMENT2__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.ABSTRACT_ELEMENT2__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.ABSTRACT_ELEMENT2__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Operators> getOp()
  {
    if (op == null)
    {
      op = new EObjectContainmentEList<Operators>(Operators.class, this, AdeptnessPackage.ABSTRACT_ELEMENT2__OP);
    }
    return op;
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
      case AdeptnessPackage.ABSTRACT_ELEMENT2__VALUE:
        return basicSetValue(null, msgs);
      case AdeptnessPackage.ABSTRACT_ELEMENT2__OP:
        return ((InternalEList<?>)getOp()).basicRemove(otherEnd, msgs);
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
      case AdeptnessPackage.ABSTRACT_ELEMENT2__FRONT_PARENTHESES:
        return getFrontParentheses();
      case AdeptnessPackage.ABSTRACT_ELEMENT2__NAME:
        return getName();
      case AdeptnessPackage.ABSTRACT_ELEMENT2__VALUE:
        return getValue();
      case AdeptnessPackage.ABSTRACT_ELEMENT2__OP:
        return getOp();
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
      case AdeptnessPackage.ABSTRACT_ELEMENT2__FRONT_PARENTHESES:
        getFrontParentheses().clear();
        getFrontParentheses().addAll((Collection<? extends String>)newValue);
        return;
      case AdeptnessPackage.ABSTRACT_ELEMENT2__NAME:
        setName((String)newValue);
        return;
      case AdeptnessPackage.ABSTRACT_ELEMENT2__VALUE:
        setValue((DOUBLE)newValue);
        return;
      case AdeptnessPackage.ABSTRACT_ELEMENT2__OP:
        getOp().clear();
        getOp().addAll((Collection<? extends Operators>)newValue);
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
      case AdeptnessPackage.ABSTRACT_ELEMENT2__FRONT_PARENTHESES:
        getFrontParentheses().clear();
        return;
      case AdeptnessPackage.ABSTRACT_ELEMENT2__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdeptnessPackage.ABSTRACT_ELEMENT2__VALUE:
        setValue((DOUBLE)null);
        return;
      case AdeptnessPackage.ABSTRACT_ELEMENT2__OP:
        getOp().clear();
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
      case AdeptnessPackage.ABSTRACT_ELEMENT2__FRONT_PARENTHESES:
        return frontParentheses != null && !frontParentheses.isEmpty();
      case AdeptnessPackage.ABSTRACT_ELEMENT2__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdeptnessPackage.ABSTRACT_ELEMENT2__VALUE:
        return value != null;
      case AdeptnessPackage.ABSTRACT_ELEMENT2__OP:
        return op != null && !op.isEmpty();
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
    result.append(" (frontParentheses: ");
    result.append(frontParentheses);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AbstractElement2Impl
