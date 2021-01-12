/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.adeptness;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XPeaks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.XPeaks#getCant <em>Cant</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.XPeaks#getNPeaks <em>NPeaks</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.XPeaks#getTime <em>Time</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.XPeaks#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getXPeaks()
 * @model
 * @generated
 */
public interface XPeaks extends EObject
{
  /**
   * Returns the value of the '<em><b>Cant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cant</em>' containment reference.
   * @see #setCant(DOUBLE)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getXPeaks_Cant()
   * @model containment="true"
   * @generated
   */
  DOUBLE getCant();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.XPeaks#getCant <em>Cant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cant</em>' containment reference.
   * @see #getCant()
   * @generated
   */
  void setCant(DOUBLE value);

  /**
   * Returns the value of the '<em><b>NPeaks</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>NPeaks</em>' containment reference.
   * @see #setNPeaks(DOUBLE)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getXPeaks_NPeaks()
   * @model containment="true"
   * @generated
   */
  DOUBLE getNPeaks();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.XPeaks#getNPeaks <em>NPeaks</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>NPeaks</em>' containment reference.
   * @see #getNPeaks()
   * @generated
   */
  void setNPeaks(DOUBLE value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(DOUBLE)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getXPeaks_Time()
   * @model containment="true"
   * @generated
   */
  DOUBLE getTime();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.XPeaks#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(DOUBLE value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' containment reference.
   * @see #setUnit(TimeType)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getXPeaks_Unit()
   * @model containment="true"
   * @generated
   */
  TimeType getUnit();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.XPeaks#getUnit <em>Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' containment reference.
   * @see #getUnit()
   * @generated
   */
  void setUnit(TimeType value);

} // XPeaks
