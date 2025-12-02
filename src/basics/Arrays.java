package basics;

public class Arrays {
    public static void main(String[] args) {
        int[] month_days;
        month_days = new int[6];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;

        System.out.println("April has " + month_days[3] + " days.");

        int[] month_days2 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("April has " + month_days2[3] + " days.");

        //Calculate average of values
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double sum = 0, result = 0;

        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
        }
        result = sum/nums.length;
        System.out.println("Average value is " + result);

        sum = 0;
        for(double x: nums){
            sum+=x;
        }
        result = sum/nums.length;
        System.out.println("Average value is " + result);


    }
}
