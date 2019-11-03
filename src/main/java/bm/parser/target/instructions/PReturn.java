package bm.parser.target.instructions;

import bm.parser.target.expressions.PExpression;

public class PReturn extends PInstruction {

    private PExpression value;

    // getters & setters

    public PExpression getValue() {
        return value;
    }

    public void setValue(PExpression value) {
        this.value = value;
    }
}
