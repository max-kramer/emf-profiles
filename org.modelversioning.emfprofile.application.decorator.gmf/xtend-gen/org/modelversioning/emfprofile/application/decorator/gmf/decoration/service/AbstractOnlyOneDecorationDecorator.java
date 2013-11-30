package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.swt.graphics.Color;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;

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
    final AbstractDecoration abstractDecoration = _decoration;
    return abstractDecoration;
  }
  
  /**
   * Utility method to provide the right figure for coloring.
   * @param editPart the graphical edit part
   */
  protected IFigure getFigureForColoring(final IGraphicalEditPart editPart) {
    IFigure figure = editPart.getFigure();
    this.printChildrenOfFigure(figure, 0);
    if ((figure instanceof BorderedNodeFigure)) {
      List _children = figure.getChildren();
      Object _get = _children.get(0);
      figure = ((IFigure) _get);
    }
    if ((figure instanceof DefaultSizeNodeFigure)) {
      List _children_1 = figure.getChildren();
      Object _get_1 = _children_1.get(0);
      figure = ((IFigure) _get_1);
    }
    return figure;
  }
  
  private void printChildrenOfFigure(final IFigure figure, final int level) {
    String _plus = ("FIGURE " + figure);
    String _plus_1 = (_plus + ", class: ");
    Class<? extends IFigure> _class = figure.getClass();
    String _plus_2 = (_plus_1 + _class);
    InputOutput.<String>println(_plus_2);
    List _children = figure.getChildren();
    final Procedure1<Object> _function = new Procedure1<Object>() {
      public void apply(final Object f) {
        int step = 0;
        boolean _lessEqualsThan = (step <= level);
        boolean _while = _lessEqualsThan;
        while (_while) {
          {
            InputOutput.<String>print("\t");
            int _plus = (step + 1);
            step = _plus;
          }
          boolean _lessEqualsThan_1 = (step <= level);
          _while = _lessEqualsThan_1;
        }
        InputOutput.<String>print("CHILD");
        int _plus = (level + 1);
        AbstractOnlyOneDecorationDecorator.this.printChildrenOfFigure(((IFigure) f), _plus);
      }
    };
    IterableExtensions.<Object>forEach(_children, _function);
  }
  
  protected boolean colorEqual(final Color color, final Color other) {
    return Objects.equal(color, other);
  }
}
