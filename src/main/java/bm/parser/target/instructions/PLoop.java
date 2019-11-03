package bm.parser.target.instructions;

import bm.parser.target.PBlock;

public class PLoop extends PInstruction {

    private PBlock block;

    // getters & setters

    public PBlock getBlock() {
        return block;
    }

    public void setBlock(PBlock block) {
        this.block = block;
    }
}
