/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Line Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getLineStyle()
 * @model
 * @generated
 */
public enum LineStyle implements Enumerator
{
  /**
   * The '<em><b>LINE SOLID</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINE_SOLID_VALUE
   * @generated
   * @ordered
   */
  LINE_SOLID(0, "LINE_SOLID", "SOLID"),

  /**
   * The '<em><b>LINE DOT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINE_DOT_VALUE
   * @generated
   * @ordered
   */
  LINE_DOT(1, "LINE_DOT", "DOTS"),

  /**
   * The '<em><b>LINE DASH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINE_DASH_VALUE
   * @generated
   * @ordered
   */
  LINE_DASH(2, "LINE_DASH", "DASH"),

  /**
   * The '<em><b>LINE DASHDOT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINE_DASHDOT_VALUE
   * @generated
   * @ordered
   */
  LINE_DASHDOT(3, "LINE_DASHDOT", "DASHDOT"),

  /**
   * The '<em><b>LINE DASHDOTDOT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINE_DASHDOTDOT_VALUE
   * @generated
   * @ordered
   */
  LINE_DASHDOTDOT(4, "LINE_DASHDOTDOT", "DASHDOTDOT");

  /**
   * The '<em><b>LINE SOLID</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LINE SOLID</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LINE_SOLID
   * @model literal="SOLID"
   * @generated
   * @ordered
   */
  public static final int LINE_SOLID_VALUE = 0;

  /**
   * The '<em><b>LINE DOT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LINE DOT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LINE_DOT
   * @model literal="DOTS"
   * @generated
   * @ordered
   */
  public static final int LINE_DOT_VALUE = 1;

  /**
   * The '<em><b>LINE DASH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LINE DASH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LINE_DASH
   * @model literal="DASH"
   * @generated
   * @ordered
   */
  public static final int LINE_DASH_VALUE = 2;

  /**
   * The '<em><b>LINE DASHDOT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LINE DASHDOT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LINE_DASHDOT
   * @model literal="DASHDOT"
   * @generated
   * @ordered
   */
  public static final int LINE_DASHDOT_VALUE = 3;

  /**
   * The '<em><b>LINE DASHDOTDOT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LINE DASHDOTDOT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LINE_DASHDOTDOT
   * @model literal="DASHDOTDOT"
   * @generated
   * @ordered
   */
  public static final int LINE_DASHDOTDOT_VALUE = 4;

  /**
   * An array of all the '<em><b>Line Style</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LineStyle[] VALUES_ARRAY =
    new LineStyle[]
    {
      LINE_SOLID,
      LINE_DOT,
      LINE_DASH,
      LINE_DASHDOT,
      LINE_DASHDOTDOT,
    };

  /**
   * A public read-only list of all the '<em><b>Line Style</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LineStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Line Style</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LineStyle get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LineStyle result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Line Style</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LineStyle getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LineStyle result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Line Style</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LineStyle get(int value)
  {
    switch (value)
    {
      case LINE_SOLID_VALUE: return LINE_SOLID;
      case LINE_DOT_VALUE: return LINE_DOT;
      case LINE_DASH_VALUE: return LINE_DASH;
      case LINE_DASHDOT_VALUE: return LINE_DASHDOT;
      case LINE_DASHDOTDOT_VALUE: return LINE_DASHDOTDOT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private LineStyle(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //LineStyle
