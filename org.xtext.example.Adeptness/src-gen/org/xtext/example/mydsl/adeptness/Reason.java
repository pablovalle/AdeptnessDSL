/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.adeptness;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reason</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Reason#getHighPeak <em>High Peak</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Reason#getHighTime <em>High Time</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Reason#getConstDeg <em>Const Deg</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Reason#getXPeaks <em>XPeaks</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getReason()
 * @model
 * @generated
 */
public interface Reason extends EObject
{
  /**
   * Returns the value of the '<em><b>High Peak</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>High Peak</em>' containment reference.
   * @see #setHighPeak(HighPeak)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getReason_HighPeak()
   * @model containment="true"
   * @generated
   */
  HighPeak getHighPeak();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Reason#getHighPeak <em>High Peak</em>}' containment reference.
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
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getReason_HighTime()
   * @model containment="true"
   * @generated
   */
  HighTime getHighTime();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Reason#getHighTime <em>High Time</em>}' containment reference.
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
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getReason_ConstDeg()
   * @model containment="true"
   * @generated
   */
  ConstDeg getConstDeg();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Reason#getConstDeg <em>Const Deg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const Deg</em>' containment reference.
   * @see #getConstDeg()
   * @generated
   */
  void setConstDeg(ConstDeg value);

  /**
   * Returns the value of the '<em><b>XPeaks</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>XPeaks</em>' containment reference.
   * @see #setXPeaks(XPeaks)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getReason_XPeaks()
   * @model containment="true"
   * @generated
   */
  XPeaks getXPeaks();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Reason#getXPeaks <em>XPeaks</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>XPeaks</em>' containment reference.
   * @see #getXPeaks()
   * @generated
   */
  void setXPeaks(XPeaks value);

} // Reason