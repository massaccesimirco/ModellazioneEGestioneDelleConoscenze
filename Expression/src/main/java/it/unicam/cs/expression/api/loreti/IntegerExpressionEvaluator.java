package it.unicam.cs.expression.api.loreti;

/**
 * An expression evaluator is an object that can evaluate an expression to an integer value.
 */
public interface IntegerExpressionEvaluator {

    int sum(int a, int b);

    int diff(int a, int b);

    int mul(int a, int b);

    int div(int a, int b);

    int intOf(NumericExpression expression);

    int plus(int value);

    int minus(int value);
}