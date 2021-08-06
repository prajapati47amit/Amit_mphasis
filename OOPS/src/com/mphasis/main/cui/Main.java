package com.mphasis.main.cui;
import com.mphasis.payroll.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Employee employee= new Permanent();
        HR hr =new HR();
        Employee employee = hr.recruit('c');
        Finance finance=new Finance();
        //finance.processSalary(new Contract());
        //finance.processSalary(new Intern());
        finance.processSalary(employee);
        finance.processSalary(hr.recruit('k'));



    }
}
