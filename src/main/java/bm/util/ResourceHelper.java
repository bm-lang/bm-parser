package bm.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ResourceHelper {

    public static String getString(String name, Class<?> slibing) {
        byte[] data = getData(name, slibing);

        return new String(data);
    }

    public static byte[] getData(String name, Class<?> slibing) {
        InputStream input = slibing.getResourceAsStream(name);

        if (input == null) {
            throw new RuntimeException("not found: " + name);
        }

        try {
            try {
                ByteArrayOutputStream result = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len;

                while ((len = input.read(buffer)) != -1) {
                    result.write(buffer, 0, len);
                }

                return result.toByteArray();
            } finally {
                input.close();
            }
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

}
