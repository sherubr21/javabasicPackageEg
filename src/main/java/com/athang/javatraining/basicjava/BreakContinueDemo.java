package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class BreakContinueDemo {
    public static void main(String[] args) {
        BreakContinueDemo bcd = new BreakContinueDemo();
        bcd.execute();
    }

    private void execute() {
        breakContinueDemo();
    }

    private void breakContinueDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the table number:");
        int tableOf = scanner.nextInt();
        for (int i = 1; i <= 29; i++) {
            if (tableOf != 12 && i > 19) {
                break;
            }
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(tableOf + " X " + i + " = " + tableOf * i);
        }
    }
}
