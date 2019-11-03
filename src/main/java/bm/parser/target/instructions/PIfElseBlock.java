package bm.parser.target.instructions;

import bm.parser.target.PBlock;
import bm.parser.target.PConditionBlockList;

public class PIfElseBlock extends PInstruction {

    private PConditionBlockList ifBlocks;
    private PBlock elseBlock;

    // getters & setters

    public PConditionBlockList getIfBlocks() {
        return ifBlocks;
    }

    public void setIfBlocks(PConditionBlockList ifBlocks) {
        this.ifBlocks = ifBlocks;
    }

    public PBlock getElseBlock() {
        return elseBlock;
    }

    public void setElseBlock(PBlock elseBlock) {
        this.elseBlock = elseBlock;
    }
}
