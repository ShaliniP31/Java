package annotations;

import java.lang.reflect.Method;

public class MarkerMain {

    @MarkerAnno
    public static void meth() {
        MarkerMain mm = new MarkerMain();
        try {
            Class<?> ob = mm.getClass();
            Method m = ob.getMethod("meth");

            if(m.isAnnotationPresent(MarkerAnno.class)){
                System.out.println("Annotation exists");
            } else {
                System.out.println("No annotation present");
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        meth();
    }
}
