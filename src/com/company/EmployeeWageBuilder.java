package com.company;

public class EmployeeWageBuilder {

    public static void main(String[] args) {
        EmployeeWageCalculation empWageBuilder=new EmployeeWageCalculation();
        empWageBuilder.addCompanyEmpWage("SBI",50,4,100);
        empWageBuilder.addCompanyEmpWage("TCS",20,4,100);
        empWageBuilder.addCompanyEmpWage("BridgeLabz",60,6,100);
        empWageBuilder.addCompanyEmpWage("ICIC",100,8,100);
        empWageBuilder.addCompanyEmpWage("IBM",60,4,100);
        empWageBuilder.computeEmpWage();
        System.out.println("Total Wage of queried company: "+ empWageBuilder.getTotalEmpWage("SBI"));
        System.out.println();
    }
}

