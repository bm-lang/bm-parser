package bm.parser.target.expressions;

/**
 * minuend - subtrahend = difference
 */
public class PSubtraction extends PExpression {

    private PExpression minuend;
    private PExpression subtrahend;

    // getters & setters

    public PExpression getMinuend() {
        return minuend;
    }

    public void setMinuend(PExpression minuend) {
        this.minuend = minuend;
    }

    public PExpression getSubtrahend() {
        return subtrahend;
    }

    public void setSubtrahend(PExpression subtrahend) {
        this.subtrahend = subtrahend;
    }
}
