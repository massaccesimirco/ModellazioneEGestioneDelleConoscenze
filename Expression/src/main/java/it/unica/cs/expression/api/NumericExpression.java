package it.unica.cs.expression.api;

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
