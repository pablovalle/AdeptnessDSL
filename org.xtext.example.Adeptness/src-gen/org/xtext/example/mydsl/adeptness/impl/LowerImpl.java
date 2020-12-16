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
import org.xtext.example.mydsl.adeptness.At_least;
import org.xtext.example.mydsl.adeptness.At_most;
import org.xtext.example.mydsl.adeptness.Bound_Down;
import org.xtext.example.mydsl.adeptness.Exactly;
import org.xtext.example.mydsl.adeptness.Lower;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lower</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.LowerImpl#getBound_lower <em>Bound lower</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.LowerImpl#getExactly <em>Exactly</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.LowerImpl#getAtmost <em>Atmost</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.LowerImpl#getAtleast <em>Atleast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LowerImpl extends MinimalEObjectImpl.Container implements Lower
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
   * The cached value of the '{@link #getExactly() <em>Exactly</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExactly()
   * @generated
   * @ordered
   */
  protected Exactly exactly;

  /**
   * The cached value of the '{@link #getAtmost() <em>Atmost</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtmost()
   * @generated
   * @ordered
   */
  protected At_most atmost;

  /**
   * The cached value of the '{@link #getAtleast() <em>Atleast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtleast()
   * @generated
   * @ordered
   */
  protected At_least atleast;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LowerImpl()
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
    return AdeptnessPackage.Literals.LOWER;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.LOWER__BOUND_LOWER, oldBound_lower, newBound_lower);
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
        msgs = ((InternalEObject)bound_lower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.LOWER__BOUND_LOWER, null, msgs);
      if (newBound_lower != null)
        msgs = ((InternalEObject)newBound_lower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.LOWER__BOUND_LOWER, null, msgs);
      msgs = basicSetBound_lower(newBound_lower, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.LOWER__BOUND_LOWER, newBound_lower, newBound_lower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Exactly getExactly()
  {
    return exactly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExactly(Exactly newExactly, NotificationChain msgs)
  {
    Exactly oldExactly = exactly;
    exactly = newExactly;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.LOWER__EXACTLY, oldExactly, newExactly);
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
  public void setExactly(Exactly newExactly)
  {
    if (newExactly != exactly)
    {
      NotificationChain msgs = null;
      if (exactly != null)
        msgs = ((InternalEObject)exactly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.LOWER__EXACTLY, null, msgs);
      if (newExactly != null)
        msgs = ((InternalEObject)newExactly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.LOWER__EXACTLY, null, msgs);
      msgs = basicSetExactly(newExactly, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.LOWER__EXACTLY, newExactly, newExactly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public At_most getAtmost()
  {
    return atmost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtmost(At_most newAtmost, NotificationChain msgs)
  {
    At_most oldAtmost = atmost;
    atmost = newAtmost;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.LOWER__ATMOST, oldAtmost, newAtmost);
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
  public void setAtmost(At_most newAtmost)
  {
    if (newAtmost != atmost)
    {
      NotificationChain msgs = null;
      if (atmost != null)
        msgs = ((InternalEObject)atmost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.LOWER__ATMOST, null, msgs);
      if (newAtmost != null)
        msgs = ((InternalEObject)newAtmost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.LOWER__ATMOST, null, msgs);
      msgs = basicSetAtmost(newAtmost, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.LOWER__ATMOST, newAtmost, newAtmost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public At_least getAtleast()
  {
    return atleast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtleast(At_least newAtleast, NotificationChain msgs)
  {
    At_least oldAtleast = atleast;
    atleast = newAtleast;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.LOWER__ATLEAST, oldAtleast, newAtleast);
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
  public void setAtleast(At_least newAtleast)
  {
    if (newAtleast != atleast)
    {
      NotificationChain msgs = null;
      if (atleast != null)
        msgs = ((InternalEObject)atleast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.LOWER__ATLEAST, null, msgs);
      if (newAtleast != null)
        msgs = ((InternalEObject)newAtleast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.LOWER__ATLEAST, null, msgs);
      msgs = basicSetAtleast(newAtleast, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.LOWER__ATLEAST, newAtleast, newAtleast));
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
      case AdeptnessPackage.LOWER__BOUND_LOWER:
        return basicSetBound_lower(null, msgs);
      case AdeptnessPackage.LOWER__EXACTLY:
        return basicSetExactly(null, msgs);
      case AdeptnessPackage.LOWER__ATMOST:
        return basicSetAtmost(null, msgs);
      case AdeptnessPackage.LOWER__ATLEAST:
        return basicSetAtleast(null, msgs);
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
      case AdeptnessPackage.LOWER__BOUND_LOWER:
        return getBound_lower();
      case AdeptnessPackage.LOWER__EXACTLY:
        return getExactly();
      case AdeptnessPackage.LOWER__ATMOST:
        return getAtmost();
      case AdeptnessPackage.LOWER__ATLEAST:
        return getAtleast();
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
      case AdeptnessPackage.LOWER__BOUND_LOWER:
        setBound_lower((Bound_Down)newValue);
        return;
      case AdeptnessPackage.LOWER__EXACTLY:
        setExactly((Exactly)newValue);
        return;
      case AdeptnessPackage.LOWER__ATMOST:
        setAtmost((At_most)newValue);
        return;
      case AdeptnessPackage.LOWER__ATLEAST:
        setAtleast((At_least)newValue);
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
      case AdeptnessPackage.LOWER__BOUND_LOWER:
        setBound_lower((Bound_Down)null);
        return;
      case AdeptnessPackage.LOWER__EXACTLY:
        setExactly((Exactly)null);
        return;
      case AdeptnessPackage.LOWER__ATMOST:
        setAtmost((At_most)null);
        return;
      case AdeptnessPackage.LOWER__ATLEAST:
        setAtleast((At_least)null);
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
      case AdeptnessPackage.LOWER__BOUND_LOWER:
        return bound_lower != null;
      case AdeptnessPackage.LOWER__EXACTLY:
        return exactly != null;
      case AdeptnessPackage.LOWER__ATMOST:
        return atmost != null;
      case AdeptnessPackage.LOWER__ATLEAST:
        return atleast != null;
    }
    return super.eIsSet(featureID);
  }

} //LowerImpl
