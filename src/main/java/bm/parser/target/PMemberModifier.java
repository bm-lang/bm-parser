package bm.parser.target;

public enum PMemberModifier {

    NATIVE;

    public static PMemberModifier convert(Object obj) {
        if (obj instanceof PMemberModifier) {
            return (PMemberModifier)obj;
        }

        if ("native".equals(obj)) {
            return NATIVE;
        }

        throw new RuntimeException("invalid " + PMemberModifier.class + ": " + obj);
    }

}
