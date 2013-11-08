/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration

import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition
import org.modelversioning.emfprofile.decoration.decorationLanguage.ComparisonOperator
import org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition
import org.modelversioning.emfprofile.decoration.decorationLanguage.Condition
import org.modelversioning.emfprofile.decoration.decorationLanguage.LogicalOperator
import org.modelversioning.emfprofileapplication.StereotypeApplication

/**
 * It is an utility class to evaluate if a specific decoration should be active or 
 * inactive for a concrete {@link StereotypeApplication stereotype application}.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
class ConditionEvaluator {
	
	private new() {}
	
	def static DecorationStatus execute(AbstractCondition condition, StereotypeApplication stereotypeApplication) {
		val evaluation = evaluate(condition, stereotypeApplication)
		switch evaluation {
			case evaluation == Boolean.TRUE : {
				DecorationStatus::ACTIVE
			}
			case evaluation == Boolean.FALSE : {
				DecorationStatus::INANCTIVE
			}
			default:
				DecorationStatus::UNKNOWN
		}
	}
	
	def private static Boolean evaluate(AbstractCondition condition, StereotypeApplication application) {
		
		switch condition {
			Condition : {
				val attribute = application.eClass.EAllAttributes.findFirst[name == condition.attribute.name];
				compare(application.eGet(attribute), condition.operator, condition.value)
			}
			
			CompositeCondition : {
				val operator = condition.operator
				switch operator {
					case operator == LogicalOperator::ALL : {
						condition.conditions.forall[c | evaluate(c, application) == true]
					}
					case operator == LogicalOperator::ANY : {
						condition.conditions.exists[c | evaluate(c, application) == true]
					}
				}
			}
			default:
				null as Boolean
		}
	}
	
	def private static dispatch Boolean compare(Object data, ComparisonOperator operator, String value) {
//		println('''COMPARING data: «data.toString», data class: «data.class.name», operator: «operator», value: «value»''')
		switch data {
			String : {
				compare(data, operator, value)
			}
			Boolean : {
				compare(data, operator, Boolean.valueOf(value))
			}
			Integer : {
				compare(data, operator, Integer.valueOf(value))
			}
			Float : {
				compare(data, operator, Float.valueOf(value))
			}
			Double : {
				compare(data, operator, Double.valueOf(value))
			}
			default:
				throw new IllegalArgumentException('''Comparing data type that is not supported: «data.class.name»''')
		}
	}
	
	def private static dispatch Boolean compare(String data, ComparisonOperator operator, String value){
		switch operator {
			case operator == ComparisonOperator::EQUAL : {
				data.equals(value)
			}
			case operator == ComparisonOperator::UNEQUAL : {
				! data.equals(value)
			}
			default :
				throw new IllegalArgumentException('''Wrong comparison operator with String type: «operator»''')
		}
	}

	def private static dispatch Boolean compare(Boolean data, ComparisonOperator operator, Boolean value){
		switch operator {
			case operator == ComparisonOperator::EQUAL : {
				data.equals(value)
			}
			case operator == ComparisonOperator::UNEQUAL : {
				! data.equals(value)
			}
			default :
				throw new IllegalArgumentException('''Wrong comparison operator with Boolean type: «operator»''')
		}
	}

	def private static dispatch Boolean compare(Integer data, ComparisonOperator operator, Integer value){
		numberCompare(data, operator, value)
	}

	def private static dispatch Boolean compare(Float data, ComparisonOperator operator, Float value){
		numberCompare(data, operator, value)
	}

	def private static dispatch Boolean compare(Double data, ComparisonOperator operator, Double value){
		numberCompare(data, operator, value)
	}
	
	def private static <T extends Number & Comparable<T>> Boolean numberCompare(T data, ComparisonOperator operator, T value){
		switch operator {
			case operator == ComparisonOperator::EQUAL : {
				data.equals(value)
			}
			case operator == ComparisonOperator::UNEQUAL : {
				! data.equals(value)
			}
			case operator == ComparisonOperator::GREATER : {
				switch data {
					case data > value : {
						Boolean.TRUE
					}
					default: 
						Boolean.FALSE
				}
			}
			case operator == ComparisonOperator::GREATEROREQUAL : {
				switch data {
					case data >= value : {
						Boolean.TRUE
					}
					default: 
						Boolean.FALSE
				}
			}
			case operator == ComparisonOperator::LOWER : {
				switch data {
					case data < value : {
						Boolean.TRUE
					}
					default: 
						Boolean.FALSE
				}
			}
			case operator == ComparisonOperator::LOWEROREQUAL : {
				switch data {
					case data <= value : {
						Boolean.TRUE
					}
					default: 
						Boolean.FALSE
				}
			}
			default:
				throw new IllegalArgumentException()
		}
	}
}