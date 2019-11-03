package bm.parser.target.expressions;

import bm.parser.target.GBlock;
import bm.parser.target.GParameterList;

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
