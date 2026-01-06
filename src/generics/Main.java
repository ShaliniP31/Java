package generics;

public class Main {
    public static void main(String[] args) {
        SimpleExample<Integer> ob1 = new SimpleExample<>(88);
        ob1.showType();

        SimpleExample<String> ob2 = new SimpleExample<>("Hello");
        ob2.showType();

//        SimpleExample<int> ob3; Not possible

        //Issues with using Non-Generics class i.e,
        // using Object class to store Datatype

        NonGeneric nob1 = new NonGeneric(88);
        NonGeneric nob2 = new NonGeneric("Hello");

        int i = (int) nob1.getOb(); //Need to explicitly cast
        nob1.showType();

        String s = (String) nob2.getOb(); //Need to explicitly cast
        nob2.showType();

        nob1 = nob2; //Even though different datatypes, will not throw
        //error as there is no type safety

        //Two Parameter generic class
        TwoGen<Integer, String> tg = new TwoGen<>(88, "Hello");

        Integer[] nums1 = {1, 2, 3};
        BoundedType<Integer> ibt = new BoundedType<>(nums1);
        System.out.println(ibt.average());

        Double[] nums2 = {1.9, 2.3, 3.3};
        BoundedType<Double> dbt = new BoundedType<>(nums2);
        System.out.println(dbt.average());

//        BoundedType<String> cannot be created as String is not allowed

        System.out.println(ibt.isAvgSame(dbt));

        SimpleExample se = new SimpleExample(100);
    }
}
