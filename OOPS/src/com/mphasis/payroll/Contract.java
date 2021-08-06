package com.mphasis.payroll;

public class Contract extends Employee{
    @Override
    public void netpay() {
        System.out.println("Payout");
    }
}
