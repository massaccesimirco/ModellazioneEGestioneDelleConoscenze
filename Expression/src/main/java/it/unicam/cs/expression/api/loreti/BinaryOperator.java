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
    public int apply(int v1, int v2) {
        return switch (this) {
            case SUM -> v1 + v2;
            case DIF -> v1 - v2;
            case MUL -> v1 * v2;
            case DIV -> v1 / v2;
            default -> throw new IllegalArgumentException("Unknown operator: " + this);
        };
    }
}