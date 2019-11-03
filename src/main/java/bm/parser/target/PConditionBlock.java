package bm.parser.target;

import bm.parser.target.expressions.PExpression;

public class PConditionBlock {

    private PExpression condition;
    private PBlock block;

    // getters & setters

    public PExpression getCondition() {
        return condition;
    }

    public void setCondition(PExpression condition) {
        this.condition = condition;
    }

    public PBlock getBlock() {
        return block;
    }

    public void setBlock(PBlock block) {
        this.block = block;
    }
}
