package it.unicam.cs.expression.api.loreti;

/**
 * A numeric expression is an expression that represents a numeric value.
 */
public class NumericExpression implements Expression {

    private final int value;


    public NumericExpression(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int evalToInteger() {
        return getValue();
    }

    @Override
    public double evalToDouble() {
        return getValue();
    }
}
