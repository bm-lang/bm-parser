package bm.parser.target;

public class GClass extends GMember {

    public GModuleAccess moduleAccess;
    public GMemberModifier modifier;
    public GName name;
    public GTypeRefList superClasses;
    public GTypeRefList superInterfaces;
    public GMemberList members;
    public GGenericSignature genericSignature;

}
