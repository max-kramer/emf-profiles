package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import org.eclipse.swt.graphics.Color;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class ConnectionValues {
  private final Color _foregroundColor;
  
  public Color getForegroundColor() {
    return this._foregroundColor;
  }
  
  private final Color _backgroundColor;
  
  public Color getBackgroundColor() {
    return this._backgroundColor;
  }
  
  private final int _size;
  
  public int getSize() {
    return this._size;
  }
  
  private final int _lineStyle;
  
  public int getLineStyle() {
    return this._lineStyle;
  }
  
  public ConnectionValues(final Color foregroundColor, final Color backgroundColor, final int size, final int lineStyle) {
    super();
    this._foregroundColor = foregroundColor;
    this._backgroundColor = backgroundColor;
    this._size = size;
    this._lineStyle = lineStyle;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_foregroundColor== null) ? 0 : _foregroundColor.hashCode());
    result = prime * result + ((_backgroundColor== null) ? 0 : _backgroundColor.hashCode());
    result = prime * result + _size;
    result = prime * result + _lineStyle;
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ConnectionValues other = (ConnectionValues) obj;
    if (_foregroundColor == null) {
      if (other._foregroundColor != null)
        return false;
    } else if (!_foregroundColor.equals(other._foregroundColor))
      return false;
    if (_backgroundColor == null) {
      if (other._backgroundColor != null)
        return false;
    } else if (!_backgroundColor.equals(other._backgroundColor))
      return false;
    if (other._size != _size)
      return false;
    if (other._lineStyle != _lineStyle)
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
