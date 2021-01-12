/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.adeptness;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Parameters#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getParameters()
 * @model
 * @generated
 */
public interface Parameters extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ExpressionsModel)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getParameters_Value()
   * @model containment="true"
   * @generated
   */
  ExpressionsModel getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Parameters#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ExpressionsModel value);

} // Parameters
