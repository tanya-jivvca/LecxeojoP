package org.ledrub.lecxeojop.reflection;

public class ReflectionHelper {

    public static <T> T newInstance(Class<T> type) {
        try {
            return type.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new ReflectionException("Failed to create new instance of class " + type.getSimpleName(), e);
        }
    }
}
