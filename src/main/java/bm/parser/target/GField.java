package bm.parser.target;

import bm.parser.target.expressions.GExpression;

public class GField extends GMember {

    public GName name;
    public GModuleAccess moduleAccess;
    public GMemberModifier modifier;
    public GFieldMode fieldMode;
    public GTypeRef dataType;
    public GExpression initialValue;

}
