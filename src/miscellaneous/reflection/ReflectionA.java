package miscellaneous.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionA {
    public static void main(String[] args) {
        try {
            A a = new A();
            Class<?> c = a.getClass();
            Constructor<?>[] constructors = c.getConstructors();
            System.out.println(constructors.length);
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }

            Field[] fields = c.getFields();
            System.out.println(fields.length);
            for(Field field:fields){
                System.out.println(field);
            }

            Method[] methods = c.getMethods();
            System.out.println(methods.length);
            for(Method method:methods){
                System.out.println(method);
            }

            methods = c.getDeclaredMethods();
            System.out.println(methods.length);
            for(Method method:methods){
                System.out.println(method);
                System.out.println(Modifier.isPrivate(method.getModifiers()));
                System.out.println(Modifier.isPublic(method.getModifiers()));

            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
