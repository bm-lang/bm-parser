package bm.parser.target;

import bm.parser.target.expressions.PExpression;

public class PField extends PMember {

    public PName name;
    public PModuleAccess moduleAccess;
    public PMemberModifier modifier;
    public PFieldMode fieldMode;
    public PTypeRef dataType;
    public PExpression initialValue;

}
