/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.adeptness;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitoring Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.MonitoringVariable#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.MonitoringVariable#getMonitoringVariableDatatype <em>Monitoring Variable Datatype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.MonitoringVariable#getMax <em>Max</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.MonitoringVariable#getMin <em>Min</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getMonitoringVariable()
 * @model
 * @generated
 */
public interface MonitoringVariable extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getMonitoringVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.MonitoringVariable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Monitoring Variable Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Monitoring Variable Datatype</em>' containment reference.
   * @see #setMonitoringVariableDatatype(Sig_type)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getMonitoringVariable_MonitoringVariableDatatype()
   * @model containment="true"
   * @generated
   */
  Sig_type getMonitoringVariableDatatype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.MonitoringVariable#getMonitoringVariableDatatype <em>Monitoring Variable Datatype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Monitoring Variable Datatype</em>' containment reference.
   * @see #getMonitoringVariableDatatype()
   * @generated
   */
  void setMonitoringVariableDatatype(Sig_type value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' containment reference.
   * @see #setMax(DOUBLE)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getMonitoringVariable_Max()
   * @model containment="true"
   * @generated
   */
  DOUBLE getMax();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.MonitoringVariable#getMax <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' containment reference.
   * @see #getMax()
   * @generated
   */
  void setMax(DOUBLE value);

  /**
   * Returns the value of the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' containment reference.
   * @see #setMin(DOUBLE)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getMonitoringVariable_Min()
   * @model containment="true"
   * @generated
   */
  DOUBLE getMin();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.MonitoringVariable#getMin <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' containment reference.
   * @see #getMin()
   * @generated
   */
  void setMin(DOUBLE value);

} // MonitoringVariable