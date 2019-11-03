package bm.parsing.instructions;

import bm.parsing.GBlock;
import bm.parsing.expressions.GExpression;
import bm.parsing.expressions.GExpressionList;

public class GFor extends GInstruction {

    public GInstructionList initialization;
    public GExpression condition;
    public GInstructionList increment;
    public GBlock block;

}

