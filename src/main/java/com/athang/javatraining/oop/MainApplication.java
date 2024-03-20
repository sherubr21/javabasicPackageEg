package com.athang.javatraining.oop;

public class MainApplication {
    public static void main(String[] args) {
        MainApplication mainApp = new MainApplication();
        mainApp.objectConstructionWithEmptyConstructor();
        mainApp.objectConstructionWithParametrizedConstructor();
    }

    private void objectConstructionWithParametrizedConstructor() {
        System.out.println("Object with Parametrized Constructor...");
        Address homeAddress = new Address("wamrong","lumang","trashigang","Bhutan");
        Address schoolAddress = new Address("gelephu","uuu","paro","Bhutan");
        Student sonam = new Student("pema lhamo","XII","Paro School",2001, homeAddress, schoolAddress);
       /* System.out.println(sonam.name);
        System.out.println(sonam.grade);
        System.out.println(sonam.schoolName);
        System.out.println(sonam.dobYear);
        System.out.println(sonam.homeAddress.village);
        System.out.println(sonam.homeAddress.gewog);
        System.out.println(sonam.homeAddress.dzongkhag);
        System.out.println(sonam.homeAddress.country);*/

       /* Address schoolAddressReceived = sonam.schoolAddress;
        System.out.println(schoolAddressReceived.village);
        System.out.println(schoolAddressReceived.gewog);
        System.out.println(schoolAddressReceived.dzongkhag);
        System.out.println(schoolAddressReceived.country);
*/
        System.out.println(sonam);
        System.out.println("Feature of Student Class, i.e. Age of Sonam: " + sonam.getAge());
    }

    private void objectConstructionWithEmptyConstructor() {
        System.out.println("Object with Empty Constructor...");
        Student sonam = new Student();
        sonam.name = "Sonam XYZ";
        sonam.grade = "XII";
        sonam.schoolName = "Thimpu School";
        sonam.dobYear = 1997;

        Address homeAddress = new Address();
        homeAddress.village="Babena";
        homeAddress.gewog="Chang";
        homeAddress.dzongkhag="Thimpu";
        homeAddress.country="Bhutan";
        sonam.homeAddress = homeAddress;

        Address schoolAddress = new Address();
        schoolAddress.village="Babena1";
        schoolAddress.gewog="Chang1";
        schoolAddress.dzongkhag="Thimpu";
        schoolAddress.country="Bhutan";
        sonam.schoolAddress = schoolAddress;

//        System.out.println(sonam.name);
//        System.out.println(sonam.grade);
//        System.out.println(sonam.schoolName);
//        System.out.println(sonam.dobYear);
//        System.out.println(sonam.homeAddress.village);
//        System.out.println(sonam.homeAddress.gewog);
//        System.out.println(sonam.homeAddress.dzongkhag);
//        System.out.println(sonam.homeAddress.country);
//
//        Address schoolAddressReceived = sonam.schoolAddress;
//        System.out.println(schoolAddressReceived.village);
//        System.out.println(schoolAddressReceived.gewog);
//        System.out.println(schoolAddressReceived.dzongkhag);
//        System.out.println(schoolAddressReceived.country);
        System.out.println(sonam);
        System.out.println("Feature of Student Class, i.e. Age of Sonam: " + sonam.getAge());


    }
}
