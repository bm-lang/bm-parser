package bm.parser.target.instructions;

import bm.parser.target.expressions.GExpression;
import bm.parser.target.expressions.GReference;

public class GAssignment extends GInstruction {

    private GReference reference;
    private GExpression value;

    // getters & setters

    public GReference getReference() {
        return reference;
    }

    public void setReference(GReference reference) {
        this.reference = reference;
    }

    public GExpression getValue() {
        return value;
    }

    public void setValue(GExpression value) {
        this.value = value;
    }
}
