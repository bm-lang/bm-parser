package bm.parser.target.instructions;

import bm.parser.target.GBlock;
import bm.parser.target.expressions.GExpression;

public class GFor extends GInstruction {

    public GInstructionList initialization;
    public GExpression condition;
    public GInstructionList increment;
    public GBlock block;

}

