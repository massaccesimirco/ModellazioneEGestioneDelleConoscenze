package it.unicam.cs.expression.api.loreti;

/**
 * A unary expression is an expression that has a single operand.
 */
public class UnaryExpression implements Expression {

    private final Expression argument;

    private final UnaryOperator operator;

    public UnaryExpression(Expression argument, UnaryOperator operator) {
        this.argument = argument;
        this.operator = operator;
    }

    public Expression getArgument() {
        return argument;
    }

    public UnaryOperator getOperator() {
        return operator;
    }

    @Override
    public int evalToInteger() {

        if (this.operator == UnaryOperator.MINUS) {
            return -this.argument.evalToInteger();
        } else {
            return this.argument.evalToInteger();
        }
    }

    @Override
    public double evalToDouble() {

        if (this.operator == UnaryOperator.MINUS) {
            return -this.argument.evalToDouble();
        } else {
            return this.argument.evalToDouble();
        }
    }
}
