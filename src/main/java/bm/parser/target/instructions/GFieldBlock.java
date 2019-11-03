package bm.parser.target.instructions;

import bm.parser.target.expressions.GExpression;
import bm.parser.target.GFieldMode;
import bm.parser.target.GName;
import bm.parser.target.GTypeRef;

public class GFieldBlock extends GInstruction {

    private GFieldMode fieldMode;
    private GName name;
    private GTypeRef dataType;
    private GExpression initialValue;

    // getters & setters

    public GFieldMode getFieldMode() {
        return fieldMode;
    }

    public void setFieldMode(GFieldMode fieldMode) {
        this.fieldMode = fieldMode;
    }

    public GName getName() {
        return name;
    }

    public void setName(GName name) {
        this.name = name;
    }

    public GTypeRef getDataType() {
        return dataType;
    }

    public void setDataType(GTypeRef dataType) {
        this.dataType = dataType;
    }

    public GExpression getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(GExpression initialValue) {
        this.initialValue = initialValue;
    }
}
