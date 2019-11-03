package bm.parser.target.expressions;

public class PSignedExpression extends PExpression {

    private String sign;
    private PExpression expression;

    // getter & setter

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public PExpression getExpression() {
        return expression;
    }

    public void setExpression(PExpression expression) {
        this.expression = expression;
    }
}
