package it.unicam.cs.expression.api.loreti;

/**
 * An expression evaluator is an object that can evaluate an expression to a value.
 *
 * @param <T> the type of the value returned by the evaluator.
 */
public interface ExpressionEvaluator<T> {

    T sum(T a, T b);

    T diff(T a, T b);

    T mul(T a, T b);

    T div(T a, T b);

    T valueOf(NumericExpression expression);

    T plus(T value);

    T minus(T value);
}