package org.modelversioning.emfprofile.application.registry.decoration;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Decoration;

@Data
@SuppressWarnings("all")
public class GraphicalDecoration {
  private final Decoration _decoration;
  
  public Decoration getDecoration() {
    return this._decoration;
  }
  
  private final DecorationStatus _decorationStatus;
  
  public DecorationStatus getDecorationStatus() {
    return this._decorationStatus;
  }
  
  public GraphicalDecoration(final Decoration decoration, final DecorationStatus decorationStatus) {
    super();
    this._decoration = decoration;
    this._decorationStatus = decorationStatus;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_decoration== null) ? 0 : _decoration.hashCode());
    result = prime * result + ((_decorationStatus== null) ? 0 : _decorationStatus.hashCode());
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
    GraphicalDecoration other = (GraphicalDecoration) obj;
    if (_decoration == null) {
      if (other._decoration != null)
        return false;
    } else if (!_decoration.equals(other._decoration))
      return false;
    if (_decorationStatus == null) {
      if (other._decorationStatus != null)
        return false;
    } else if (!_decorationStatus.equals(other._decorationStatus))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
