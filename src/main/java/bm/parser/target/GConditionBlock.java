package bm.parser.target;

import bm.parser.target.expressions.GExpression;

public class GConditionBlock {

    private GExpression condition;
    private GBlock block;

    // getters & setters

    public GExpression getCondition() {
        return condition;
    }

    public void setCondition(GExpression condition) {
        this.condition = condition;
    }

    public GBlock getBlock() {
        return block;
    }

    public void setBlock(GBlock block) {
        this.block = block;
    }
}
