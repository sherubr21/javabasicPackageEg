package com.athang.javatraining.oop;

public class Address {
    public Address() {
    }

    public Address(String village, String gewog, String dzongkhag, String country) {
        this.village = village;
        this.gewog = gewog;
        this.dzongkhag = dzongkhag;
        this.country = country;
    }

    String village;
    String gewog;
    String dzongkhag;
    String country;

    @Override
    public String toString() {
        return "Address{" +
                "village='" + village + '\'' +
                ", gewog='" + gewog + '\'' +
                ", dzongkhag='" + dzongkhag + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
