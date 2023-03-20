package it.unica.cs.expression.api;

public class BinaryExpression implements Expression {

    private final Expression firstArgument;

    private final BinaryOperator operator;

    private final Expression secondArgument;


    public BinaryExpression(Expression firstArgument, BinaryOperator operator, Expression secondArgument) {
        this.firstArgument = firstArgument;
        this.operator = operator;
        this.secondArgument = secondArgument;
    }

    public Expression getFirstArgument() {
        return firstArgument;
    }

    public Expression getSecondArgument() {
        return secondArgument;
    }

    public BinaryOperator getOperator() {
        return operator;
    }

    @Override
    public int evalToInteger() {
        return operator.apply(firstArgument.evalToInteger(), secondArgument.evalToInteger());
    }

    @Override
    public double evalToDouble() {
        return 0;
    }
}
