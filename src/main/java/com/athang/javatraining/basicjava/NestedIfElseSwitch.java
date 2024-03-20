package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class NestedIfElseSwitch {

    public static void main(String[] args) {
        NestedIfElseSwitch nestedIfElseSwitch = new NestedIfElseSwitch();
        nestedIfElseSwitch.execute();
    }

    private void execute(){
        nestedIfElse();
    }

    private void nestedIfElse(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String country = scanner.next();
        if(name.equals("john")){
            System.out.println("He is probably from US or AUS or UK");
            if(country.equals("US")){
                System.out.println("He is American");

            }else{
                System.out.println("He is not American");
            }
        }
    }
}
