package com.rtc.bt.mypratices;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("pema lhamo", 25);

        // Access encapsulated data using getter methods
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // Modify encapsulated data using setter methods
        person1.setName("rangdrel");
        person1.setAge(35);

        // Display modified data
        System.out.println("Modified Name: " + person1.getName());
        System.out.println("Modified Age: " + person1.getAge());
    }
}
