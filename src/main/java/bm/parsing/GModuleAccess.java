package bm.parsing;

public enum GModuleAccess {

    PROTECT("protect"),
    EXPORT("export"),
    SHARE("share");

    private final String token;

    GModuleAccess(String token) { this.token = token; }

    public static GModuleAccess convert(Object obj) {
        if (obj instanceof GModuleAccess) {
            return (GModuleAccess)obj;
        }

        for (GModuleAccess moduleAccess : values()) {
            if (moduleAccess.token.equals(obj)) {
                return moduleAccess;
            }
        }

        throw new RuntimeException("invalid " + GModuleAccess.class + ": " + obj);
    }

}
