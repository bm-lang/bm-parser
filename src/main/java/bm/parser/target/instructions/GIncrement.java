package bm.parser.target.instructions;

import bm.parser.target.expressions.GReference;

public class GIncrement extends GInstruction {

    private GReference reference;

    // getters & setters

    public GReference getReference() {
        return reference;
    }

    public void setReference(GReference reference) {
        this.reference = reference;
    }
}
