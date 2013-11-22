/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Directions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getDirections()
 * @model
 * @generated
 */
public enum Directions implements Enumerator
{
  /**
   * The '<em><b>CENTER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CENTER_VALUE
   * @generated
   * @ordered
   */
  CENTER(0, "CENTER", "center"),

  /**
   * The '<em><b>NORHT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NORHT_VALUE
   * @generated
   * @ordered
   */
  NORHT(1, "NORHT", "north"),

  /**
   * The '<em><b>SOUTH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOUTH_VALUE
   * @generated
   * @ordered
   */
  SOUTH(2, "SOUTH", "south"),

  /**
   * The '<em><b>WEST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEST_VALUE
   * @generated
   * @ordered
   */
  WEST(3, "WEST", "west"),

  /**
   * The '<em><b>EAST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EAST_VALUE
   * @generated
   * @ordered
   */
  EAST(4, "EAST", "east"),

  /**
   * The '<em><b>NORTH EAST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NORTH_EAST_VALUE
   * @generated
   * @ordered
   */
  NORTH_EAST(5, "NORTH_EAST", "north_east"),

  /**
   * The '<em><b>NORTH WEST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NORTH_WEST_VALUE
   * @generated
   * @ordered
   */
  NORTH_WEST(6, "NORTH_WEST", "north_west"),

  /**
   * The '<em><b>SOUTH EAST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOUTH_EAST_VALUE
   * @generated
   * @ordered
   */
  SOUTH_EAST(7, "SOUTH_EAST", "south_east"),

  /**
   * The '<em><b>SOUTH WEST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOUTH_WEST_VALUE
   * @generated
   * @ordered
   */
  SOUTH_WEST(8, "SOUTH_WEST", "south_west");

  /**
   * The '<em><b>CENTER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CENTER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CENTER
   * @model literal="center"
   * @generated
   * @ordered
   */
  public static final int CENTER_VALUE = 0;

  /**
   * The '<em><b>NORHT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NORHT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NORHT
   * @model literal="north"
   * @generated
   * @ordered
   */
  public static final int NORHT_VALUE = 1;

  /**
   * The '<em><b>SOUTH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SOUTH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SOUTH
   * @model literal="south"
   * @generated
   * @ordered
   */
  public static final int SOUTH_VALUE = 2;

  /**
   * The '<em><b>WEST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WEST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WEST
   * @model literal="west"
   * @generated
   * @ordered
   */
  public static final int WEST_VALUE = 3;

  /**
   * The '<em><b>EAST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EAST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EAST
   * @model literal="east"
   * @generated
   * @ordered
   */
  public static final int EAST_VALUE = 4;

  /**
   * The '<em><b>NORTH EAST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NORTH EAST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NORTH_EAST
   * @model literal="north_east"
   * @generated
   * @ordered
   */
  public static final int NORTH_EAST_VALUE = 5;

  /**
   * The '<em><b>NORTH WEST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NORTH WEST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NORTH_WEST
   * @model literal="north_west"
   * @generated
   * @ordered
   */
  public static final int NORTH_WEST_VALUE = 6;

  /**
   * The '<em><b>SOUTH EAST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SOUTH EAST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SOUTH_EAST
   * @model literal="south_east"
   * @generated
   * @ordered
   */
  public static final int SOUTH_EAST_VALUE = 7;

  /**
   * The '<em><b>SOUTH WEST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SOUTH WEST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SOUTH_WEST
   * @model literal="south_west"
   * @generated
   * @ordered
   */
  public static final int SOUTH_WEST_VALUE = 8;

  /**
   * An array of all the '<em><b>Directions</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Directions[] VALUES_ARRAY =
    new Directions[]
    {
      CENTER,
      NORHT,
      SOUTH,
      WEST,
      EAST,
      NORTH_EAST,
      NORTH_WEST,
      SOUTH_EAST,
      SOUTH_WEST,
    };

  /**
   * A public read-only list of all the '<em><b>Directions</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Directions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Directions</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Directions get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Directions result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Directions</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Directions getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Directions result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Directions</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Directions get(int value)
  {
    switch (value)
    {
      case CENTER_VALUE: return CENTER;
      case NORHT_VALUE: return NORHT;
      case SOUTH_VALUE: return SOUTH;
      case WEST_VALUE: return WEST;
      case EAST_VALUE: return EAST;
      case NORTH_EAST_VALUE: return NORTH_EAST;
      case NORTH_WEST_VALUE: return NORTH_WEST;
      case SOUTH_EAST_VALUE: return SOUTH_EAST;
      case SOUTH_WEST_VALUE: return SOUTH_WEST;
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
  private Directions(int value, String name, String literal)
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
  
} //Directions
