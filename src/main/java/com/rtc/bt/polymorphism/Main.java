package com.rtc.bt.polymorphism;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Employee employee1 = new Employee("Bob", 25, "Software Engineer", 50000);

        // Polymorphic behavior
        displayPersonInfo(person1); // Displaying information of a Person
        System.out.println("-------------------");
        displayPersonInfo(employee1); // Displaying information of an Employee
    }

    // Polymorphic method
    public static void displayPersonInfo(Person person) {
        person.displayInfo(); // Polymorphic call to displayInfo() method
    }
}
