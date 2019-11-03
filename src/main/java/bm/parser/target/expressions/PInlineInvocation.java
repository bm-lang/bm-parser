package bm.parser.target.expressions;

public class PInlineInvocation extends PExpression {

    private PReference reference;
    private PExpressionList arguments;

    // getters & setters

    public PReference getReference() {
        return reference;
    }

    public void setReference(PReference reference) {
        this.reference = reference;
    }

    public PExpressionList getArguments() {
        return arguments;
    }

    public void setArguments(PExpressionList arguments) {
        this.arguments = arguments;
    }
}
