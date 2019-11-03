package bm.parsing.expressions;

/**
 * multiplicand * multiplier = product
 */
public class GMultiplication extends GExpression {

    private GExpression multiplicand;
    private GExpression multiplier;

    // getters & setters

    public GExpression getMultiplicand() {
        return multiplicand;
    }

    public void setMultiplicand(GExpression multiplicand) {
        this.multiplicand = multiplicand;
    }

    public GExpression getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(GExpression multiplier) {
        this.multiplier = multiplier;
    }
}
