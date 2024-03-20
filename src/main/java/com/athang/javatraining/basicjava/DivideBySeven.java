package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class DivideBySeven {

    public static void main(String[] args) {
        DivideBySeven dbs = new DivideBySeven();
        dbs.execute();
    }

    private void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = scanner.nextInt();
        String result = (number%7==0)?"The number is exactly divisible by Seven":
                "The number is not exactly divisible by Seven";
        System.out.println(result);
    }
}
