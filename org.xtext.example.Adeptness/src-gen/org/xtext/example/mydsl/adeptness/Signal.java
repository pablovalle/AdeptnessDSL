/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.adeptness;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Signal#getCardinalityNumCPS <em>Cardinality Num CPS</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Signal#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Signal#getOracle <em>Oracle</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends Type
{
  /**
   * Returns the value of the '<em><b>Cardinality Num CPS</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality Num CPS</em>' attribute.
   * @see #setCardinalityNumCPS(int)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getSignal_CardinalityNumCPS()
   * @model
   * @generated
   */
  int getCardinalityNumCPS();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Signal#getCardinalityNumCPS <em>Cardinality Num CPS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality Num CPS</em>' attribute.
   * @see #getCardinalityNumCPS()
   * @generated
   */
  void setCardinalityNumCPS(int value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(MonitoringFile)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getSignal_SuperType()
   * @model
   * @generated
   */
  MonitoringFile getSuperType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Signal#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(MonitoringFile value);

  /**
   * Returns the value of the '<em><b>Oracle</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.adeptness.Oracle}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oracle</em>' containment reference list.
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getSignal_Oracle()
   * @model containment="true"
   * @generated
   */
  EList<Oracle> getOracle();

} // Signal
