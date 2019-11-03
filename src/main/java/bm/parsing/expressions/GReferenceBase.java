package bm.parsing.expressions;

import bm.parsing.GGenericArgument;

public class GReferenceBase extends GExpression {

    private String symbol;
    private GGenericArgument genericArgument;
    private GExpression keyAccess;

    // getters & setters

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public GGenericArgument getGenericArgument() {
        return genericArgument;
    }

    public void setGenericArgument(GGenericArgument genericArgument) {
        this.genericArgument = genericArgument;
    }

    public GExpression getKeyAccess() {
        return keyAccess;
    }

    public void setKeyAccess(GExpression keyAccess) {
        this.keyAccess = keyAccess;
    }
}
