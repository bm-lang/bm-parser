package bm.parsing.expressions;

import bm.parsing.GBlock;
import bm.parsing.GParameterList;

public class GLambdaValue extends GExpression {

    private GParameterList parameters;
    private GBlock block;

    // getters & setters

    public GParameterList getParameters() {
        return parameters;
    }

    public void setParameters(GParameterList parameters) {
        this.parameters = parameters;
    }

    public GBlock getBlock() {
        return block;
    }

    public void setBlock(GBlock block) {
        this.block = block;
    }
}
