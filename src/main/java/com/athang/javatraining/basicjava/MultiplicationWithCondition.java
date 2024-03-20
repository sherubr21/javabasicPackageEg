package com.athang.javatraining.basicjava;// Condition 1: Display M.T upto 20 and only of even number
// Condition 2: if the input number is 12 print M.T up to only 10
// Condition 3: Use only one for loop to solve it using break & continue

import java.util.Scanner;

public class MultiplicationWithCondition {
    public static void main(String[] args) {
        MultiplicationWithCondition mm = new MultiplicationWithCondition();
        mm.displayMultiplaction();
    }

    private void displayMultiplaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = scanner.nextInt();
        for(int i=1; i<=20;i++){
            if(i%2!=0){
                continue;
            }
            if(number==12 && i>10){
                break;
            }
            System.out.println(number + " X "+ i +" = "+ number*i);
        }
    }
}
