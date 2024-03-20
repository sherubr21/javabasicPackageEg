package com.rtc.bt.polymorphism;

public class Employee extends Person{
    // Additional variables specific to Employee
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, int age, String jobTitle, double salary) {
        super(name, age); // Call to superclass constructor
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter and Setter methods for job title and salary...

    // Method to display information, overridden from the superclass
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to superclass method
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }
}
