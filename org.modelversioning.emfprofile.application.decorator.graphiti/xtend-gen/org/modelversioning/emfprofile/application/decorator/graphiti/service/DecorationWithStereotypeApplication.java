package org.modelversioning.emfprofile.application.decorator.graphiti.service;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

@Data
@SuppressWarnings("all")
public class DecorationWithStereotypeApplication {
  private final AbstractDecoration _decoration;
  
  public AbstractDecoration getDecoration() {
    return this._decoration;
  }
  
  private final StereotypeApplication _stereotypeApplication;
  
  public StereotypeApplication getStereotypeApplication() {
    return this._stereotypeApplication;
  }
  
  public DecorationWithStereotypeApplication(final AbstractDecoration decoration, final StereotypeApplication stereotypeApplication) {
    super();
    this._decoration = decoration;
    this._stereotypeApplication = stereotypeApplication;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_decoration== null) ? 0 : _decoration.hashCode());
    result = prime * result + ((_stereotypeApplication== null) ? 0 : _stereotypeApplication.hashCode());
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
    DecorationWithStereotypeApplication other = (DecorationWithStereotypeApplication) obj;
    if (_decoration == null) {
      if (other._decoration != null)
        return false;
    } else if (!_decoration.equals(other._decoration))
      return false;
    if (_stereotypeApplication == null) {
      if (other._stereotypeApplication != null)
        return false;
    } else if (!_stereotypeApplication.equals(other._stereotypeApplication))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
