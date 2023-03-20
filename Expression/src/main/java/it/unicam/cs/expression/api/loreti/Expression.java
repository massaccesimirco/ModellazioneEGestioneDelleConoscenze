package it.unicam.cs.expression.api.loreti;

/**
 * An expression is an object that can be evaluated to a value.
 */
public interface Expression {

    public static void main(String[] args) {
        Expression expression = new BinaryExpression(
                new BinaryExpression(
                        new NumericExpression(2),
                        BinaryOperator.MUL,
                        new NumericExpression(5)
                ),
                BinaryOperator.DIV,
                new BinaryExpression(
                        new NumericExpression(2),
                        BinaryOperator.SUM,
                        new NumericExpression(5)
                )
        );

        System.out.println(expression.eval(new IntegerExpressionEvaluator()));
        System.out.println(expression.eval(new LatexExpressionEvaluator()));
    }

    <T> T eval(ExpressionEvaluator<T> evaluator);
}
