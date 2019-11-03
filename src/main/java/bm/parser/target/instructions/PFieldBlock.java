package bm.parser.target.instructions;

import bm.parser.target.expressions.PExpression;
import bm.parser.target.PFieldMode;
import bm.parser.target.PName;
import bm.parser.target.PTypeRef;

public class PFieldBlock extends PInstruction {

    private PFieldMode fieldMode;
    private PName name;
    private PTypeRef dataType;
    private PExpression initialValue;

    // getters & setters

    public PFieldMode getFieldMode() {
        return fieldMode;
    }

    public void setFieldMode(PFieldMode fieldMode) {
        this.fieldMode = fieldMode;
    }

    public PName getName() {
        return name;
    }

    public void setName(PName name) {
        this.name = name;
    }

    public PTypeRef getDataType() {
        return dataType;
    }

    public void setDataType(PTypeRef dataType) {
        this.dataType = dataType;
    }

    public PExpression getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(PExpression initialValue) {
        this.initialValue = initialValue;
    }
}
