package bm.parser.target.expressions;

/**
 * dividend / divisor = quotient
 */
public class GDivision extends GExpression {

    private GExpression dividend;
    private GExpression divisor;

    // getters & setters

    public GExpression getDividend() {
        return dividend;
    }

    public void setDividend(GExpression dividend) {
        this.dividend = dividend;
    }

    public GExpression getDivisor() {
        return divisor;
    }

    public void setDivisor(GExpression divisor) {
        this.divisor = divisor;
    }
}
