/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box Decoration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getText <em>Text</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getWidht <em>Widht</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getHeight <em>Height</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getImage <em>Image</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getBorder <em>Border</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getContentDirection <em>Content Direction</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getTooltip <em>Tooltip</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxDecoration()
 * @model
 * @generated
 */
public interface BoxDecoration extends AbstractDecoration
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(Text)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxDecoration_Text()
   * @model containment="true"
   * @generated
   */
  Text getText();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(Text value);

  /**
   * Returns the value of the '<em><b>Widht</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Widht</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Widht</em>' attribute.
   * @see #setWidht(int)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxDecoration_Widht()
   * @model
   * @generated
   */
  int getWidht();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getWidht <em>Widht</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Widht</em>' attribute.
   * @see #getWidht()
   * @generated
   */
  void setWidht(int value);

  /**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #setHeight(int)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxDecoration_Height()
   * @model
   * @generated
   */
  int getHeight();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' attribute.
   * @see #getHeight()
   * @generated
   */
  void setHeight(int value);

  /**
   * Returns the value of the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' containment reference.
   * @see #setImage(BoxImage)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxDecoration_Image()
   * @model containment="true"
   * @generated
   */
  BoxImage getImage();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getImage <em>Image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' containment reference.
   * @see #getImage()
   * @generated
   */
  void setImage(BoxImage value);

  /**
   * Returns the value of the '<em><b>Border</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Border</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Border</em>' containment reference.
   * @see #setBorder(Border)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxDecoration_Border()
   * @model containment="true"
   * @generated
   */
  Border getBorder();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getBorder <em>Border</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Border</em>' containment reference.
   * @see #getBorder()
   * @generated
   */
  void setBorder(Border value);

  /**
   * Returns the value of the '<em><b>Foreground Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreground Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreground Color</em>' containment reference.
   * @see #setForegroundColor(Color)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxDecoration_ForegroundColor()
   * @model containment="true"
   * @generated
   */
  Color getForegroundColor();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getForegroundColor <em>Foreground Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreground Color</em>' containment reference.
   * @see #getForegroundColor()
   * @generated
   */
  void setForegroundColor(Color value);

  /**
   * Returns the value of the '<em><b>Background Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Background Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Background Color</em>' containment reference.
   * @see #setBackgroundColor(Color)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxDecoration_BackgroundColor()
   * @model containment="true"
   * @generated
   */
  Color getBackgroundColor();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getBackgroundColor <em>Background Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Background Color</em>' containment reference.
   * @see #getBackgroundColor()
   * @generated
   */
  void setBackgroundColor(Color value);

  /**
   * Returns the value of the '<em><b>Direction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' containment reference.
   * @see #setDirection(Direction)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxDecoration_Direction()
   * @model containment="true"
   * @generated
   */
  Direction getDirection();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getDirection <em>Direction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' containment reference.
   * @see #getDirection()
   * @generated
   */
  void setDirection(Direction value);

  /**
   * Returns the value of the '<em><b>Margin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Margin</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Margin</em>' containment reference.
   * @see #setMargin(Margin)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxDecoration_Margin()
   * @model containment="true"
   * @generated
   */
  Margin getMargin();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getMargin <em>Margin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Margin</em>' containment reference.
   * @see #getMargin()
   * @generated
   */
  void setMargin(Margin value);

  /**
   * Returns the value of the '<em><b>Content Direction</b></em>' attribute.
   * The literals are from the enumeration {@link org.modelversioning.emfprofile.decoration.decorationLanguage.Directions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content Direction</em>' attribute.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Directions
   * @see #setContentDirection(Directions)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxDecoration_ContentDirection()
   * @model
   * @generated
   */
  Directions getContentDirection();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getContentDirection <em>Content Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content Direction</em>' attribute.
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.Directions
   * @see #getContentDirection()
   * @generated
   */
  void setContentDirection(Directions value);

  /**
   * Returns the value of the '<em><b>Tooltip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tooltip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tooltip</em>' containment reference.
   * @see #setTooltip(Text)
   * @see org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage#getBoxDecoration_Tooltip()
   * @model containment="true"
   * @generated
   */
  Text getTooltip();

  /**
   * Sets the value of the '{@link org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration#getTooltip <em>Tooltip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tooltip</em>' containment reference.
   * @see #getTooltip()
   * @generated
   */
  void setTooltip(Text value);

} // BoxDecoration
