/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.adeptness;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Element2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.AbstractElement2#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.AbstractElement2#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.AbstractElement2#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getAbstractElement2()
 * @model
 * @generated
 */
public interface AbstractElement2 extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getAbstractElement2_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.AbstractElement2#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(DOUBLE)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getAbstractElement2_Value()
   * @model containment="true"
   * @generated
   */
  DOUBLE getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.AbstractElement2#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(DOUBLE value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.adeptness.Operators}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference list.
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getAbstractElement2_Op()
   * @model containment="true"
   * @generated
   */
  EList<Operators> getOp();

} // AbstractElement2
