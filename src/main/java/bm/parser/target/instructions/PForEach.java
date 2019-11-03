package bm.parser.target.instructions;

import bm.parser.target.PBlock;
import bm.parser.target.PName;
import bm.parser.target.expressions.PExpression;

public class PForEach extends PInstruction {

    private PExpression source;
    private PName itemName;
    private PName keyName;
    private PBlock block;

    // getters & setters

    public PExpression getSource() {
        return source;
    }

    public void setSource(PExpression source) {
        this.source = source;
    }

    public PName getItemName() {
        return itemName;
    }

    public void setItemName(PName itemName) {
        this.itemName = itemName;
    }

    public PName getKeyName() {
        return keyName;
    }

    public void setKeyName(PName keyName) {
        this.keyName = keyName;
    }

    public PBlock getBlock() {
        return block;
    }

    public void setBlock(PBlock block) {
        this.block = block;
    }
}
