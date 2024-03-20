package com.athang.javatraining.basicjava;

public class JavaCodeStructure {
    int age;
    String phoneNumber;
    String name;
    String address;
    /**
     * This is default constructor->
     */
    public JavaCodeStructure(int age, String phNumber, String name, String address) {
        this.age = age;
        this.phoneNumber = phNumber;
        this.name = name;
        this.address = address;
    }

    /**
     * Access_Modifier Non_Access_Modifer Return_Type method_name(Parameter...){
     * returning the return_type
     * }
     */

    void displayMergedPersonalInformation() {
        String mergedInfo = "Name: "+ this.name + " Address: "+ this.address +" Phone Number: " + this.phoneNumber + " Age: "+ this.age;
        System.out.println(mergedInfo);
    }


    public static void main(String[] args) {
        JavaCodeStructure personalInformation1 = new JavaCodeStructure(20, "98456847474", "Hari", "Kathmandu");
        JavaCodeStructure personalInformation2 = new JavaCodeStructure(30, "9823798459823", "Ram", "Lalitpur");
        personalInformation1.displayMergedPersonalInformation();
        personalInformation2.displayMergedPersonalInformation();
    }
}
