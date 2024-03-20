package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class LearnDecisionStatement {
    public static void main(String[] args) {
        LearnDecisionStatement decisionStatement = new LearnDecisionStatement();
        decisionStatement.execute();
    }

    private void execute() {
        learnIfEsle();
        learnSwitch();
    }


    //Ask the user to input the number ranging 1-7 and display its corresponding name as day of a week
    private void learnSwitch() {
    }

    private void learnIfEsle() {
        //Ask the user to input the number ranging 1-7 and display its corresponding name as day of a week
        Scanner scanner = new Scanner(System.in);
        int dayInNumber = scanner.nextInt();
        if(dayInNumber == 1){
            System.out.println("The day is SUNDAY.");
        }else if(dayInNumber ==2){
            System.out.println("The day is MONDAY.");
        }else if(dayInNumber ==3){
            System.out.println("The day is TUESDAY.");
        }else if(dayInNumber ==4){
            System.out.println("The day is WEDNESDAY.");
        }else if(dayInNumber ==5){
            System.out.println("The day is THRUSDAY.");
        }else if(dayInNumber ==6){
            System.out.println("The day is FRIDAY.");
        }else if(dayInNumber ==7){
            System.out.println("The day is SATURDAY.");
        }else{
            System.out.println("This is invalid input.");
        }
    }
}
