package com.athang.javatraining.basicjava;

public class ArraysDemo{
    public static void main(String[] args) {
        ArraysDemo arrayDemo = new ArraysDemo();
        arrayDemo.execute();
    }

    private void execute() {
//        String name = "Ram";
//        String[] names = {"Ram", "Hari", "Hang"};
//
//        printName(name, names);
       // mathClassDemo();
        stringDemo();
    }

    private void stringDemo() {
        String firstName = "Ram";
        String secondName = "Thapa";

        String fullNameWithPlusSign = firstName + " "+ secondName;
        String fullNameWithConcat = firstName.concat(" ").concat(secondName);

        System.out.println(fullNameWithConcat + " -------- " + fullNameWithPlusSign);



    }

    private void mathClassDemo() {
        int a = 99;
        int b = 199;

        System.out.println("Product of a & b :" + Math.multiplyFull(a,b));
        //int sqrt = (int)Math.sqrt(99);
        System.out.println("Sqrt of a:" + (int)Math.sqrt(99));

    }

    private void printName(String n, String[] nameArray) {
        System.out.println(n);
        System.out.println(nameArray[0] + " : " + nameArray[1] + " : " + nameArray[2]);
        String nameFromArray = "";
        for (int i = 0; i < nameArray.length; i++) {
//            String appender = "";
////            if (i == nameArray.length - 1) {
////                appender = "";
////            } else {
////                appender = " : ";
////            }
//            if (i != nameArray.length - 1) {
//                appender = " : ";
//            }
            nameFromArray += nameArray[i] + ((i != nameArray.length - 1)?" : ":"");
        }
        System.out.println(nameFromArray);
    }

    private void execute1() {
        //Scanner scanner = new Scanner(System.in);
        int arr[][] = {{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}, {3, 4, 5, 6, 7}, {0, 1, 4, 5, 3}, {8, 9, 5, 4, 1}};

//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//
//        arr= new int[x][y];
        System.out.println(arr[0].length);

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("a[" + i + "][" + j + "] : " + arr[i][j]);
            }

        }
    }
}
