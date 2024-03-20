package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class ElseIfSwitch {
    public static void main(String[] args) {
        ElseIfSwitch elseIf = new ElseIfSwitch();
        elseIf.execute();
    }

    private void execute() {
        // ask the user to  input to choose switch or if else
        //elseIfDemo();
        switchDemo();
        switchDemo1();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 to continue and other character to quit the program!!");
        int shouldContinue = scanner.nextInt();
        if (shouldContinue == 1) {
            execute();
        }
        System.out.println("Bye Bye!!");
    }

    private void switchDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day in Number: ");
        int dayInput = scanner.nextInt();
        switch (dayInput) {
            case 1:
                System.out.println("The day is SUNDAY");
                break;
            case 2:
                System.out.println("The day is MONDAY");
                break;
            case 3:
                System.out.println("The day is TUESDAY");
                break;
            case 4:
                System.out.println("The day is WEDNESDAY");
                break;
            case 5:
                System.out.println("The day is THRUSDAY");
                break;
            case 6:
                System.out.println("The day is FRIDAY");
                break;
            case 7:
                System.out.println("The day is SATURDAY");
                break;
            default:
                System.out.println("Invalid Input");
        }
        System.out.println("Switch completed!!");
    }

    private void switchDemo1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the starting letter of a day of week. For e.g: S for SUNDAY");
        String startingLetterofWeekDay = scanner.next();
        String startingLetterofWeekDayinLowerCase = startingLetterofWeekDay.toLowerCase();


        switch (startingLetterofWeekDayinLowerCase) {
            case "s":
                System.out.println("The day can be Sunday and Saturday");
                System.out.println("The days are 1st and 7th");
                break;
            case "m":
                System.out.println("The day is Monday");
                System.out.println("The day is 2nd");
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    private void elseIfDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day in Number: ");
        int dayInput = scanner.nextInt();

        if (dayInput == 1) {
            System.out.println("The day is SUNDAY");
        } else if (dayInput == 2) {
            System.out.println("The day is MONDAY");
        } else if (dayInput == 3) {
            System.out.println("The day is TUESDAY");
        } else if (dayInput == 4) {
            System.out.println("The day is WEDNESDAY");
        } else if (dayInput == 5) {
            System.out.println("The day is THRUSDAY");
        } else if (dayInput == 6) {
            System.out.println("The day is FRIDAY");
        } else if (dayInput == 7) {
            System.out.println("The day is SATURDAY");
        } else {
            System.out.println("Invalid Input.");
        }
    }
}
