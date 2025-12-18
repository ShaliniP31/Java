package annotations;

import java.lang.reflect.Method;

public class AnnoMain {

    @NewAnno(val = "Demo", num = 10)
    public static void meth() {
        AnnoMain main = new AnnoMain();
        try {
            Class<?> ob = main.getClass();
            Method m = ob.getMethod("meth");
            NewAnno anno = m.getAnnotation(NewAnno.class);
            System.out.println(anno.val() + " " + anno.num());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        meth();
    }
}
