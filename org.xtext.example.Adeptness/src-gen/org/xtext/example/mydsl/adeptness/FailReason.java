/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.adeptness;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fail Reason</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.FailReason#getHighPeak <em>High Peak</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.FailReason#getHighTime <em>High Time</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.FailReason#getConstDeg <em>Const Deg</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.FailReason#getHigPeaks <em>Hig Peaks</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getFailReason()
 * @model
 * @generated
 */
public interface FailReason extends EObject
{
  /**
   * Returns the value of the '<em><b>High Peak</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>High Peak</em>' containment reference.
   * @see #setHighPeak(HighPeak)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getFailReason_HighPeak()
   * @model containment="true"
   * @generated
   */
  HighPeak getHighPeak();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.FailReason#getHighPeak <em>High Peak</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>High Peak</em>' containment reference.
   * @see #getHighPeak()
   * @generated
   */
  void setHighPeak(HighPeak value);

  /**
   * Returns the value of the '<em><b>High Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>High Time</em>' containment reference.
   * @see #setHighTime(HighTime)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getFailReason_HighTime()
   * @model containment="true"
   * @generated
   */
  HighTime getHighTime();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.FailReason#getHighTime <em>High Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>High Time</em>' containment reference.
   * @see #getHighTime()
   * @generated
   */
  void setHighTime(HighTime value);

  /**
   * Returns the value of the '<em><b>Const Deg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const Deg</em>' containment reference.
   * @see #setConstDeg(ConstDeg)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getFailReason_ConstDeg()
   * @model containment="true"
   * @generated
   */
  ConstDeg getConstDeg();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.FailReason#getConstDeg <em>Const Deg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const Deg</em>' containment reference.
   * @see #getConstDeg()
   * @generated
   */
  void setConstDeg(ConstDeg value);

  /**
   * Returns the value of the '<em><b>Hig Peaks</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hig Peaks</em>' containment reference.
   * @see #setHigPeaks(HighPeaks)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getFailReason_HigPeaks()
   * @model containment="true"
   * @generated
   */
  HighPeaks getHigPeaks();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.FailReason#getHigPeaks <em>Hig Peaks</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hig Peaks</em>' containment reference.
   * @see #getHigPeaks()
   * @generated
   */
  void setHigPeaks(HighPeaks value);

} // FailReason
