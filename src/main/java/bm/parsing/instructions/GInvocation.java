package bm.parsing.instructions;

import bm.parsing.expressions.GInlineInvocation;

public class GInvocation extends GInstruction {

    private GInlineInvocation invocation;

    // getters & setters

    public GInlineInvocation getInvocation() {
        return invocation;
    }

    public void setInvocation(GInlineInvocation invocation) {
        this.invocation = invocation;
    }
}
