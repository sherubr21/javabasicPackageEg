package com.athang.javatraining.basicjava;

public class IncrementDecrement {

    public static void main(String[] args) {
        IncrementDecrement id = new IncrementDecrement();
        id.execute();
    }

    private void execute(){
        int a = 10;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);
        System.out.println(--a);
        System.out.println(a);
    }
}
