package com.company;

public class EmployeeWageBuilderUC9 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public final String company;
    public final int EMP_RATE_PER_HOUR;
    public final int NUM_WORKING_DAYS;
    private final int MAX_HRS_IN_MONTH;
    public int totalEmpWage;

    public EmployeeWageBuilderUC9(String company,int EMP_RATE_PER_HOUR,int NUM_WORKING_DAYS,int MAX_HRS_IN_MONTH){
        this.company=company;
        this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
        this.NUM_WORKING_DAYS=NUM_WORKING_DAYS;
        this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
    }
    public void computeEmpWage(){
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
        totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
    }
    public String toString(){
        return "Total Emp Wage for company "+ company +" is "+ totalEmpWage;
    }

    public static void main(String[] args) {
        EmployeeWageBuilderUC9 TCS=new EmployeeWageBuilderUC9("TCS",30,18,56);
        EmployeeWageBuilderUC9 PayTM=new EmployeeWageBuilderUC9("PayTm",35,16,54);
        TCS.computeEmpWage();
        System.out.println(TCS);
        PayTM.computeEmpWage();
        System.out.println(PayTM);

    }
}
