package bm.parser.target.instructions;

import bm.parser.target.GBlock;
import bm.parser.target.expressions.GExpression;

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
