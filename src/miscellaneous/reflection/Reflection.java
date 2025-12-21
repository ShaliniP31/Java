package miscellaneous.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c = Class.forName("java.awt.Dimension");

        Constructor<?>[] cons = c.getConstructors();
        System.out.println(cons.length);

        Field[] fields = c.getFields();
        System.out.println(fields.length);

        Method[] methods = c.getMethods();
        System.out.println(methods.length);

    }
}
