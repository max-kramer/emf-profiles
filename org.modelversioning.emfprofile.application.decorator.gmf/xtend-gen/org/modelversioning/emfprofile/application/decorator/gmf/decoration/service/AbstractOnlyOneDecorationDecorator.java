package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration;

@SuppressWarnings("all")
public abstract class AbstractOnlyOneDecorationDecorator extends AbstractDecorator {
  public AbstractOnlyOneDecorationDecorator(final IDecoratorTarget decoratorTarget) {
    super(decoratorTarget);
  }
  
  /**
   * returns {@link AbstractDecoration} or <code>null</code> if there is none.
   */
  public AbstractDecoration getAbstractDecorationWithHighestPrecedence() {
    boolean _isEmpty = this.graphicalDecorationDescriptions.isEmpty();
    if (_isEmpty) {
      return null;
    }
    Collection<GraphicalDecorationDescription> _values = this.graphicalDecorationDescriptions.values();
    LinkedList<GraphicalDecorationDescription> _newLinkedList = Lists.<GraphicalDecorationDescription>newLinkedList(_values);
    List<GraphicalDecorationDescription> _reverse = ListExtensions.<GraphicalDecorationDescription>reverse(_newLinkedList);
    final Function1<GraphicalDecorationDescription,Boolean> _function = new Function1<GraphicalDecorationDescription,Boolean>() {
      public Boolean apply(final GraphicalDecorationDescription it) {
        DecorationStatus _decorationStatus = it.getDecorationStatus();
        boolean _equals = Objects.equal(_decorationStatus, DecorationStatus.ACTIVE);
        return Boolean.valueOf(_equals);
      }
    };
    Iterable<GraphicalDecorationDescription> _filter = IterableExtensions.<GraphicalDecorationDescription>filter(_reverse, _function);
    final Function1<GraphicalDecorationDescription,List<GraphicalDecoration>> _function_1 = new Function1<GraphicalDecorationDescription,List<GraphicalDecoration>>() {
      public List<GraphicalDecoration> apply(final GraphicalDecorationDescription it) {
        List<GraphicalDecoration> _decorations = it.getDecorations();
        return _decorations;
      }
    };
    Iterable<List<GraphicalDecoration>> _map = IterableExtensions.<GraphicalDecorationDescription, List<GraphicalDecoration>>map(_filter, _function_1);
    Iterable<GraphicalDecoration> _flatten = Iterables.<GraphicalDecoration>concat(_map);
    final Function1<GraphicalDecoration,Boolean> _function_2 = new Function1<GraphicalDecoration,Boolean>() {
      public Boolean apply(final GraphicalDecoration it) {
        boolean _and = false;
        AbstractDecoration _decoration = it.getDecoration();
        Class<? extends AbstractDecoration> _class = _decoration.getClass();
        Class<? extends AbstractDecoration> _decorationType = AbstractOnlyOneDecorationDecorator.this.getDecorationType();
        boolean _equals = Objects.equal(_class, _decorationType);
        if (!_equals) {
          _and = false;
        } else {
          DecorationStatus _decorationStatus = it.getDecorationStatus();
          boolean _equals_1 = Objects.equal(_decorationStatus, DecorationStatus.ACTIVE);
          _and = (_equals && _equals_1);
        }
        return Boolean.valueOf(_and);
      }
    };
    Iterable<GraphicalDecoration> _filter_1 = IterableExtensions.<GraphicalDecoration>filter(_flatten, _function_2);
    GraphicalDecoration _head = IterableExtensions.<GraphicalDecoration>head(_filter_1);
    AbstractDecoration _decoration = null;
    if (_head!=null) {
      _decoration=_head.getDecoration();
    }
    final BorderDecoration borderDecoration = ((BorderDecoration) _decoration);
    return borderDecoration;
  }
}
