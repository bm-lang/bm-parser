package bm.parser.target.instructions;

import bm.parser.target.expressions.PReference;

public class PDecrement extends PInstruction {

    private PReference reference;

    // getters & setters

    public PReference getReference() {
        return reference;
    }

    public void setReference(PReference reference) {
        this.reference = reference;
    }
}
