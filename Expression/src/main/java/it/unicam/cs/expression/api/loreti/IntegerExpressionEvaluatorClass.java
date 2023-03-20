package it.unicam.cs.expression.api.loreti;

/**
 * An expression evaluator is an object that can evaluate an expression to an integer value.
 */
public class IntegerExpressionEvaluatorClass implements IntegerExpressionEvaluator {

    @Override
    public int eval(Expression expression) {
        return 0;
    }

    public int eval(NumericExpression expression) {
        return expression.getValue();
    }

    public int eval(BinaryExpression expression) {
        return expression.getOperator().apply(eval(expression.getFirstArgument()), eval(expression.getSecondArgument()));
    }

    public int eval(UnaryExpression expression) {
        if (expression.getOperator() == UnaryOperator.MINUS) {
            return -eval(expression.getArgument());
        } else {
            return eval(expression.getArgument());
        }
    }
}