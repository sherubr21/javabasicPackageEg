package com.rtc.bt.mypratices;

public class Employee extends Person{
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, int age, String jobTitle, double salary) {
        super(name, age); // Call to superclass constructor
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter for job title
    public String getJobTitle() {
        return jobTitle;
    }

    // Setter for job title
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
