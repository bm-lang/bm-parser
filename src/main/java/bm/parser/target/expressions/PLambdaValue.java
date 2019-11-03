package bm.parser.target.expressions;

import bm.parser.target.PBlock;
import bm.parser.target.PParameterList;

public class PLambdaValue extends PExpression {

    private PParameterList parameters;
    private PBlock block;

    // getters & setters

    public PParameterList getParameters() {
        return parameters;
    }

    public void setParameters(PParameterList parameters) {
        this.parameters = parameters;
    }

    public PBlock getBlock() {
        return block;
    }

    public void setBlock(PBlock block) {
        this.block = block;
    }
}
