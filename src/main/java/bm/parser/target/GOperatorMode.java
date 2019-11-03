package bm.parser.target;

public enum GOperatorMode {

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

    GOperatorMode(String symbol) {
        this.symbol = symbol;
    }

    public static GOperatorMode convert(Object obj) {
        if (obj instanceof GOperatorMode) {
            return (GOperatorMode)obj;
        }

        for (GOperatorMode ot : values()) {
            if (ot.symbol.equals(obj)) {
                return ot;
            }
        }

        throw new RuntimeException("invalid " + GOperatorMode.class + ": " + obj);
    }
}
