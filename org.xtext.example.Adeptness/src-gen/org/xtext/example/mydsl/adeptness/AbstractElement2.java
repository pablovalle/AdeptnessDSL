/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.adeptness;

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
 *   <li>{@link org.xtext.example.mydsl.adeptness.AbstractElement2#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.AbstractElement2#getComparation <em>Comparation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.AbstractElement2#getLogicOperator <em>Logic Operator</em>}</li>
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
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(Op)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getAbstractElement2_Operator()
   * @model containment="true"
   * @generated
   */
  Op getOperator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.AbstractElement2#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(Op value);

  /**
   * Returns the value of the '<em><b>Comparation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comparation</em>' containment reference.
   * @see #setComparation(CompOp)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getAbstractElement2_Comparation()
   * @model containment="true"
   * @generated
   */
  CompOp getComparation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.AbstractElement2#getComparation <em>Comparation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comparation</em>' containment reference.
   * @see #getComparation()
   * @generated
   */
  void setComparation(CompOp value);

  /**
   * Returns the value of the '<em><b>Logic Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic Operator</em>' containment reference.
   * @see #setLogicOperator(LogicOp)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getAbstractElement2_LogicOperator()
   * @model containment="true"
   * @generated
   */
  LogicOp getLogicOperator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.AbstractElement2#getLogicOperator <em>Logic Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logic Operator</em>' containment reference.
   * @see #getLogicOperator()
   * @generated
   */
  void setLogicOperator(LogicOp value);

} // AbstractElement2
