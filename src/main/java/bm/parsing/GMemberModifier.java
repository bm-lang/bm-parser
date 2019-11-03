package bm.parsing;

public enum GMemberModifier {

    NATIVE;

    public static GMemberModifier convert(Object obj) {
        if (obj instanceof GMemberModifier) {
            return (GMemberModifier)obj;
        }

        if ("native".equals(obj)) {
            return NATIVE;
        }

        throw new RuntimeException("invalid " + GMemberModifier.class + ": " + obj);
    }

}
