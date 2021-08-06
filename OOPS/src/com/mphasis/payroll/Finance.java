package com.mphasis.payroll;

public class Finance {
    public void processSalary(Employee employee) {
        if(employee!=null){
            employee.netpay();
            if (employee instanceof Permanent){
                Permanent permanent = (Permanent) employee;
                permanent.transportaion();
            }
        }
    }
}
