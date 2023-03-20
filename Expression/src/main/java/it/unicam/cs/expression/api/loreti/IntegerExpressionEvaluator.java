package it.unicam.cs.expression.api.loreti;

/**
 * An expression evaluator is an object that can evaluate an expression to an integer value.
 */
public class IntegerExpressionEvaluator implements ExpressionEvaluator<Integer> {

    @Override
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer diff(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer mul(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer div(Integer a, Integer b) {
        return a / b;
    }

    @Override
    public Integer valueOf(NumericExpression expression) {
        return expression.getValue();
    }

    @Override
    public Integer plus(Integer value) {
        return value;
    }

    @Override
    public Integer minus(Integer value) {
        return -value;
    }
}