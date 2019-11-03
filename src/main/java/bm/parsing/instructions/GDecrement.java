package bm.parsing.instructions;

import bm.parsing.expressions.GReference;

public class GDecrement extends GInstruction {

    private GReference reference;

    // getters & setters

    public GReference getReference() {
        return reference;
    }

    public void setReference(GReference reference) {
        this.reference = reference;
    }
}
