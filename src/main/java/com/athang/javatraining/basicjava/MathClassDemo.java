package com.athang.javatraining.basicjava;

public class MathClassDemo {

    public static void main(String[] args) {
        MathClassDemo mathClass = new MathClassDemo();
        mathClass.execute();
    }

    private void execute() {
        int a = 9;
        int b = 4;

        // a^b, squareroot, trigonometry (sin, cos, tan)
        System.out.println((int)Math.pow(10, 4));
        System.out.println(Math.max(a, b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.log(a));
        System.out.println(Math.sin(a));
    }
}
