package com.rtc.bt.mypratices;


public class Base {

    public static void main(String[] args) {
       /* Staff tshering = new Staff("Tshering", "Thimpu", 2017, 20000);
        Staff tashi = new Staff("Tashhi", "Bhutan", 2019, 30000);
        Staff sunil = new Staff("Sunil", "Kathmandu", 2020, 25000);
        System.out.println("Name" + "  " + "Year of Joining" + "  " + "Address  " + "  Monthly Salary" + " " + "Total Earned");
        System.out.println(tshering.name + "     " + tshering.joiningYear + "     " + tshering.address + "     " + tshering.monthlySalary + "    " + tshering.TotaEarn());
        System.out.println(tashi.name + "     " + tashi.joiningYear + "     " + tashi.address + "     " + tashi.monthlySalary + "    " + tashi.TotaEarn());
        System.out.println(sunil.name + "     " + sunil.joiningYear + "     " + sunil.address + "     " + sunil.monthlySalary + "    " + sunil.TotaEarn());
       */
       Base obj=new Base();
       obj.createEmployeeWithEmptyConstructor();
        //obj.createAndPrintEmployeeUsingMethod();
    }

    private void createAndPrintEmployeeUsingMethod() {
        Staff tshering = getEmployee("Tshering", "Thimpu", 2017, 20000);
        Staff tashi = getEmployee("Tashhi", "Bhutan", 2019, 30000);
        Staff sunil = getEmployee("Sunil", "Kathmandu", 2020, 25000);
        System.out.println("Name" + "  " + "Year of Joining" + "  " + "Address  " + "  Monthly Salary" + " " + "Total Earned");
        System.out.println(tshering.name + "     " + tshering.joiningYear + "     " + tshering.address + "     " + tshering.monthlySalary + "    " + tshering.TotaEarn());
        System.out.println(tashi.name + "     " + tashi.joiningYear + "     " + tashi.address + "     " + tashi.monthlySalary + "    " + tashi.TotaEarn());
        System.out.println(sunil.name + "     " + sunil.joiningYear + "     " + sunil.address + "     " + sunil.monthlySalary + "    " + sunil.TotaEarn());
    }
    private Staff getEmployee(String name, String address, int joiningYear, int monthlySalary) {
        return new Staff(name, address, joiningYear, monthlySalary);
    }
    private void createEmployeeWithEmptyConstructor() {
        Staff tshering = getEmployeeWithEmptyConstructor("Tshering", "Thimpu", 2017, 20000);
        Staff tashi = getEmployeeWithEmptyConstructor("Tashhi", "Bhutan", 2019, 30000);
        Staff sunil = getEmployeeWithEmptyConstructor("Sunil", "Kathmandu", 2020, 25000);
        System.out.println("Name" + "  " + "Year of Joining" + "  " + "Address  " + "  Monthly Salary" + " " + "Total Earned");
        System.out.println(tshering.name + "     " + tshering.joiningYear + "     " + tshering.address + "     " + tshering.monthlySalary + "    " + tshering.TotaEarn());
        System.out.println(tashi.name + "     " + tashi.joiningYear + "     " + tashi.address + "     " + tashi.monthlySalary + "    " + tashi.TotaEarn());
        System.out.println(sunil.name + "     " + sunil.joiningYear + "     " + sunil.address + "     " + sunil.monthlySalary + "    " + sunil.TotaEarn());
    }

    private Staff getEmployeeWithEmptyConstructor(String name, String address, int joiningYear, int monthlySalary) {
        Staff employee = new Staff();
        employee.name = name;
        employee.address = address;
        employee.monthlySalary = monthlySalary;
        employee.joiningYear = joiningYear;
        return employee;
    }
}
