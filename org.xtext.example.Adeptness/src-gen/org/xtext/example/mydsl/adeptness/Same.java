/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.adeptness;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Same</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Same#getBound_upp <em>Bound upp</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getSame()
 * @model
 * @generated
 */
public interface Same extends EObject
{
  /**
   * Returns the value of the '<em><b>Bound upp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound upp</em>' containment reference.
   * @see #setBound_upp(Bound_up)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getSame_Bound_upp()
   * @model containment="true"
   * @generated
   */
  Bound_up getBound_upp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Same#getBound_upp <em>Bound upp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bound upp</em>' containment reference.
   * @see #getBound_upp()
   * @generated
   */
  void setBound_upp(Bound_up value);

} // Same
