package bm.parser.target.expressions;

public class GSignedExpression extends GExpression {

    private String sign;
    private GExpression expression;

    // getter & setter

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public GExpression getExpression() {
        return expression;
    }

    public void setExpression(GExpression expression) {
        this.expression = expression;
    }
}
