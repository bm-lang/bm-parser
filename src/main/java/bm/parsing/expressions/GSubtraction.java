package bm.parsing.expressions;

/**
 * minuend - subtrahend = difference
 */
public class GSubtraction extends GExpression {

    private GExpression minuend;
    private GExpression subtrahend;

    // getters & setters

    public GExpression getMinuend() {
        return minuend;
    }

    public void setMinuend(GExpression minuend) {
        this.minuend = minuend;
    }

    public GExpression getSubtrahend() {
        return subtrahend;
    }

    public void setSubtrahend(GExpression subtrahend) {
        this.subtrahend = subtrahend;
    }
}
