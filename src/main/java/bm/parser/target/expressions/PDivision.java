package bm.parser.target.expressions;

/**
 * dividend / divisor = quotient
 */
public class PDivision extends PExpression {

    private PExpression dividend;
    private PExpression divisor;

    // getters & setters

    public PExpression getDividend() {
        return dividend;
    }

    public void setDividend(PExpression dividend) {
        this.dividend = dividend;
    }

    public PExpression getDivisor() {
        return divisor;
    }

    public void setDivisor(PExpression divisor) {
        this.divisor = divisor;
    }
}
