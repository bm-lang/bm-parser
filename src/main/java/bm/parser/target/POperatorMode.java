package bm.parser.target;

public enum POperatorMode {

    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    EXPONENTIATION("^"),
    KEY_GET("[]"),
    KEY_SET("[]="),
    CONVERSION("~"),
    ;

    private final String symbol;

    POperatorMode(String symbol) {
        this.symbol = symbol;
    }

    public static POperatorMode convert(Object obj) {
        if (obj instanceof POperatorMode) {
            return (POperatorMode)obj;
        }

        for (POperatorMode ot : values()) {
            if (ot.symbol.equals(obj)) {
                return ot;
            }
        }

        throw new RuntimeException("invalid " + POperatorMode.class + ": " + obj);
    }
}
