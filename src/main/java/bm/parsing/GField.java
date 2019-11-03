package bm.parsing;

import bm.parsing.expressions.GExpression;

public class GField extends GMember {

    public GName name;
    public GModuleAccess moduleAccess;
    public GMemberModifier modifier;
    public GFieldMode fieldMode;
    public GTypeRef dataType;
    public GExpression initialValue;

}
