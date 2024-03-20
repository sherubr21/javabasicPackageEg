package com.rtc.bt.mypratices;

public class Staff {
    public Staff(String name, String address, int joiningYear, int monthlySalary) {
        this.name = name;
        this.address = address;
        this.joiningYear = joiningYear;
        this.monthlySalary = monthlySalary;
    }
   public Staff(){

   }
    String name;
    String address;
    int joiningYear;
    int monthlySalary;



    public int TotaEarn(){

        return (2024-this.joiningYear) * 12 * this.monthlySalary;

    }

}
