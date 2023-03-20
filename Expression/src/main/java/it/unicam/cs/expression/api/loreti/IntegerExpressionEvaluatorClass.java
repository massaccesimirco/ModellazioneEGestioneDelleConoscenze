package it.unicam.cs.expression.api.loreti;

/**
 * An expression evaluator is an object that can evaluate an expression to an integer value.
 */
public class IntegerExpressionEvaluatorClass implements IntegerExpressionEvaluator {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int diff(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }

    @Override
    public int intOf(NumericExpression expression) {
        return expression.getValue();
    }

    @Override
    public int plus(int value) {
        return value;
    }

    @Override
    public int minus(int value) {
        return -value;
    }
}