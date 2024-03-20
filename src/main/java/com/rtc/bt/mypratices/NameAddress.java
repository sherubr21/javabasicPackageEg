public class NameAddress {
    public static String name="sherub";
    public static String address="thimphu rtc";

    public static void main(String args[]){
        int num1 = 5;
        float num2 = 3.5f;
        double num3 = 7.8;

        // Add numbers
        double sum = num1 + num2 + num3;

        // Convert sum to int, float, and double using type casting
        int intSum = (int) sum;
        float floatSum = (float) sum;
        double doubleSum = sum;

        // Display results
        System.out.println("Sum as int: " + intSum);
        System.out.println("Sum as float: " + floatSum);
        System.out.println("Sum as double: " + doubleSum);

    }
}
