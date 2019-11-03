package bm.parsing;

public enum GFieldMode {

    CONST,
    VAR;

    public static GFieldMode convert(Object obj) {
        if (obj instanceof GFieldMode) {
            return (GFieldMode)obj;
        }

        if ("var".equals(obj)) {
            return VAR;
        }
        else if ("const".equals(obj)) {
            return CONST;
        }

        throw new RuntimeException("invalid " + GFieldMode.class + ": " + obj);
    }
}
