/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ComparisonOperator;
import org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Condition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.LogicalOperator;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * It is an utility class to evaluate if a specific decoration should be active or
 * inactive for a concrete {@link StereotypeApplication stereotype application}.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
@SuppressWarnings("all")
public class ConditionEvaluator {
  private ConditionEvaluator() {
  }
  
  public static DecorationStatus execute(final AbstractCondition condition, final StereotypeApplication stereotypeApplication) {
    DecorationStatus _xblockexpression = null;
    {
      final Boolean evaluation = ConditionEvaluator.evaluate(condition, stereotypeApplication);
      DecorationStatus _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        boolean _equals = Objects.equal(evaluation, Boolean.TRUE);
        if (_equals) {
          _matched=true;
          _switchResult = DecorationStatus.ACTIVE;
        }
      }
      if (!_matched) {
        boolean _equals_1 = Objects.equal(evaluation, Boolean.FALSE);
        if (_equals_1) {
          _matched=true;
          _switchResult = DecorationStatus.INANCTIVE;
        }
      }
      if (!_matched) {
        _switchResult = DecorationStatus.UNKNOWN;
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  private static Boolean evaluate(final AbstractCondition condition, final StereotypeApplication application) {
    Boolean _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (condition instanceof Condition) {
        final Condition _condition = (Condition)condition;
        _matched=true;
        Boolean _xblockexpression = null;
        {
          EClass _eClass = application.eClass();
          EList<EAttribute> _eAllAttributes = _eClass.getEAllAttributes();
          final Function1<EAttribute,Boolean> _function = new Function1<EAttribute,Boolean>() {
              public Boolean apply(final EAttribute it) {
                String _name = it.getName();
                EAttribute _attribute = _condition.getAttribute();
                String _name_1 = _attribute.getName();
                boolean _equals = Objects.equal(_name, _name_1);
                return Boolean.valueOf(_equals);
              }
            };
          final EAttribute attribute = IterableExtensions.<EAttribute>findFirst(_eAllAttributes, _function);
          Object _eGet = application.eGet(attribute);
          ComparisonOperator _operator = _condition.getOperator();
          String _value = _condition.getValue();
          Boolean _compare = ConditionEvaluator.compare(_eGet, _operator, _value);
          _xblockexpression = (_compare);
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (condition instanceof CompositeCondition) {
        final CompositeCondition _compositeCondition = (CompositeCondition)condition;
        _matched=true;
        Boolean _xblockexpression = null;
        {
          final LogicalOperator operator = _compositeCondition.getOperator();
          Boolean _switchResult_1 = null;
          boolean _matched_1 = false;
          if (!_matched_1) {
            boolean _equals = Objects.equal(operator, LogicalOperator.ALL);
            if (_equals) {
              _matched_1=true;
              EList<AbstractCondition> _conditions = _compositeCondition.getConditions();
              final Function1<AbstractCondition,Boolean> _function = new Function1<AbstractCondition,Boolean>() {
                  public Boolean apply(final AbstractCondition c) {
                    Boolean _evaluate = ConditionEvaluator.evaluate(c, application);
                    boolean _equals = ((_evaluate).booleanValue() == true);
                    return Boolean.valueOf(_equals);
                  }
                };
              boolean _forall = IterableExtensions.<AbstractCondition>forall(_conditions, _function);
              _switchResult_1 = Boolean.valueOf(_forall);
            }
          }
          if (!_matched_1) {
            boolean _equals_1 = Objects.equal(operator, LogicalOperator.ANY);
            if (_equals_1) {
              _matched_1=true;
              EList<AbstractCondition> _conditions_1 = _compositeCondition.getConditions();
              final Function1<AbstractCondition,Boolean> _function_1 = new Function1<AbstractCondition,Boolean>() {
                  public Boolean apply(final AbstractCondition c) {
                    Boolean _evaluate = ConditionEvaluator.evaluate(c, application);
                    boolean _equals = ((_evaluate).booleanValue() == true);
                    return Boolean.valueOf(_equals);
                  }
                };
              boolean _exists = IterableExtensions.<AbstractCondition>exists(_conditions_1, _function_1);
              _switchResult_1 = Boolean.valueOf(_exists);
            }
          }
          _xblockexpression = (_switchResult_1);
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      _switchResult = ((Boolean) null);
    }
    return _switchResult;
  }
  
  private static Boolean _compare(final Object data, final ComparisonOperator operator, final String value) {
    Boolean _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (data instanceof String) {
        final String _string = (String)data;
        _matched=true;
        Boolean _compare = ConditionEvaluator.compare(_string, operator, value);
        _switchResult = _compare;
      }
    }
    if (!_matched) {
      if (data instanceof Boolean) {
        final Boolean _boolean = (Boolean)data;
        _matched=true;
        Boolean _valueOf = Boolean.valueOf(value);
        Boolean _compare = ConditionEvaluator.compare(_boolean, operator, _valueOf);
        _switchResult = _compare;
      }
    }
    if (!_matched) {
      if (data instanceof Integer) {
        final Integer _integer = (Integer)data;
        _matched=true;
        Integer _valueOf = Integer.valueOf(value);
        Boolean _compare = ConditionEvaluator.compare(_integer, operator, _valueOf);
        _switchResult = _compare;
      }
    }
    if (!_matched) {
      if (data instanceof Float) {
        final Float _float = (Float)data;
        _matched=true;
        Float _valueOf = Float.valueOf(value);
        Boolean _compare = ConditionEvaluator.compare(_float, operator, _valueOf);
        _switchResult = _compare;
      }
    }
    if (!_matched) {
      if (data instanceof Double) {
        final Double _double = (Double)data;
        _matched=true;
        Double _valueOf = Double.valueOf(value);
        Boolean _compare = ConditionEvaluator.compare(_double, operator, _valueOf);
        _switchResult = _compare;
      }
    }
    if (!_matched) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Comparing data type that is not supported: ");
      Class<? extends Object> _class = data.getClass();
      String _name = _class.getName();
      _builder.append(_name, "");
      IllegalArgumentException _illegalArgumentException = new IllegalArgumentException(_builder.toString());
      throw _illegalArgumentException;
    }
    return _switchResult;
  }
  
  private static Boolean _compare(final String data, final ComparisonOperator operator, final String value) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      boolean _equals = Objects.equal(operator, ComparisonOperator.EQUAL);
      if (_equals) {
        _matched=true;
        boolean _equals_1 = data.equals(value);
        _switchResult = _equals_1;
      }
    }
    if (!_matched) {
      boolean _equals_2 = Objects.equal(operator, ComparisonOperator.UNEQUAL);
      if (_equals_2) {
        _matched=true;
        boolean _equals_3 = data.equals(value);
        boolean _not = (!_equals_3);
        _switchResult = _not;
      }
    }
    if (!_matched) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Wrong comparison operator with String type: ");
      _builder.append(operator, "");
      IllegalArgumentException _illegalArgumentException = new IllegalArgumentException(_builder.toString());
      throw _illegalArgumentException;
    }
    return Boolean.valueOf(_switchResult);
  }
  
  private static Boolean _compare(final Boolean data, final ComparisonOperator operator, final Boolean value) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      boolean _equals = Objects.equal(operator, ComparisonOperator.EQUAL);
      if (_equals) {
        _matched=true;
        boolean _equals_1 = data.equals(value);
        _switchResult = _equals_1;
      }
    }
    if (!_matched) {
      boolean _equals_2 = Objects.equal(operator, ComparisonOperator.UNEQUAL);
      if (_equals_2) {
        _matched=true;
        boolean _equals_3 = data.equals(value);
        boolean _not = (!_equals_3);
        _switchResult = _not;
      }
    }
    if (!_matched) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Wrong comparison operator with Boolean type: ");
      _builder.append(operator, "");
      IllegalArgumentException _illegalArgumentException = new IllegalArgumentException(_builder.toString());
      throw _illegalArgumentException;
    }
    return Boolean.valueOf(_switchResult);
  }
  
  private static Boolean _compare(final Integer data, final ComparisonOperator operator, final Integer value) {
    Boolean _numberCompare = ConditionEvaluator.<Integer>numberCompare(data, operator, value);
    return _numberCompare;
  }
  
  private static Boolean _compare(final Float data, final ComparisonOperator operator, final Float value) {
    Boolean _numberCompare = ConditionEvaluator.<Float>numberCompare(data, operator, value);
    return _numberCompare;
  }
  
  private static Boolean _compare(final Double data, final ComparisonOperator operator, final Double value) {
    Boolean _numberCompare = ConditionEvaluator.<Double>numberCompare(data, operator, value);
    return _numberCompare;
  }
  
  private static <T extends Number & Comparable<T>> Boolean numberCompare(final T data, final ComparisonOperator operator, final T value) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      boolean _equals = Objects.equal(operator, ComparisonOperator.EQUAL);
      if (_equals) {
        _matched=true;
        boolean _equals_1 = data.equals(value);
        _switchResult = _equals_1;
      }
    }
    if (!_matched) {
      boolean _equals_2 = Objects.equal(operator, ComparisonOperator.UNEQUAL);
      if (_equals_2) {
        _matched=true;
        boolean _equals_3 = data.equals(value);
        boolean _not = (!_equals_3);
        _switchResult = _not;
      }
    }
    if (!_matched) {
      boolean _equals_4 = Objects.equal(operator, ComparisonOperator.GREATER);
      if (_equals_4) {
        _matched=true;
        Boolean _switchResult_1 = null;
        boolean _matched_1 = false;
        if (!_matched_1) {
          boolean _greaterThan = (data.compareTo(value) > 0);
          if (_greaterThan) {
            _matched_1=true;
            _switchResult_1 = Boolean.TRUE;
          }
        }
        if (!_matched_1) {
          _switchResult_1 = Boolean.FALSE;
        }
        _switchResult = (_switchResult_1).booleanValue();
      }
    }
    if (!_matched) {
      boolean _equals_5 = Objects.equal(operator, ComparisonOperator.GREATEROREQUAL);
      if (_equals_5) {
        _matched=true;
        Boolean _switchResult_2 = null;
        boolean _matched_2 = false;
        if (!_matched_2) {
          boolean _greaterEqualsThan = (data.compareTo(value) >= 0);
          if (_greaterEqualsThan) {
            _matched_2=true;
            _switchResult_2 = Boolean.TRUE;
          }
        }
        if (!_matched_2) {
          _switchResult_2 = Boolean.FALSE;
        }
        _switchResult = (_switchResult_2).booleanValue();
      }
    }
    if (!_matched) {
      boolean _equals_6 = Objects.equal(operator, ComparisonOperator.LOWER);
      if (_equals_6) {
        _matched=true;
        Boolean _switchResult_3 = null;
        boolean _matched_3 = false;
        if (!_matched_3) {
          boolean _lessThan = (data.compareTo(value) < 0);
          if (_lessThan) {
            _matched_3=true;
            _switchResult_3 = Boolean.TRUE;
          }
        }
        if (!_matched_3) {
          _switchResult_3 = Boolean.FALSE;
        }
        _switchResult = (_switchResult_3).booleanValue();
      }
    }
    if (!_matched) {
      boolean _equals_7 = Objects.equal(operator, ComparisonOperator.LOWEROREQUAL);
      if (_equals_7) {
        _matched=true;
        Boolean _switchResult_4 = null;
        boolean _matched_4 = false;
        if (!_matched_4) {
          boolean _lessEqualsThan = (data.compareTo(value) <= 0);
          if (_lessEqualsThan) {
            _matched_4=true;
            _switchResult_4 = Boolean.TRUE;
          }
        }
        if (!_matched_4) {
          _switchResult_4 = Boolean.FALSE;
        }
        _switchResult = (_switchResult_4).booleanValue();
      }
    }
    if (!_matched) {
      IllegalArgumentException _illegalArgumentException = new IllegalArgumentException();
      throw _illegalArgumentException;
    }
    return Boolean.valueOf(_switchResult);
  }
  
  private static Boolean compare(final Object data, final ComparisonOperator operator, final Object value) {
    if (data instanceof Double
         && value instanceof Double) {
      return _compare((Double)data, operator, (Double)value);
    } else if (data instanceof Float
         && value instanceof Float) {
      return _compare((Float)data, operator, (Float)value);
    } else if (data instanceof Integer
         && value instanceof Integer) {
      return _compare((Integer)data, operator, (Integer)value);
    } else if (data instanceof Boolean
         && value instanceof Boolean) {
      return _compare((Boolean)data, operator, (Boolean)value);
    } else if (data instanceof String
         && value instanceof String) {
      return _compare((String)data, operator, (String)value);
    } else if (data != null
         && value instanceof String) {
      return _compare(data, operator, (String)value);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(data, operator, value).toString());
    }
  }
}
