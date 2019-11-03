package bm.parsing.instructions;

import bm.parsing.GBlock;
import bm.parsing.expressions.GExpression;

public class GWhile extends GInstruction {

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
