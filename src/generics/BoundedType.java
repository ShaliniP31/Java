package generics;

//we are calculating average of an array of numbers,
// this class will not work for String or other types,
// so a superclass bound is specified.
public class BoundedType<T extends Number> {
    T[] nums;

    BoundedType(T[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            // can use doubleValue as bounded type is Number
            sum += nums[i].doubleValue();//needed as to get double value of number in array
        }
        return sum / nums.length;
    }

    //If we use T, invoking object and comparing object will be of same type i.e. Integer and Integer
    //To use Integer & Double, we need to use Wildcard arguments
    boolean isAvgSame(BoundedType<? extends Number> ob) {
        return this.average() == ob.average();
    }
}
