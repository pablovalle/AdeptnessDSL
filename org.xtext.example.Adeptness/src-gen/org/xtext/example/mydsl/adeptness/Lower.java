/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.adeptness;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Lower#getBound_lower <em>Bound lower</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Lower#getExactly <em>Exactly</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Lower#getAtmost <em>Atmost</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.adeptness.Lower#getAtleast <em>Atleast</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getLower()
 * @model
 * @generated
 */
public interface Lower extends EObject
{
  /**
   * Returns the value of the '<em><b>Bound lower</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound lower</em>' containment reference.
   * @see #setBound_lower(Bound_Down)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getLower_Bound_lower()
   * @model containment="true"
   * @generated
   */
  Bound_Down getBound_lower();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Lower#getBound_lower <em>Bound lower</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bound lower</em>' containment reference.
   * @see #getBound_lower()
   * @generated
   */
  void setBound_lower(Bound_Down value);

  /**
   * Returns the value of the '<em><b>Exactly</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exactly</em>' containment reference.
   * @see #setExactly(Exactly)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getLower_Exactly()
   * @model containment="true"
   * @generated
   */
  Exactly getExactly();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Lower#getExactly <em>Exactly</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exactly</em>' containment reference.
   * @see #getExactly()
   * @generated
   */
  void setExactly(Exactly value);

  /**
   * Returns the value of the '<em><b>Atmost</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atmost</em>' containment reference.
   * @see #setAtmost(At_most)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getLower_Atmost()
   * @model containment="true"
   * @generated
   */
  At_most getAtmost();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Lower#getAtmost <em>Atmost</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atmost</em>' containment reference.
   * @see #getAtmost()
   * @generated
   */
  void setAtmost(At_most value);

  /**
   * Returns the value of the '<em><b>Atleast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atleast</em>' containment reference.
   * @see #setAtleast(At_least)
   * @see org.xtext.example.mydsl.adeptness.AdeptnessPackage#getLower_Atleast()
   * @model containment="true"
   * @generated
   */
  At_least getAtleast();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.adeptness.Lower#getAtleast <em>Atleast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atleast</em>' containment reference.
   * @see #getAtleast()
   * @generated
   */
  void setAtleast(At_least value);

} // Lower
