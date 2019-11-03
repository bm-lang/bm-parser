package bm.parsing.instructions;

import bm.parsing.expressions.GExpression;

public class GReturn extends GInstruction {

    private GExpression value;

    // getters & setters

    public GExpression getValue() {
        return value;
    }

    public void setValue(GExpression value) {
        this.value = value;
    }
}
