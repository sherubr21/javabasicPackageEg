package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class LearnOperators {
    public static void main(String[] args) {
        LearnOperators operators = new LearnOperators();
        operators.execute();

    }
    private void execute() {
        System.out.println("ARETHMETIC OPERATORS DEMO");
        learnArithmeticOperators();
        System.out.println("RELATIONAL OPERATORS DEMO");
        learnRelationalOperators();
        System.out.println("LOGICAL OPERATORS DEMO");
        learnLogicalOperators();
        System.out.println("ASSIGNMENT OPERATORS DEMO");
        learnAssignmentOperators();
        System.out.println("CONDITIONAL OPERATORS DEMO");
        learnConditionalOperators();
        exitProgramNormally();
    }

    private void exitProgramNormally() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 1 to CONTINUE and 0 to EXIT: ");

        int shouldExit = 0;
        try {
            shouldExit = scanner.nextInt();
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Non-numeric numbers are not supported. Please Enter numbers.");
            exitProgramNormally();
        }
        if (shouldExit == 1 || shouldExit == 0) {
            if (shouldExit == 1) {
                execute();
            }
            if (shouldExit == 0) {
                System.out.println("Exiting the Program!!..");
            }
        } else {
            System.out.println("Invalid Input.");
            exitProgramNormally();
        }
    }

    private void learnConditionalOperators() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter age: ");
        int age = scanner.nextInt();
        String generation;

        if (age <= 13) {
            generation = "Child";
        } else {
            generation = "Non-Child";
        }

        String generationWithConditionalOperatior = (age <= 13) ? "Child" : "Non-Child";
        System.out.println("The enter aged person is: " + generation);
        System.out.println("The enter aged person is: " + generationWithConditionalOperatior);
    }

    private void learnAssignmentOperators() {

        // =, +=, -=, *=, /=, %=

        int i = 10;

        i += 20; //// i = i + 20;
        i -= 10; // i = i - 10;
        i *= 5; //i = i * 5;
        i /= 5; // i = i/5;
        System.out.println(i);
        i %= 3; // i = i%3;
        System.out.println(i);

    }

    private void learnLogicalOperators() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter name: ");
        String name = scanner.next();
        System.out.print("Please enter country: ");
        String country = scanner.next();

        if (name.equals("John") && country.equals("USA")) {
            System.out.println(name + " is an native american.");
        }

        if (name.equals("John") || country.equals("USA")) {
            System.out.println(name + " looks like he is an american.");
        }
        boolean isOk = false;
        if (!name.equals("John") && !isOk) {
            System.out.println(name + " looks like he is not an american.");
        }
    }

    private void learnRelationalOperators() {
        // ==, !=, >, <, >=, <=
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age of a person: ");
        int age = scanner.nextInt();
        if (age <= 10) {
            System.out.println("The person is a kid.");
        }
        if (age == 14) {
            System.out.println("The person is teen");
        }
        if (age >= 14) {
            System.out.println("The person is Young");
        }
        if (age != 20) {
            System.out.println("The person age is not 20 years.");
        }

    }

    private void learnArithmeticOperators() {
        // +, -,*, /, %(Modulus), ++(Increment), --(Decrement)
        int firstNumber = 100;
        int secondNumber = 13;
        int thirdNumber = 56;

        int sum = firstNumber + secondNumber + thirdNumber;
        int difference = firstNumber - secondNumber - thirdNumber;
        int product = firstNumber * secondNumber * thirdNumber;
        int quotent = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println("Sum: " + sum);
        System.out.println("Diff: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + quotent);
        System.out.println("Remainder: " + remainder);


        System.out.println("************Increment/Decrement Operators***************");
        System.out.println("The value of FirstNumber before postfix increment: " + firstNumber);
        System.out.println("THE VALUE OF FIRST NUMBER AT THE TIME OF POSTFIX INCREMENT: " + firstNumber++);
        System.out.println("The value of FirstNumber after postfix increment: " + firstNumber);

        System.out.println("The value of FirstNumber before prefix increment: " + firstNumber);
        System.out.println("THE VALUE OF FIRST NUMBER AT THE TIME OF PREFIX INCREMENT: " + ++firstNumber);
        System.out.println("The value of FirstNumber after prefix increment: " + firstNumber);

        System.out.println("The value of FirstNumber before postfix decrement: " + firstNumber);
        firstNumber--;
        System.out.println("The value of FirstNumber after postfix decrement: " + firstNumber);

        System.out.println("The value of FirstNumber before prefix decrement: " + firstNumber);
        --firstNumber;
        System.out.println("The value of FirstNumber after prefix decrement: " + firstNumber);


    }
}
