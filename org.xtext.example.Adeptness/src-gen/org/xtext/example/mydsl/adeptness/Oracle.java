/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.adeptness;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oracle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Oracle#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Oracle#getWhen <em>When</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Oracle#getCheck <em>Check</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getOracle()
 * @model
 * @generated
 */
public interface Oracle extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getOracle_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Oracle#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>When</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.adeptness.When}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' containment reference list.
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getOracle_When()
   * @model containment="true"
   * @generated
   */
  EList<When> getWhen();

  /**
   * Returns the value of the '<em><b>Check</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.adeptness.Checks}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Check</em>' containment reference list.
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getOracle_Check()
   * @model containment="true"
   * @generated
   */
  EList<Checks> getCheck();

} // Oracle
