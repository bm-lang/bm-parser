package bm.parser.target.instructions;

import bm.parser.target.expressions.PInlineInvocation;

public class PInvocation extends PInstruction {

    private PInlineInvocation invocation;

    // getters & setters

    public PInlineInvocation getInvocation() {
        return invocation;
    }

    public void setInvocation(PInlineInvocation invocation) {
        this.invocation = invocation;
    }
}
