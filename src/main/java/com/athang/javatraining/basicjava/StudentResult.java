package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        StudentResult sr = new StudentResult();
      //  sr.passOrFail();
        sr.displayDivision();
    }
    private void displayDivision(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the obtained marks of Student");
        int obtainedMarks = scanner.nextInt();
        int passMarks = 40;
        if(obtainedMarks>=75){
            System.out.println("Distinction");
        } else if (obtainedMarks<75 && obtainedMarks>=60) {
            System.out.println("First Division");
        }else if (obtainedMarks<60 && obtainedMarks>=50) {
            System.out.println("Second Division");
        }else if (obtainedMarks<50 && obtainedMarks>=40) {
            System.out.println("Third Division");
        }else{
            System.out.println("Failed");
        }
    }

    private  void passOrFail(){
        int passMarks = 40;
        int obtainedMarks = 60;

        if(obtainedMarks>=passMarks){
            System.out.println("Student have Passed the Exam.");
        }else{
            System.out.println("Student got Failed");
        }
    }
}
