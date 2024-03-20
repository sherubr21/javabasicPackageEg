package com.athang.javatraining.basicjava;

public class DivisionUsingLoop {
    public static void main(String[] args) {
        DivisionUsingLoop dul = new DivisionUsingLoop();
        dul.execute();
    }
    private void execute() {
        divideByThree();
        System.out.println(" ");
        System.out.println(" ");
        divideByFive();
        System.out.println(" ");
        System.out.println(" ");
        divideByThreeAndFive();
    }
    private void divideByThreeAndFive() {
        System.out.println("Divided By 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
    private void divideByFive() {
        System.out.println("Divided By 5:");
        int counter=1;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(((counter++==1)?"":", ") + i);
            }
        }
    }
    private void divideByThree() {
        System.out.println("Divided By 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
