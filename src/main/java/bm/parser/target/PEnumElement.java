package bm.parser.target;

import bm.parser.target.expressions.PExpression;

public class PEnumElement {

    private PName name;
    private PExpression initialValue;

    // getters & setters

    public PName getName() {
        return name;
    }

    public void setName(PName name) {
        this.name = name;
    }

    public PExpression getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(PExpression initialValue) {
        this.initialValue = initialValue;
    }
}
