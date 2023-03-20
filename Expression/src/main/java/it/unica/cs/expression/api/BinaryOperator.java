package it.unica.cs.expression.api;

public enum BinaryOperator {

    SUM,

    DIF,

    MUL,

    DIV;

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