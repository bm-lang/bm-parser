package bm.parser.target;

public enum PFieldMode {

    CONST,
    VAR;

    public static PFieldMode convert(Object obj) {
        if (obj instanceof PFieldMode) {
            return (PFieldMode)obj;
        }

        if ("var".equals(obj)) {
            return VAR;
        }
        else if ("const".equals(obj)) {
            return CONST;
        }

        throw new RuntimeException("invalid " + PFieldMode.class + ": " + obj);
    }
}
