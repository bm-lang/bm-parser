package bm.parser.target.expressions;

public class GNumberLiteral extends GExpression {

    private String sign;
    private String integerPart;
    private String fractionPart;
    private String exponentSign;
    private String exponentNumber;

    // getters & setters

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getIntegerPart() {
        return integerPart;
    }

    public void setIntegerPart(String integerPart) {
        this.integerPart = integerPart;
    }

    public String getFractionPart() {
        return fractionPart;
    }

    public void setFractionPart(String fractionPart) {
        this.fractionPart = fractionPart;
    }

    public String getExponentSign() {
        return exponentSign;
    }

    public void setExponentSign(String exponentSign) {
        this.exponentSign = exponentSign;
    }

    public String getExponentNumber() {
        return exponentNumber;
    }

    public void setExponentNumber(String exponentNumber) {
        this.exponentNumber = exponentNumber;
    }
}
