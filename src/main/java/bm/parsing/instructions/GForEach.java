package bm.parsing.instructions;

import bm.parsing.GBlock;
import bm.parsing.GName;
import bm.parsing.expressions.GExpression;

public class GForEach extends GInstruction {

    private GExpression source;
    private GName itemName;
    private GName keyName;
    private GBlock block;

    // getters & setters

    public GExpression getSource() {
        return source;
    }

    public void setSource(GExpression source) {
        this.source = source;
    }

    public GName getItemName() {
        return itemName;
    }

    public void setItemName(GName itemName) {
        this.itemName = itemName;
    }

    public GName getKeyName() {
        return keyName;
    }

    public void setKeyName(GName keyName) {
        this.keyName = keyName;
    }

    public GBlock getBlock() {
        return block;
    }

    public void setBlock(GBlock block) {
        this.block = block;
    }
}
