package it.unicam.cs.expression.api.loreti;

/**
 * A unary operator is an operator that takes a single operand.
 */
public enum UnaryOperator {

    PLUS, MINUS;

    public <T> T apply(ExpressionEvaluator<T> evaluator, T value) {
        return switch (this) {
            case PLUS -> evaluator.plus(value);
            case MINUS -> evaluator.minus(value);
            default -> throw new IllegalStateException("Unexpected value: " + this);
        };
    }
}
