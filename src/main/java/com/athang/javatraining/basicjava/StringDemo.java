package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
        StringDemo demo = new StringDemo();
        demo.execute();
    }

    private void execute() {
//        stringDemo();
//        playWithString();
//        stringPool();
//        stringBuilderUsBuffer();
//        doneReverse1();
        stringConcatInDifferentWays();
    }

    private void stringConcatInDifferentWays() {
        String name[] = {"Tshering","Dolma", "Tenzing", "Lakpa", "Sunil"};
        String nameWithPlus="";
        String nameWithConcat="";
        String nameWithStringBuilder ="";
        String nameWithStringBuffer="";

        StringBuilder strBuilder = new StringBuilder();
        StringBuffer strBuffer = new StringBuffer();
        for(int i=0; i< name.length;i++){
            nameWithPlus += name[i] + " ";
            nameWithConcat = nameWithConcat.concat(name[i] + " ");
            strBuilder.append(name[i] + " ");
            strBuffer.append(name[i] + " ");
        }
        nameWithStringBuilder = strBuilder.toString();
        nameWithStringBuffer = strBuffer.toString();

        System.out.println("With + Operator: "+ nameWithPlus);
        System.out.println("With Concat Operator: "+ nameWithConcat);
        System.out.println("With StringBuffer Operator: "+ nameWithStringBuffer);
        System.out.println("With StringBuilder Operator: "+ nameWithStringBuilder);
    }

    private void stringDemo() {
        String name = "Tshering";

        String name1 = new String("Dolma");
        name1 = name1.concat(" Sherpa");
        System.out.println(name1.charAt(6));

        System.out.println(name1);
    }

    private void playWithString() {
        String text = "Hello" + " World" + " Good" + " Morning";
        System.out.println(text);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append(" ");
        sb.append("Good");
        sb.append(" ");
        sb.append("Morning");

        System.out.println(sb.toString());

        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append("Hello");
        sbuffer.append(" ");
        sbuffer.append("World");
        sbuffer.append(" ");
        sbuffer.append("Good");
        sbuffer.append(" ");
        sbuffer.append("Morning");

        System.out.println(sbuffer.toString());

    }

    private void stringTools() {
        String myString = "Hello World!!";
        String yourSting = " Good Morning!!";

        System.out.println(myString.concat(yourSting));

        System.out.println(myString);

        myString = myString.concat(yourSting);

        System.out.println(myString);

    }


    private static void doneReverse() {
        String reverse = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name");
        String name = scan.nextLine();
        System.out.println("Introduction:" + name);
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println("Reverse=" + reverse);
    }

    private static void doneReverse1() {
        String reverse = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name");
        String name = scan.nextLine();
        System.out.println("Introduction:" + name);

        char[] inputArray = name.toCharArray();

        //my name is ram = {'m','y'......}
        String reverseString = "";

        for (int i = inputArray.length; i > 0; i--) {
            reverseString = reverseString + inputArray[i - 1];
        }
        System.out.println(reverseString);

    }

    private void stringBuilderUsBuffer() {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Hello");
        for (int i = 0; i < 1000000; i++) {
            sb.append(" World");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Hello");
        for (int i = 0; i < 1000000; i++) {
            sb.append(" World");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }

    private void stringPool() {
        String s = "Hello";
        System.out.println(s.concat(" World"));
        System.out.println(s);
        s = s.concat(" World");
        System.out.println(s);
    }
}
