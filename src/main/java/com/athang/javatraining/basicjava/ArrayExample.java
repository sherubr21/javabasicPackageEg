package com.athang.javatraining.basicjava;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample ae= new ArrayExample();
        ae.initializePrintArray();
    }

    private void initializePrintArray() {
        int arr[] = new int[10];
        int startingNumber = 5;
        int increment = 5;
        for(int i=0; i< arr.length; i++){
            if(i==0){
                arr[i] = startingNumber;
            }else{
                arr[i] = startingNumber + increment;
            }
            startingNumber = arr[i];
        }

        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
