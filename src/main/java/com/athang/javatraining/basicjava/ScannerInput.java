package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
    }
}
