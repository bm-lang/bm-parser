package bm.parser.target.instructions;

import bm.parser.target.expressions.PExpression;
import bm.parser.target.expressions.PReference;

public class PAssignment extends PInstruction {

    private PReference reference;
    private PExpression value;

    // getters & setters

    public PReference getReference() {
        return reference;
    }

    public void setReference(PReference reference) {
        this.reference = reference;
    }

    public PExpression getValue() {
        return value;
    }

    public void setValue(PExpression value) {
        this.value = value;
    }
}
