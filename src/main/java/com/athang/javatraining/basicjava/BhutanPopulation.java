package com.athang.javatraining.basicjava;

public class BhutanPopulation {
    public static void main(String[] args) {
        BhutanPopulation bhutanPoplulation = new BhutanPopulation();
        bhutanPoplulation.execute();
    }

    private void execute(){
        int malePopn = 400000;
        int femalePopn = 400000;
        System.out.println("Total Population of Bhutan is "+ (malePopn + femalePopn));
    }
}
