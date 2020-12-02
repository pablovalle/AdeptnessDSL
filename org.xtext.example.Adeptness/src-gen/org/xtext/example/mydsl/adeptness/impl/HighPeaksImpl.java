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
import org.xtext.example.mydsl.adeptness.DOUBLE;
import org.xtext.example.mydsl.adeptness.HighPeaks;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>High Peaks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.HighPeaksImpl#getCant <em>Cant</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.impl.HighPeaksImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HighPeaksImpl extends MinimalEObjectImpl.Container implements HighPeaks
{
  /**
   * The cached value of the '{@link #getCant() <em>Cant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCant()
   * @generated
   * @ordered
   */
  protected DOUBLE cant;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected DOUBLE time;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HighPeaksImpl()
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
    return AdeptnessPackage.Literals.HIGH_PEAKS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DOUBLE getCant()
  {
    return cant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCant(DOUBLE newCant, NotificationChain msgs)
  {
    DOUBLE oldCant = cant;
    cant = newCant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.HIGH_PEAKS__CANT, oldCant, newCant);
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
  public void setCant(DOUBLE newCant)
  {
    if (newCant != cant)
    {
      NotificationChain msgs = null;
      if (cant != null)
        msgs = ((InternalEObject)cant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.HIGH_PEAKS__CANT, null, msgs);
      if (newCant != null)
        msgs = ((InternalEObject)newCant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.HIGH_PEAKS__CANT, null, msgs);
      msgs = basicSetCant(newCant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.HIGH_PEAKS__CANT, newCant, newCant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DOUBLE getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTime(DOUBLE newTime, NotificationChain msgs)
  {
    DOUBLE oldTime = time;
    time = newTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdeptnessPackage.HIGH_PEAKS__TIME, oldTime, newTime);
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
  public void setTime(DOUBLE newTime)
  {
    if (newTime != time)
    {
      NotificationChain msgs = null;
      if (time != null)
        msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.HIGH_PEAKS__TIME, null, msgs);
      if (newTime != null)
        msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdeptnessPackage.HIGH_PEAKS__TIME, null, msgs);
      msgs = basicSetTime(newTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdeptnessPackage.HIGH_PEAKS__TIME, newTime, newTime));
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
      case AdeptnessPackage.HIGH_PEAKS__CANT:
        return basicSetCant(null, msgs);
      case AdeptnessPackage.HIGH_PEAKS__TIME:
        return basicSetTime(null, msgs);
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
      case AdeptnessPackage.HIGH_PEAKS__CANT:
        return getCant();
      case AdeptnessPackage.HIGH_PEAKS__TIME:
        return getTime();
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
      case AdeptnessPackage.HIGH_PEAKS__CANT:
        setCant((DOUBLE)newValue);
        return;
      case AdeptnessPackage.HIGH_PEAKS__TIME:
        setTime((DOUBLE)newValue);
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
      case AdeptnessPackage.HIGH_PEAKS__CANT:
        setCant((DOUBLE)null);
        return;
      case AdeptnessPackage.HIGH_PEAKS__TIME:
        setTime((DOUBLE)null);
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
      case AdeptnessPackage.HIGH_PEAKS__CANT:
        return cant != null;
      case AdeptnessPackage.HIGH_PEAKS__TIME:
        return time != null;
    }
    return super.eIsSet(featureID);
  }

} //HighPeaksImpl
