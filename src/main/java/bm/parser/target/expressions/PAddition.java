package bm.parser.target.expressions;

public class PAddition extends PExpression {

    private PExpression termStart;
    private PExpression termEnd;

    // getters & setters

    public PExpression getTermStart() {
        return termStart;
    }

    public void setTermStart(PExpression termStart) {
        this.termStart = termStart;
    }

    public PExpression getTermEnd() {
        return termEnd;
    }

    public void setTermEnd(PExpression termEnd) {
        this.termEnd = termEnd;
    }
}
