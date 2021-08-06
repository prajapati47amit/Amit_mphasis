package com.mphasis.payroll;

public class HR {
    public Employee recruit(char empType) {
        if (empType == 'I' || empType == 'i') {
            return new Intern();
        } else if (empType == 'P' || empType == 'p') {
            return new Permanent();

        } else if (empType == 'C' || empType == 'c') {
            return new Contract();
        } else return null;
    }
}