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
import org.xtext.example.mydsl.adeptness.At_least;
import org.xtext.example.mydsl.adeptness.At_most;
import org.xtext.example.mydsl.adeptness.Bound_up;
import org.xtext.example.mydsl.adeptness.Exactly;
import org.xtext.example.mydsl.adeptness.Same;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Same</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.SameImpl#getBound_upp <em>Bound upp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.SameImpl#getExactly <em>Exactly</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.SameImpl#getAtmost <em>Atmost</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.SameImpl#getAtleast <em>Atleast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SameImpl extends MinimalEObjectImpl.Container implements Same
{
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
  protected SameImpl()
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
    return AdeptnessPackage.Literals.SAME;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.SAME__BOUND_UPP, oldBound_upp, newBound_upp);
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
        msgs = ((InternalEObject)bound_upp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.SAME__BOUND_UPP, null, msgs);
      if (newBound_upp != null)
        msgs = ((InternalEObject)newBound_upp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.SAME__BOUND_UPP, null, msgs);
      msgs = basicSetBound_upp(newBound_upp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.SAME__BOUND_UPP, newBound_upp, newBound_upp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.SAME__EXACTLY, oldExactly, newExactly);
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
        msgs = ((InternalEObject)exactly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.SAME__EXACTLY, null, msgs);
      if (newExactly != null)
        msgs = ((InternalEObject)newExactly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.SAME__EXACTLY, null, msgs);
      msgs = basicSetExactly(newExactly, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.SAME__EXACTLY, newExactly, newExactly));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.SAME__ATMOST, oldAtmost, newAtmost);
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
        msgs = ((InternalEObject)atmost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.SAME__ATMOST, null, msgs);
      if (newAtmost != null)
        msgs = ((InternalEObject)newAtmost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.SAME__ATMOST, null, msgs);
      msgs = basicSetAtmost(newAtmost, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.SAME__ATMOST, newAtmost, newAtmost));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.SAME__ATLEAST, oldAtleast, newAtleast);
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
        msgs = ((InternalEObject)atleast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.SAME__ATLEAST, null, msgs);
      if (newAtleast != null)
        msgs = ((InternalEObject)newAtleast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.SAME__ATLEAST, null, msgs);
      msgs = basicSetAtleast(newAtleast, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.SAME__ATLEAST, newAtleast, newAtleast));
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
      case AdeptnessPackage.SAME__BOUND_UPP:
        return basicSetBound_upp(null, msgs);
      case AdeptnessPackage.SAME__EXACTLY:
        return basicSetExactly(null, msgs);
      case AdeptnessPackage.SAME__ATMOST:
        return basicSetAtmost(null, msgs);
      case AdeptnessPackage.SAME__ATLEAST:
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
      case AdeptnessPackage.SAME__BOUND_UPP:
        return getBound_upp();
      case AdeptnessPackage.SAME__EXACTLY:
        return getExactly();
      case AdeptnessPackage.SAME__ATMOST:
        return getAtmost();
      case AdeptnessPackage.SAME__ATLEAST:
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
      case AdeptnessPackage.SAME__BOUND_UPP:
        setBound_upp((Bound_up)newValue);
        return;
      case AdeptnessPackage.SAME__EXACTLY:
        setExactly((Exactly)newValue);
        return;
      case AdeptnessPackage.SAME__ATMOST:
        setAtmost((At_most)newValue);
        return;
      case AdeptnessPackage.SAME__ATLEAST:
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
      case AdeptnessPackage.SAME__BOUND_UPP:
        setBound_upp((Bound_up)null);
        return;
      case AdeptnessPackage.SAME__EXACTLY:
        setExactly((Exactly)null);
        return;
      case AdeptnessPackage.SAME__ATMOST:
        setAtmost((At_most)null);
        return;
      case AdeptnessPackage.SAME__ATLEAST:
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
      case AdeptnessPackage.SAME__BOUND_UPP:
        return bound_upp != null;
      case AdeptnessPackage.SAME__EXACTLY:
        return exactly != null;
      case AdeptnessPackage.SAME__ATMOST:
        return atmost != null;
      case AdeptnessPackage.SAME__ATLEAST:
        return atleast != null;
    }
    return super.eIsSet(featureID);
  }

} //SameImpl
