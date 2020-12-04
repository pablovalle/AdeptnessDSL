/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.adeptness;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>High Peak</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.HighPeak#getCant <em>Cant</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getHighPeak()
 * @model
 * @generated
 */
public interface HighPeak extends EObject
{
  /**
   * Returns the value of the '<em><b>Cant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cant</em>' containment reference.
   * @see #setCant(DOUBLE)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getHighPeak_Cant()
   * @model containment="true"
   * @generated
   */
  DOUBLE getCant();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.HighPeak#getCant <em>Cant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cant</em>' containment reference.
   * @see #getCant()
   * @generated
   */
  void setCant(DOUBLE value);

} // HighPeak
