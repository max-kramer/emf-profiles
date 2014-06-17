/**
 */
package org.modelversioning.emfprofile.decoration.decorationLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelversioning.emfprofile.decoration.decorationLanguage.Border;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImage;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Direction;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Directions;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Margin;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Box Decoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxDecorationImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxDecorationImpl#getWidht <em>Widht</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxDecorationImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxDecorationImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxDecorationImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxDecorationImpl#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxDecorationImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxDecorationImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxDecorationImpl#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxDecorationImpl#getContentDirection <em>Content Direction</em>}</li>
 *   <li>{@link org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxDecorationImpl#getTooltip <em>Tooltip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoxDecorationImpl extends AbstractDecorationImpl implements BoxDecoration
{
  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected Text text;

  /**
   * The default value of the '{@link #getWidht() <em>Widht</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidht()
   * @generated
   * @ordered
   */
  protected static final int WIDHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWidht() <em>Widht</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidht()
   * @generated
   * @ordered
   */
  protected int widht = WIDHT_EDEFAULT;

  /**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected static final int HEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected int height = HEIGHT_EDEFAULT;

  /**
   * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected BoxImage image;

  /**
   * The cached value of the '{@link #getBorder() <em>Border</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorder()
   * @generated
   * @ordered
   */
  protected Border border;

  /**
   * The cached value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForegroundColor()
   * @generated
   * @ordered
   */
  protected Color foregroundColor;

  /**
   * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackgroundColor()
   * @generated
   * @ordered
   */
  protected Color backgroundColor;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected Direction direction;

  /**
   * The cached value of the '{@link #getMargin() <em>Margin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMargin()
   * @generated
   * @ordered
   */
  protected Margin margin;

  /**
   * The default value of the '{@link #getContentDirection() <em>Content Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContentDirection()
   * @generated
   * @ordered
   */
  protected static final Directions CONTENT_DIRECTION_EDEFAULT = Directions.CENTER;

  /**
   * The cached value of the '{@link #getContentDirection() <em>Content Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContentDirection()
   * @generated
   * @ordered
   */
  protected Directions contentDirection = CONTENT_DIRECTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getTooltip() <em>Tooltip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTooltip()
   * @generated
   * @ordered
   */
  protected Text tooltip;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BoxDecorationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DecorationLanguagePackage.Literals.BOX_DECORATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetText(Text newText, NotificationChain msgs)
  {
    Text oldText = text;
    text = newText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__TEXT, oldText, newText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(Text newText)
  {
    if (newText != text)
    {
      NotificationChain msgs = null;
      if (text != null)
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__TEXT, newText, newText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWidht()
  {
    return widht;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidht(int newWidht)
  {
    int oldWidht = widht;
    widht = newWidht;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__WIDHT, oldWidht, widht));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(int newHeight)
  {
    int oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoxImage getImage()
  {
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImage(BoxImage newImage, NotificationChain msgs)
  {
    BoxImage oldImage = image;
    image = newImage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__IMAGE, oldImage, newImage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImage(BoxImage newImage)
  {
    if (newImage != image)
    {
      NotificationChain msgs = null;
      if (image != null)
        msgs = ((InternalEObject)image).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__IMAGE, null, msgs);
      if (newImage != null)
        msgs = ((InternalEObject)newImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__IMAGE, null, msgs);
      msgs = basicSetImage(newImage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__IMAGE, newImage, newImage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Border getBorder()
  {
    return border;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBorder(Border newBorder, NotificationChain msgs)
  {
    Border oldBorder = border;
    border = newBorder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__BORDER, oldBorder, newBorder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBorder(Border newBorder)
  {
    if (newBorder != border)
    {
      NotificationChain msgs = null;
      if (border != null)
        msgs = ((InternalEObject)border).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__BORDER, null, msgs);
      if (newBorder != null)
        msgs = ((InternalEObject)newBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__BORDER, null, msgs);
      msgs = basicSetBorder(newBorder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__BORDER, newBorder, newBorder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getForegroundColor()
  {
    return foregroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForegroundColor(Color newForegroundColor, NotificationChain msgs)
  {
    Color oldForegroundColor = foregroundColor;
    foregroundColor = newForegroundColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__FOREGROUND_COLOR, oldForegroundColor, newForegroundColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForegroundColor(Color newForegroundColor)
  {
    if (newForegroundColor != foregroundColor)
    {
      NotificationChain msgs = null;
      if (foregroundColor != null)
        msgs = ((InternalEObject)foregroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__FOREGROUND_COLOR, null, msgs);
      if (newForegroundColor != null)
        msgs = ((InternalEObject)newForegroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__FOREGROUND_COLOR, null, msgs);
      msgs = basicSetForegroundColor(newForegroundColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__FOREGROUND_COLOR, newForegroundColor, newForegroundColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getBackgroundColor()
  {
    return backgroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBackgroundColor(Color newBackgroundColor, NotificationChain msgs)
  {
    Color oldBackgroundColor = backgroundColor;
    backgroundColor = newBackgroundColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__BACKGROUND_COLOR, oldBackgroundColor, newBackgroundColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackgroundColor(Color newBackgroundColor)
  {
    if (newBackgroundColor != backgroundColor)
    {
      NotificationChain msgs = null;
      if (backgroundColor != null)
        msgs = ((InternalEObject)backgroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__BACKGROUND_COLOR, null, msgs);
      if (newBackgroundColor != null)
        msgs = ((InternalEObject)newBackgroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__BACKGROUND_COLOR, null, msgs);
      msgs = basicSetBackgroundColor(newBackgroundColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__BACKGROUND_COLOR, newBackgroundColor, newBackgroundColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirection(Direction newDirection, NotificationChain msgs)
  {
    Direction oldDirection = direction;
    direction = newDirection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__DIRECTION, oldDirection, newDirection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(Direction newDirection)
  {
    if (newDirection != direction)
    {
      NotificationChain msgs = null;
      if (direction != null)
        msgs = ((InternalEObject)direction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__DIRECTION, null, msgs);
      if (newDirection != null)
        msgs = ((InternalEObject)newDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__DIRECTION, null, msgs);
      msgs = basicSetDirection(newDirection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__DIRECTION, newDirection, newDirection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Margin getMargin()
  {
    return margin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMargin(Margin newMargin, NotificationChain msgs)
  {
    Margin oldMargin = margin;
    margin = newMargin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__MARGIN, oldMargin, newMargin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMargin(Margin newMargin)
  {
    if (newMargin != margin)
    {
      NotificationChain msgs = null;
      if (margin != null)
        msgs = ((InternalEObject)margin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__MARGIN, null, msgs);
      if (newMargin != null)
        msgs = ((InternalEObject)newMargin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__MARGIN, null, msgs);
      msgs = basicSetMargin(newMargin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__MARGIN, newMargin, newMargin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Directions getContentDirection()
  {
    return contentDirection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContentDirection(Directions newContentDirection)
  {
    Directions oldContentDirection = contentDirection;
    contentDirection = newContentDirection == null ? CONTENT_DIRECTION_EDEFAULT : newContentDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__CONTENT_DIRECTION, oldContentDirection, contentDirection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text getTooltip()
  {
    return tooltip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTooltip(Text newTooltip, NotificationChain msgs)
  {
    Text oldTooltip = tooltip;
    tooltip = newTooltip;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__TOOLTIP, oldTooltip, newTooltip);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTooltip(Text newTooltip)
  {
    if (newTooltip != tooltip)
    {
      NotificationChain msgs = null;
      if (tooltip != null)
        msgs = ((InternalEObject)tooltip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__TOOLTIP, null, msgs);
      if (newTooltip != null)
        msgs = ((InternalEObject)newTooltip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecorationLanguagePackage.BOX_DECORATION__TOOLTIP, null, msgs);
      msgs = basicSetTooltip(newTooltip, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecorationLanguagePackage.BOX_DECORATION__TOOLTIP, newTooltip, newTooltip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DecorationLanguagePackage.BOX_DECORATION__TEXT:
        return basicSetText(null, msgs);
      case DecorationLanguagePackage.BOX_DECORATION__IMAGE:
        return basicSetImage(null, msgs);
      case DecorationLanguagePackage.BOX_DECORATION__BORDER:
        return basicSetBorder(null, msgs);
      case DecorationLanguagePackage.BOX_DECORATION__FOREGROUND_COLOR:
        return basicSetForegroundColor(null, msgs);
      case DecorationLanguagePackage.BOX_DECORATION__BACKGROUND_COLOR:
        return basicSetBackgroundColor(null, msgs);
      case DecorationLanguagePackage.BOX_DECORATION__DIRECTION:
        return basicSetDirection(null, msgs);
      case DecorationLanguagePackage.BOX_DECORATION__MARGIN:
        return basicSetMargin(null, msgs);
      case DecorationLanguagePackage.BOX_DECORATION__TOOLTIP:
        return basicSetTooltip(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DecorationLanguagePackage.BOX_DECORATION__TEXT:
        return getText();
      case DecorationLanguagePackage.BOX_DECORATION__WIDHT:
        return getWidht();
      case DecorationLanguagePackage.BOX_DECORATION__HEIGHT:
        return getHeight();
      case DecorationLanguagePackage.BOX_DECORATION__IMAGE:
        return getImage();
      case DecorationLanguagePackage.BOX_DECORATION__BORDER:
        return getBorder();
      case DecorationLanguagePackage.BOX_DECORATION__FOREGROUND_COLOR:
        return getForegroundColor();
      case DecorationLanguagePackage.BOX_DECORATION__BACKGROUND_COLOR:
        return getBackgroundColor();
      case DecorationLanguagePackage.BOX_DECORATION__DIRECTION:
        return getDirection();
      case DecorationLanguagePackage.BOX_DECORATION__MARGIN:
        return getMargin();
      case DecorationLanguagePackage.BOX_DECORATION__CONTENT_DIRECTION:
        return getContentDirection();
      case DecorationLanguagePackage.BOX_DECORATION__TOOLTIP:
        return getTooltip();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DecorationLanguagePackage.BOX_DECORATION__TEXT:
        setText((Text)newValue);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__WIDHT:
        setWidht((Integer)newValue);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__HEIGHT:
        setHeight((Integer)newValue);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__IMAGE:
        setImage((BoxImage)newValue);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__BORDER:
        setBorder((Border)newValue);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__FOREGROUND_COLOR:
        setForegroundColor((Color)newValue);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__BACKGROUND_COLOR:
        setBackgroundColor((Color)newValue);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__DIRECTION:
        setDirection((Direction)newValue);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__MARGIN:
        setMargin((Margin)newValue);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__CONTENT_DIRECTION:
        setContentDirection((Directions)newValue);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__TOOLTIP:
        setTooltip((Text)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DecorationLanguagePackage.BOX_DECORATION__TEXT:
        setText((Text)null);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__WIDHT:
        setWidht(WIDHT_EDEFAULT);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__IMAGE:
        setImage((BoxImage)null);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__BORDER:
        setBorder((Border)null);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__FOREGROUND_COLOR:
        setForegroundColor((Color)null);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__BACKGROUND_COLOR:
        setBackgroundColor((Color)null);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__DIRECTION:
        setDirection((Direction)null);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__MARGIN:
        setMargin((Margin)null);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__CONTENT_DIRECTION:
        setContentDirection(CONTENT_DIRECTION_EDEFAULT);
        return;
      case DecorationLanguagePackage.BOX_DECORATION__TOOLTIP:
        setTooltip((Text)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DecorationLanguagePackage.BOX_DECORATION__TEXT:
        return text != null;
      case DecorationLanguagePackage.BOX_DECORATION__WIDHT:
        return widht != WIDHT_EDEFAULT;
      case DecorationLanguagePackage.BOX_DECORATION__HEIGHT:
        return height != HEIGHT_EDEFAULT;
      case DecorationLanguagePackage.BOX_DECORATION__IMAGE:
        return image != null;
      case DecorationLanguagePackage.BOX_DECORATION__BORDER:
        return border != null;
      case DecorationLanguagePackage.BOX_DECORATION__FOREGROUND_COLOR:
        return foregroundColor != null;
      case DecorationLanguagePackage.BOX_DECORATION__BACKGROUND_COLOR:
        return backgroundColor != null;
      case DecorationLanguagePackage.BOX_DECORATION__DIRECTION:
        return direction != null;
      case DecorationLanguagePackage.BOX_DECORATION__MARGIN:
        return margin != null;
      case DecorationLanguagePackage.BOX_DECORATION__CONTENT_DIRECTION:
        return contentDirection != CONTENT_DIRECTION_EDEFAULT;
      case DecorationLanguagePackage.BOX_DECORATION__TOOLTIP:
        return tooltip != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (widht: ");
    result.append(widht);
    result.append(", height: ");
    result.append(height);
    result.append(", contentDirection: ");
    result.append(contentDirection);
    result.append(')');
    return result.toString();
  }

} //BoxDecorationImpl
