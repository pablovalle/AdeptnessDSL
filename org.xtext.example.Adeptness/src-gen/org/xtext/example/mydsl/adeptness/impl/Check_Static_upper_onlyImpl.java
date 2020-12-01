/**
 * generated by Xtext 2.21.0
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
import org.xtext.example.mydsl.adeptness.Check_Static_upper_only;
import org.xtext.example.mydsl.adeptness.InclusiveBound;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Static upper only</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.Check_Static_upper_onlyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.Check_Static_upper_onlyImpl#getInclusive_bound <em>Inclusive bound</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.Check_Static_upper_onlyImpl#getBound_up <em>Bound up</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Check_Static_upper_onlyImpl extends MinimalEObjectImpl.Container implements Check_Static_upper_only
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
   * The cached value of the '{@link #getInclusive_bound() <em>Inclusive bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclusive_bound()
   * @generated
   * @ordered
   */
  protected InclusiveBound inclusive_bound;

  /**
   * The cached value of the '{@link #getBound_up() <em>Bound up</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBound_up()
   * @generated
   * @ordered
   */
  protected Bound_up bound_up;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Check_Static_upper_onlyImpl()
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
    return AdeptnessPackage.Literals.CHECK_STATIC_UPPER_ONLY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InclusiveBound getInclusive_bound()
  {
    return inclusive_bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInclusive_bound(InclusiveBound newInclusive_bound, NotificationChain msgs)
  {
    InclusiveBound oldInclusive_bound = inclusive_bound;
    inclusive_bound = newInclusive_bound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__INCLUSIVE_BOUND, oldInclusive_bound, newInclusive_bound);
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
  public void setInclusive_bound(InclusiveBound newInclusive_bound)
  {
    if (newInclusive_bound != inclusive_bound)
    {
      NotificationChain msgs = null;
      if (inclusive_bound != null)
        msgs = ((InternalEObject)inclusive_bound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__INCLUSIVE_BOUND, null, msgs);
      if (newInclusive_bound != null)
        msgs = ((InternalEObject)newInclusive_bound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__INCLUSIVE_BOUND, null, msgs);
      msgs = basicSetInclusive_bound(newInclusive_bound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__INCLUSIVE_BOUND, newInclusive_bound, newInclusive_bound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bound_up getBound_up()
  {
    return bound_up;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBound_up(Bound_up newBound_up, NotificationChain msgs)
  {
    Bound_up oldBound_up = bound_up;
    bound_up = newBound_up;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__BOUND_UP, oldBound_up, newBound_up);
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
  public void setBound_up(Bound_up newBound_up)
  {
    if (newBound_up != bound_up)
    {
      NotificationChain msgs = null;
      if (bound_up != null)
        msgs = ((InternalEObject)bound_up).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__BOUND_UP, null, msgs);
      if (newBound_up != null)
        msgs = ((InternalEObject)newBound_up).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__BOUND_UP, null, msgs);
      msgs = basicSetBound_up(newBound_up, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__BOUND_UP, newBound_up, newBound_up));
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
      case AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__INCLUSIVE_BOUND:
        return basicSetInclusive_bound(null, msgs);
      case AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__BOUND_UP:
        return basicSetBound_up(null, msgs);
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
      case AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__NAME:
        return getName();
      case AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__INCLUSIVE_BOUND:
        return getInclusive_bound();
      case AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__BOUND_UP:
        return getBound_up();
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
      case AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__NAME:
        setName((String)newValue);
        return;
      case AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__INCLUSIVE_BOUND:
        setInclusive_bound((InclusiveBound)newValue);
        return;
      case AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__BOUND_UP:
        setBound_up((Bound_up)newValue);
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
      case AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__INCLUSIVE_BOUND:
        setInclusive_bound((InclusiveBound)null);
        return;
      case AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__BOUND_UP:
        setBound_up((Bound_up)null);
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
      case AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__INCLUSIVE_BOUND:
        return inclusive_bound != null;
      case AdeptnessPackage.CHECK_STATIC_UPPER_ONLY__BOUND_UP:
        return bound_up != null;
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

} //Check_Static_upper_onlyImpl
