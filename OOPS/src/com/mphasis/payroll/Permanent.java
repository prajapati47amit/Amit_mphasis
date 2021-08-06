package com.mphasis.payroll;

import java.sql.SQLOutput;

public class Permanent extends Employee {
    @Override
    public void netpay() {
        System.out.println("Permanent Employee Salary it is");
    }
    public void transportaion(){
        System.out.println("transportation provided");
    }
}
