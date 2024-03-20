package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class Loops {

    public String name = "Sanjay";

    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.execute();
    }

    private void execute() {
        infinteLoopUsingWhile();
        //whileLoopDoWhileLoopDemo();
        //whileLoopDemo();
        // multiplicationTableUsingWhileLoop();
        //doWhileLoopDemo();
        //forLoopDemo();
        //recursionPrint(1);
    }

    private void whileLoopDoWhileLoopDemo() {
        int i = 10;
        System.out.println("While Loop!!");
        while (i++ < 10) {
            System.out.println("Hello World, i: " + i);
        }
        System.out.println("DO While Loop!!");
        do {
            System.out.println("Hello World, i: " + i);
        } while (i++ < 10);
        System.out.println("Terminating the program!!");
    }

    private void recursionPrint(int value) {
        System.out.println(value++);
        if (value <= 100) {
            recursionPrint(value);
        }
        System.out.println("Finished Printing all from 1-100." + value);
    }

    private void forLoopDemo() {
        //for(initial condition; final condition; increment/decrement){
        // your logic
        //}

        for(int i = 1; i<=100; i++){
            System.out.println(i);
        }

        for (int i = 0; i < 50; i++) {
            System.out.println("5 * " + (i + 1) + " = " + (5 * (i + 1)));
        }

    }

    private void doWhileLoopDemo() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please Enter 0 to terminate!!");
            // your logic
            System.out.print("Enter i: ");
            i = scanner.nextInt();
        } while (i != 0);
        System.out.println("Terminating the program!!");
    }

    private void multiplicationTableUsingWhileLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of which you want to generate the table: ");
        int tableOf = scanner.nextInt();
        int counter = 0;

        while (counter < 10) {
            System.out.println(tableOf + " * " + ++counter + " = " + (tableOf * counter));
            //counter++;
        }

    }

    private void whileLoopDemo() {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        while (i != 0) {

            System.out.println("Please Enter 0 to terminate!!");
            // your logic
            System.out.print("Enter i: ");
            i = scanner.nextInt();
        }
        System.out.println("Terminating the program!!");
    }

    private void infinteLoopUsingWhile() {
        int i = 0;
        while (i < 10) {
            System.out.println("Hello World!! Good Morning!!");
        }


        // Other part of code --->
    }
}
