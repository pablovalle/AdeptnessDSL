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
import org.xtext.example.mydsl.adeptness.Bound_Down;
import org.xtext.example.mydsl.adeptness.Bound_up;
import org.xtext.example.mydsl.adeptness.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.RangeImpl#getBound_lower <em>Bound lower</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.RangeImpl#getBound_upp <em>Bound upp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeImpl extends MinimalEObjectImpl.Container implements Range
{
  /**
   * The cached value of the '{@link #getBound_lower() <em>Bound lower</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBound_lower()
   * @generated
   * @ordered
   */
  protected Bound_Down bound_lower;

  /**
   * The cached value of the '{@link #getBound_upp() <em>Bound upp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBound_upp()
   * @generated
   * @ordered
   */
  protected Bound_up bound_upp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RangeImpl()
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
    return AdeptnessPackage.Literals.RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bound_Down getBound_lower()
  {
    return bound_lower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBound_lower(Bound_Down newBound_lower, NotificationChain msgs)
  {
    Bound_Down oldBound_lower = bound_lower;
    bound_lower = newBound_lower;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.RANGE__BOUND_LOWER, oldBound_lower, newBound_lower);
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
  public void setBound_lower(Bound_Down newBound_lower)
  {
    if (newBound_lower != bound_lower)
    {
      NotificationChain msgs = null;
      if (bound_lower != null)
        msgs = ((InternalEObject)bound_lower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.RANGE__BOUND_LOWER, null, msgs);
      if (newBound_lower != null)
        msgs = ((InternalEObject)newBound_lower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.RANGE__BOUND_LOWER, null, msgs);
      msgs = basicSetBound_lower(newBound_lower, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.RANGE__BOUND_LOWER, newBound_lower, newBound_lower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bound_up getBound_upp()
  {
    return bound_upp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBound_upp(Bound_up newBound_upp, NotificationChain msgs)
  {
    Bound_up oldBound_upp = bound_upp;
    bound_upp = newBound_upp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.RANGE__BOUND_UPP, oldBound_upp, newBound_upp);
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
  public void setBound_upp(Bound_up newBound_upp)
  {
    if (newBound_upp != bound_upp)
    {
      NotificationChain msgs = null;
      if (bound_upp != null)
        msgs = ((InternalEObject)bound_upp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.RANGE__BOUND_UPP, null, msgs);
      if (newBound_upp != null)
        msgs = ((InternalEObject)newBound_upp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.RANGE__BOUND_UPP, null, msgs);
      msgs = basicSetBound_upp(newBound_upp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.RANGE__BOUND_UPP, newBound_upp, newBound_upp));
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
      case AdeptnessPackage.RANGE__BOUND_LOWER:
        return basicSetBound_lower(null, msgs);
      case AdeptnessPackage.RANGE__BOUND_UPP:
        return basicSetBound_upp(null, msgs);
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
      case AdeptnessPackage.RANGE__BOUND_LOWER:
        return getBound_lower();
      case AdeptnessPackage.RANGE__BOUND_UPP:
        return getBound_upp();
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
      case AdeptnessPackage.RANGE__BOUND_LOWER:
        setBound_lower((Bound_Down)newValue);
        return;
      case AdeptnessPackage.RANGE__BOUND_UPP:
        setBound_upp((Bound_up)newValue);
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
      case AdeptnessPackage.RANGE__BOUND_LOWER:
        setBound_lower((Bound_Down)null);
        return;
      case AdeptnessPackage.RANGE__BOUND_UPP:
        setBound_upp((Bound_up)null);
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
      case AdeptnessPackage.RANGE__BOUND_LOWER:
        return bound_lower != null;
      case AdeptnessPackage.RANGE__BOUND_UPP:
        return bound_upp != null;
    }
    return super.eIsSet(featureID);
  }

} //RangeImpl
