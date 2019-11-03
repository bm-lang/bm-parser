package bm.parser.target.instructions;

import bm.parser.target.PBlock;
import bm.parser.target.expressions.PExpression;

public class PWhile extends PInstruction {

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
