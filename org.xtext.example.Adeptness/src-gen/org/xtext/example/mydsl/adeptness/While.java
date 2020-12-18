/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.adeptness;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.While#getEm <em>Em</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends EObject
{
  /**
   * Returns the value of the '<em><b>Em</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Em</em>' containment reference.
   * @see #setEm(ExpressionsModel)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getWhile_Em()
   * @model containment="true"
   * @generated
   */
  ExpressionsModel getEm();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.While#getEm <em>Em</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Em</em>' containment reference.
   * @see #getEm()
   * @generated
   */
  void setEm(ExpressionsModel value);

} // While