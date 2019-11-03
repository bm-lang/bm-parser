package bm.parsing.expressions;

public class GAddition extends GExpression {

    private GExpression termStart;
    private GExpression termEnd;

    // getters & setters

    public GExpression getTermStart() {
        return termStart;
    }

    public void setTermStart(GExpression termStart) {
        this.termStart = termStart;
    }

    public GExpression getTermEnd() {
        return termEnd;
    }

    public void setTermEnd(GExpression termEnd) {
        this.termEnd = termEnd;
    }
}
