package it.unicam.cs.expression.api.loreti;

/**
 * An expression evaluator is an object that can evaluate an expression to an integer value.
 */
public interface IntegerExpressionEvaluator {

    /**
     * Evaluate the given expression to an integer value.
     *
     * @param expression the expression to evaluate
     * @return the integer value of the expression
     */
    int eval(Expression expression);
}