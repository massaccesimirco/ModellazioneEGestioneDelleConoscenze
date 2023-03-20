package it.unicam.cs.expression.api.loreti;

/**
 * A binary operator is an operator that takes two operands.
 */
public enum BinaryOperator {

    SUM, DIF, MUL, DIV;

    /**
     * Applies the operator to the given operands.
     *
     * @param v1 the first operand
     * @param v2 the second operand
     * @return the result of the operation
     */
    public <T> T apply(ExpressionEvaluator<T> evaluator, T v1, T v2) {
        return switch (this) {
            case SUM -> evaluator.sum(v1, v2);
            case DIF -> evaluator.diff(v1, v2);
            case MUL -> evaluator.mul(v1, v2);
            case DIV -> evaluator.div(v1, v2);
            default -> throw new IllegalArgumentException("Unknown operator: " + this);
        };
    }
}