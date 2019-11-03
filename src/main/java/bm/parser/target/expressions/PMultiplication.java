package bm.parser.target.expressions;

/**
 * multiplicand * multiplier = product
 */
public class PMultiplication extends PExpression {

    private PExpression multiplicand;
    private PExpression multiplier;

    // getters & setters

    public PExpression getMultiplicand() {
        return multiplicand;
    }

    public void setMultiplicand(PExpression multiplicand) {
        this.multiplicand = multiplicand;
    }

    public PExpression getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(PExpression multiplier) {
        this.multiplier = multiplier;
    }
}
