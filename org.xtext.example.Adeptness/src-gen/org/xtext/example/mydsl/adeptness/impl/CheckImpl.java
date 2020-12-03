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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.adeptness.AdeptnessPackage;
import org.xtext.example.mydsl.adeptness.Check;
import org.xtext.example.mydsl.adeptness.FailReason;
import org.xtext.example.mydsl.adeptness.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.CheckImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.CheckImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.CheckImpl#getFailReason <em>Fail Reason</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.CheckImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckImpl extends MinimalEObjectImpl.Container implements Check
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
   * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected Reference reference;

  /**
   * The cached value of the '{@link #getFailReason() <em>Fail Reason</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFailReason()
   * @generated
   * @ordered
   */
  protected EList<FailReason> failReason;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckImpl()
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
    return AdeptnessPackage.Literals.CHECK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.CHECK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Reference getReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReference(Reference newReference, NotificationChain msgs)
  {
    Reference oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.CHECK__REFERENCE, oldReference, newReference);
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
  public void setReference(Reference newReference)
  {
    if (newReference != reference)
    {
      NotificationChain msgs = null;
      if (reference != null)
        msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.CHECK__REFERENCE, null, msgs);
      if (newReference != null)
        msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.CHECK__REFERENCE, null, msgs);
      msgs = basicSetReference(newReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.CHECK__REFERENCE, newReference, newReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FailReason> getFailReason()
  {
    if (failReason == null)
    {
      failReason = new EObjectContainmentEList<FailReason>(FailReason.class, this, AdeptnessPackage.CHECK__FAIL_REASON);
    }
    return failReason;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.CHECK__DESCRIPTION, oldDescription, description));
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
      case AdeptnessPackage.CHECK__REFERENCE:
        return basicSetReference(null, msgs);
      case AdeptnessPackage.CHECK__FAIL_REASON:
        return ((InternalEList<?>)getFailReason()).basicRemove(otherEnd, msgs);
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
      case AdeptnessPackage.CHECK__NAME:
        return getName();
      case AdeptnessPackage.CHECK__REFERENCE:
        return getReference();
      case AdeptnessPackage.CHECK__FAIL_REASON:
        return getFailReason();
      case AdeptnessPackage.CHECK__DESCRIPTION:
        return getDescription();
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
      case AdeptnessPackage.CHECK__NAME:
        setName((String)newValue);
        return;
      case AdeptnessPackage.CHECK__REFERENCE:
        setReference((Reference)newValue);
        return;
      case AdeptnessPackage.CHECK__FAIL_REASON:
        getFailReason().clear();
        getFailReason().addAll((Collection<? extends FailReason>)newValue);
        return;
      case AdeptnessPackage.CHECK__DESCRIPTION:
        setDescription((String)newValue);
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
      case AdeptnessPackage.CHECK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdeptnessPackage.CHECK__REFERENCE:
        setReference((Reference)null);
        return;
      case AdeptnessPackage.CHECK__FAIL_REASON:
        getFailReason().clear();
        return;
      case AdeptnessPackage.CHECK__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
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
      case AdeptnessPackage.CHECK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdeptnessPackage.CHECK__REFERENCE:
        return reference != null;
      case AdeptnessPackage.CHECK__FAIL_REASON:
        return failReason != null && !failReason.isEmpty();
      case AdeptnessPackage.CHECK__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //CheckImpl
