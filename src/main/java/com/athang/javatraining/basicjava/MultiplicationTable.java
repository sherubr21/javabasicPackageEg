package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable mTable = new MultiplicationTable();
        mTable.execute();
    }
    private void execute() {
        generateTableUsingWhileLoop();
        generateTableUsingDoWhileLoop();
        generateTableUsingForLoop();
    }
    private void generateTableUsingDoWhileLoop() {
        int number = getInput("Do While Loop");
        System.out.println("Printing the table of " + number + " using Do While Loop");
        int i = 1;
        do {
            System.out.println(number + " X " + i + " = " + (number * i));
            i++;
        } while (i <= 10);
    }

    private void generateTableUsingForLoop() {
        int number = getInput("For Loop");
        System.out.println("Printing the table of " + number + " using While Loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }

    private void generateTableUsingWhileLoop() {
        int number = getInput("While Loop");
        System.out.println("Printing the table of " + number + " using While Loop");
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " X " + i + " = " + (number * i));
            i++;
        }
    }
    private int getInput(String loopType){
        Scanner scanner = new Scanner(System.in);
        System.out.print("["+ loopType + "]Enter the number:");
        return scanner.nextInt();
    }
}
