package it.unicam.cs.expression.api.loreti;

public class LatexExpressionEvaluator implements ExpressionEvaluator<String> {

    @Override
    public String sum(String a, String b) {
        return a + "+" + b;
    }

    @Override
    public String diff(String a, String b) {
        return a + "-" + b;
    }

    @Override
    public String mul(String a, String b) {
        return a + "*" + b;
    }

    @Override
    public String div(String a, String b) {
        return String.format("\\frac{%s}{%s}", a, b);
    }

    @Override
    public String valueOf(NumericExpression expression) {
        return expression.getValue() + "";
    }

    @Override
    public String plus(String value) {
        return "+" + value;
    }

    @Override
    public String minus(String value) {
        return "-" + value;
    }
}