/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.adeptness;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precond Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.PrecondReference#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.PrecondReference#getLower <em>Lower</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.PrecondReference#getRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.PrecondReference#getGap <em>Gap</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getPrecondReference()
 * @model
 * @generated
 */
public interface PrecondReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Upper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper</em>' containment reference.
   * @see #setUpper(Upper)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getPrecondReference_Upper()
   * @model containment="true"
   * @generated
   */
  Upper getUpper();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.PrecondReference#getUpper <em>Upper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' containment reference.
   * @see #getUpper()
   * @generated
   */
  void setUpper(Upper value);

  /**
   * Returns the value of the '<em><b>Lower</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower</em>' containment reference.
   * @see #setLower(Lower)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getPrecondReference_Lower()
   * @model containment="true"
   * @generated
   */
  Lower getLower();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.PrecondReference#getLower <em>Lower</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' containment reference.
   * @see #getLower()
   * @generated
   */
  void setLower(Lower value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(Range)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getPrecondReference_Range()
   * @model containment="true"
   * @generated
   */
  Range getRange();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.PrecondReference#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(Range value);

  /**
   * Returns the value of the '<em><b>Gap</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gap</em>' containment reference.
   * @see #setGap(Gap)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getPrecondReference_Gap()
   * @model containment="true"
   * @generated
   */
  Gap getGap();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.PrecondReference#getGap <em>Gap</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gap</em>' containment reference.
   * @see #getGap()
   * @generated
   */
  void setGap(Gap value);

} // PrecondReference
