package bm.util;

import java.util.ArrayList;
import java.util.HashSet;

public class ClassFinder {

    private final ClassLoader loader;
    private final HashSet<String> packages;

    public ClassFinder() {
        this(ClassLoader.getSystemClassLoader());
    }

    public ClassFinder(ClassLoader loader) {
        this.loader = loader;
        this.packages = new HashSet<>();
    }

    public boolean addPackageOf(Class<?> type) {
        return addPackage(type.getPackage().getName());
    }

    public boolean addPackage(String packageName) {
        return packages.add(packageName);
    }

    public Class<?> findClass(String name) {
        for (String packageName : packages) {
            String className = packageName + "." + name;
            Class<?> loadedClass = tryGetClass(className);

            if (loadedClass != null) {
                return loadedClass;
            }
        }

        throw new RuntimeException("class not found: " + name);
    }

    private Class<?> tryGetClass(String className) {
        try {
            return loader.loadClass(className);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

}
