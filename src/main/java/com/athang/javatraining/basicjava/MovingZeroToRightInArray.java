package com.athang.javatraining.basicjava;

public class MovingZeroToRightInArray {
    public static void main(String[] args) {
        MovingZeroToRightInArray mztria = new MovingZeroToRightInArray();
        mztria.execute();
    }

    private void execute() {
        int array[] = {0, 3, 4, 0, 1, 2, 5, 0};
        boolean shouldProceed = true;
        while(shouldProceed) {
            shouldProceed = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == 0 && array[i + 1] != 0) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    shouldProceed = true;
                }
            }
        }
        System.out.print("[");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + ((i==array.length-1)?"":", "));
        }
        System.out.println("]");
    }

}
