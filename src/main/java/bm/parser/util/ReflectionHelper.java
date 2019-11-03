package bm.parser.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionHelper {

    public static <T> T newInstance(Class<T> type) {
        Constructor<T> ctr = getDefaultConstructor(type);

        try {
            return ctr.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            // TODO: improve error handling
            throw new RuntimeException("couldn't create an item of " + type, e);
        }
    }

    public static <T> Constructor<T> getDefaultConstructor(Class<T> type) {
        try {
            return type.getConstructor();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("the " + type + " must have an empty constructor", e);
        }
    }
}
