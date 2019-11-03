package bm.parser.target;

import bm.parser.target.expressions.GExpression;

public class GEnumElement {

    private GName name;
    private GExpression initialValue;

    // getters & setters

    public GName getName() {
        return name;
    }

    public void setName(GName name) {
        this.name = name;
    }

    public GExpression getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(GExpression initialValue) {
        this.initialValue = initialValue;
    }
}
