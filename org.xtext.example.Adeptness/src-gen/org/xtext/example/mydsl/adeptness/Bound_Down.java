/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.adeptness;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound Down</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Bound_Down#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Bound_Down#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Bound_Down#getEm <em>Em</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getBound_Down()
 * @model
 * @generated
 */
public interface Bound_Down extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(DOUBLE)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getBound_Down_Value()
   * @model containment="true"
   * @generated
   */
  DOUBLE getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Bound_Down#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(DOUBLE value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Variable)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getBound_Down_Variable()
   * @model containment="true"
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Bound_Down#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Em</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Em</em>' containment reference.
   * @see #setEm(ExpressionsModel)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getBound_Down_Em()
   * @model containment="true"
   * @generated
   */
  ExpressionsModel getEm();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Bound_Down#getEm <em>Em</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Em</em>' containment reference.
   * @see #getEm()
   * @generated
   */
  void setEm(ExpressionsModel value);

} // Bound_Down
