package bm.parsing.instructions;

import bm.parsing.GBlock;

public class GLoop extends GInstruction {

    private GBlock block;

    // getters & setters

    public GBlock getBlock() {
        return block;
    }

    public void setBlock(GBlock block) {
        this.block = block;
    }
}
