package bm.parser.target.instructions;

import bm.parser.target.PBlock;
import bm.parser.target.expressions.PExpression;

public class PFor extends PInstruction {

    public PInstructionList initialization;
    public PExpression condition;
    public PInstructionList increment;
    public PBlock block;

}

