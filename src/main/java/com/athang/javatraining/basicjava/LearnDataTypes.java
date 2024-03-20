package com.athang.javatraining.basicjava;

public class LearnDataTypes {

    public static void main(String[] args) {
        LearnDataTypes dataType = new LearnDataTypes();
        dataType.execute();
    }
    private void execute() {
        System.out.println("I am executing the program...");
        System.out.println("********Automatic Type Casting Example ***************");
        dataTypeCastingAutomatically(45678);
        System.out.println("********Manual Type Casting Example ***************");
        dataTypeCastingManually(874503842323434.0);
    }
    private void dataTypeCastingManually(double passedDoubleValueFromMethodParamater) {
        double doubleValue = passedDoubleValueFromMethodParamater;
        System.out.println("Double: " + doubleValue);
        float floatValue = (float) doubleValue;
        System.out.println("Float: " + floatValue);
        long longValue = (long) floatValue;
        System.out.println("Long: " + longValue);
        int integerValue = (int) longValue;
        System.out.println("Integer: " + integerValue);
    }
    private void dataTypeCastingAutomatically(int passedIntegerValueFromMethodParamater) {
        int integerValue = passedIntegerValueFromMethodParamater;
        System.out.println("Interger: " + integerValue);
        long longValue = integerValue;
        System.out.println("Long: " + longValue);
        float floatValue = longValue;
        System.out.println("Float: " + floatValue);
        double doubleValue = floatValue;
        System.out.println("Double: " + doubleValue);
    }
}
