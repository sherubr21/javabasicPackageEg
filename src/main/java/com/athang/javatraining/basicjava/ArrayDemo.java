package com.athang.javatraining.basicjava;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayDemo aDemo = new ArrayDemo();
        aDemo.execute();
    }
    private void execute() {
        //printTableOfNineWithUpdating();
        //reverseArray();
        stringLength();
    }

    private void stringLength() {
        String name = "Tshering";
        System.out.println(name.length());
    }

    private void printTableOfNineWithUpdating() {
        int tableOfNine[] = getTableOfNine();
        updateEvenNumbers(tableOfNine);
        displayTableOfNine(tableOfNine);
    }
    private void displayTableOfNine(int[] tableOfNine) {
        for (int i = 0; i < 10; i++) {
            System.out.println(tableOfNine[i]);
        }
    }
    private void updateEvenNumbers(int[] tableOfNine) {
        for (int i = 0; i < 10; i++) {
            if (tableOfNine[i] % 2 == 0) {
                tableOfNine[i] += 10; // tableOfNine[i] = tableOfNine[i]+i;
            }
        }
    }
    private int[] getTableOfNine() {
        int tableOfNine[] = new int[10];
        for (int i = 0; i < 10; i++) {
            tableOfNine[i] = 9 * (i + 1);
        }
        return tableOfNine;
    }
    private void reverseArray() {
        int a[] = {3, 4, 5, 6, 7, 8};
        System.out.println(a.length);
        int b[] = new int[6];
        for (int i = 5; i >= 0; i--) {
            b[i] = a[5 - i];
        }
        System.out.print("{");
        for (int i = 0; i < 6; i++) {
            System.out.print(b[i] + ((i == 5) ? "" : ","));
        }
        System.out.print("}");
    }
}
