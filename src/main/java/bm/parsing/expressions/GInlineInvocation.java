package bm.parsing.expressions;

public class GInlineInvocation extends GExpression {

    private GReference reference;
    private GExpressionList arguments;

    // getters & setters

    public GReference getReference() {
        return reference;
    }

    public void setReference(GReference reference) {
        this.reference = reference;
    }

    public GExpressionList getArguments() {
        return arguments;
    }

    public void setArguments(GExpressionList arguments) {
        this.arguments = arguments;
    }
}
