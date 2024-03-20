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
        Employee employee1 = new Employee("Charlie", 35, "Software Engineer", 50000);

        // Accessing methods from the Person class and Employee subclass
        System.out.println("Name: " + employee1.getName());
        System.out.println("Age: " + employee1.getAge());
        System.out.println("Job Title: " + employee1.getJobTitle());
        System.out.println("Salary: $" + employee1.getSalary());

        // Modifying data using setter methods
        employee1.setJobTitle("Senior Software Engineer");
        employee1.setSalary(60000);

        // Accessing modified data
        System.out.println("Updated Job Title: " + employee1.getJobTitle());
        System.out.println("Updated Salary: $" + employee1.getSalary());
    }
}
