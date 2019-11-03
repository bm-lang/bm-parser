package bm.parser.target;

public enum PModuleAccess {

    PROTECT("protect"),
    EXPORT("export"),
    SHARE("share");

    private final String token;

    PModuleAccess(String token) { this.token = token; }

    public static PModuleAccess convert(Object obj) {
        if (obj instanceof PModuleAccess) {
            return (PModuleAccess)obj;
        }

        for (PModuleAccess moduleAccess : values()) {
            if (moduleAccess.token.equals(obj)) {
                return moduleAccess;
            }
        }

        throw new RuntimeException("invalid " + PModuleAccess.class + ": " + obj);
    }

}
