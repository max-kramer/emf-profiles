package org.modelversioning.emfprofile.application.registry.decoration;

import java.util.Set;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * Describes decorations that will be attached to the graphical
 * representation of the EObject at which the stereotype was applied.
 * Decoration status must be evaluated from the conditions.
 */
@Data
@SuppressWarnings("all")
public class GraphicalDecorationDescription {
  private final StereotypeApplication _stereotypeApplication;
  
  public StereotypeApplication getStereotypeApplication() {
    return this._stereotypeApplication;
  }
  
  private final Set<GraphicalDecoration> _decorations;
  
  public Set<GraphicalDecoration> getDecorations() {
    return this._decorations;
  }
  
  private final AbstractCondition _condition;
  
  public AbstractCondition getCondition() {
    return this._condition;
  }
  
  private final DecorationStatus _decorationStatus;
  
  public DecorationStatus getDecorationStatus() {
    return this._decorationStatus;
  }
  
  public GraphicalDecorationDescription(final StereotypeApplication stereotypeApplication, final Set<GraphicalDecoration> decorations, final AbstractCondition condition, final DecorationStatus decorationStatus) {
    super();
    this._stereotypeApplication = stereotypeApplication;
    this._decorations = decorations;
    this._condition = condition;
    this._decorationStatus = decorationStatus;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_stereotypeApplication== null) ? 0 : _stereotypeApplication.hashCode());
    result = prime * result + ((_decorations== null) ? 0 : _decorations.hashCode());
    result = prime * result + ((_condition== null) ? 0 : _condition.hashCode());
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
    GraphicalDecorationDescription other = (GraphicalDecorationDescription) obj;
    if (_stereotypeApplication == null) {
      if (other._stereotypeApplication != null)
        return false;
    } else if (!_stereotypeApplication.equals(other._stereotypeApplication))
      return false;
    if (_decorations == null) {
      if (other._decorations != null)
        return false;
    } else if (!_decorations.equals(other._decorations))
      return false;
    if (_condition == null) {
      if (other._condition != null)
        return false;
    } else if (!_condition.equals(other._condition))
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
