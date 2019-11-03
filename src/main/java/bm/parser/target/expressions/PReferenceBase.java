package bm.parser.target.expressions;

import bm.parser.target.PGenericArgument;

public class PReferenceBase extends PExpression {

    private String symbol;
    private PGenericArgument genericArgument;
    private PExpression keyAccess;

    // getters & setters

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public PGenericArgument getGenericArgument() {
        return genericArgument;
    }

    public void setGenericArgument(PGenericArgument genericArgument) {
        this.genericArgument = genericArgument;
    }

    public PExpression getKeyAccess() {
        return keyAccess;
    }

    public void setKeyAccess(PExpression keyAccess) {
        this.keyAccess = keyAccess;
    }
}
