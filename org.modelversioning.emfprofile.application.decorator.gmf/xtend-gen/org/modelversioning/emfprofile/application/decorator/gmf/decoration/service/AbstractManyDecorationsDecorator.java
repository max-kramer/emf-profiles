package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;

@SuppressWarnings("all")
public abstract class AbstractManyDecorationsDecorator extends AbstractDecorator {
  public AbstractManyDecorationsDecorator(final IDecoratorTarget decoratorTarget) {
    super(decoratorTarget);
  }
  
  /**
   * holding references of visualized decorations
   */
  protected final Set<Decoration> decorationsOnEObject = new Function0<Set<Decoration>>() {
    public Set<Decoration> apply() {
      HashSet<Decoration> _newHashSet = Sets.<Decoration>newHashSet();
      return _newHashSet;
    }
  }.apply();
  
  public void deactivate() {
    super.deactivate();
    final Consumer<Decoration> _function = new Consumer<Decoration>() {
      public void accept(final Decoration decoration) {
        AbstractManyDecorationsDecorator.this.processRemoveDecoration(decoration);
      }
    };
    this.decorationsOnEObject.forEach(_function);
    this.decorationsOnEObject.clear();
  }
  
  public void refresh() {
    this.removeVisualizedDecorations();
    this.visualizeDecorations();
  }
  
  private void removeVisualizedDecorations() {
    final Consumer<Decoration> _function = new Consumer<Decoration>() {
      public void accept(final Decoration d) {
        AbstractManyDecorationsDecorator.this.processRemoveDecoration(d);
      }
    };
    this.decorationsOnEObject.forEach(_function);
    this.decorationsOnEObject.clear();
  }
  
  private void visualizeDecorations() {
    Collection<GraphicalDecorationDescription> _values = this.graphicalDecorationDescriptions.values();
    final Consumer<GraphicalDecorationDescription> _function = new Consumer<GraphicalDecorationDescription>() {
      public void accept(final GraphicalDecorationDescription graphicalDecorationDescription) {
        DecorationStatus _decorationStatus = graphicalDecorationDescription.getDecorationStatus();
        boolean _equals = Objects.equal(_decorationStatus, DecorationStatus.ACTIVE);
        if (_equals) {
          Class<? extends AbstractDecoration> _decorationType = AbstractManyDecorationsDecorator.this.getDecorationType();
          List<GraphicalDecoration> _graphicalDecorations = AbstractManyDecorationsDecorator.this.getGraphicalDecorations(graphicalDecorationDescription, _decorationType);
          final Consumer<GraphicalDecoration> _function = new Consumer<GraphicalDecoration>() {
            public void accept(final GraphicalDecoration gd) {
              final DecorationStatus decorationStatus = gd.getDecorationStatus();
              boolean _matched = false;
              if (!_matched) {
                boolean _equals = Objects.equal(decorationStatus, DecorationStatus.ACTIVE);
                if (_equals) {
                  _matched=true;
                  Decoration _processAddDecoration = AbstractManyDecorationsDecorator.this.processAddDecoration(gd);
                  AbstractManyDecorationsDecorator.this.decorationsOnEObject.add(_processAddDecoration);
                }
              }
              if (!_matched) {
                boolean _equals_1 = Objects.equal(decorationStatus, DecorationStatus.INANCTIVE);
                if (_equals_1) {
                  _matched=true;
                }
              }
              if (!_matched) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("Unknown decoration status: ");
                _builder.append(decorationStatus, "");
                IllegalStateException _illegalStateException = new IllegalStateException(_builder.toString());
                throw _illegalStateException;
              }
            }
          };
          _graphicalDecorations.forEach(_function);
        }
      }
    };
    _values.forEach(_function);
  }
  
  /**
   * instructs the decorator to visualize the decoration on the decoration target.
   */
  public abstract Decoration processAddDecoration(final GraphicalDecoration graphicalDecoration);
  
  /**
   * instructs the decorator to remove the visualized decoration from the decoration target.
   */
  public abstract void processRemoveDecoration(final Decoration decoration);
}
