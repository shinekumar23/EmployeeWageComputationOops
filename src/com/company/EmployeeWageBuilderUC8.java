package com.company;

public class EmployeeWageBuilderUC8 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static int computeEmpWage(String company, int EMP_RATE_PER_HOUR, int NUM_WORKING_DAYS, int MAX_HRS_IN_MONTH){
        int empHrs = 0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;
        while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS ){
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs+=empHrs;
            System.out.println("Day: " + totalWorkingDays + " Employee Hour: "+ empHrs);
        }
        int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
        System.out.println("Total Employee Wage for company " + company +" is "+ totalEmpWage +"\nTotal Employee Hours: "+ totalEmpHrs);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage("TCS",30,18,56);
        computeEmpWage("BridgeLabz",30,15,60);

    }
}
