package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class StudentResultusingNestedIf {
    public static void main(String[] args) {
        StudentResultusingNestedIf sr = new StudentResultusingNestedIf();
        sr.displayPassFailAndDivision();
    }
    private void displayPassFailAndDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the obtained marks of Student");
        int obtainedMarks = scanner.nextInt();
        int passMarks = 40;
        if(obtainedMarks < 0 || obtainedMarks >100){
            System.out.println("Obtained Marked "+ obtainedMarks + " is invalid. It should be in the range of 0 - 100.");
        }else {
            if (obtainedMarks >= passMarks) {
                System.out.println("Passed with Following Division: ");
                if (obtainedMarks >= 75) {
                    System.out.println("Distinction");
                } else if (obtainedMarks < 75 && obtainedMarks >= 60) {
                    System.out.println("First Division");
                } else if (obtainedMarks < 60 && obtainedMarks >= 50) {
                    System.out.println("Second Division");
                } else if (obtainedMarks < 50 && obtainedMarks >= 40) {
                    System.out.println("Third Division");
                }
            } else {
                System.out.println("Failed");
            }
        }
    }
}
