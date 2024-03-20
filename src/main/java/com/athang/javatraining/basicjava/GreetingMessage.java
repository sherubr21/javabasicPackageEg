package com.athang.javatraining.basicjava;

public class GreetingMessage {
    private String name;

    public static void main(String[] args) {
        GreetingMessage greetingMessage = new GreetingMessage();
        greetingMessage.execute();

    }

    private void setName(String name){
        this.name = name;
    }

    private  void execute() {
        int a = 10;

    }

    private void displayStartGreeting() {
        System.out.println("Hello GoodMorning!!");
        displayWeatherMessage();
    }

    private void displayWeatherMessage() {
        System.out.println("Today its cold!!");
    }

    private void displayIntroduction() {
        System.out.println("This is me, "+ this.name);
    }

    private void displayEndGreeting() {
        System.out.println("Have a Good Day, Bye Bye!!");
    }
}
