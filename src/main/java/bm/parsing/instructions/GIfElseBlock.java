package bm.parsing.instructions;

import bm.parsing.GBlock;
import bm.parsing.GConditionBlockList;

public class GIfElseBlock extends GInstruction {

    private GConditionBlockList ifBlocks;
    private GBlock elseBlock;

    // getters & setters

    public GConditionBlockList getIfBlocks() {
        return ifBlocks;
    }

    public void setIfBlocks(GConditionBlockList ifBlocks) {
        this.ifBlocks = ifBlocks;
    }

    public GBlock getElseBlock() {
        return elseBlock;
    }

    public void setElseBlock(GBlock elseBlock) {
        this.elseBlock = elseBlock;
    }
}
