package com.company;

import java.util.ArrayList;

public class CompanyEmpWage {
    public String company;
    public int empRatePerHr;
    public int numberOfWorkingDays;
    public int maxHrPerMonth;
    public int totalEmpWage;
    ArrayList<Integer> dailyWage=new ArrayList<Integer>();
    public CompanyEmpWage(String company,int empRatePerHr,int numberOfWorkingDays,int maxHrPerMonth){
        this.company=company;
        this.empRatePerHr=empRatePerHr;
        this.numberOfWorkingDays=numberOfWorkingDays;
        this.maxHrPerMonth=maxHrPerMonth;
    }
    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage=totalEmpWage;
    }
    public String toString(){

        return  "Total employee wage for: "+ company +" is "+ totalEmpWage;
    }
}
