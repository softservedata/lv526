package com.softserve.edu7.Homework.task_with_interface;

import sun.security.x509.UniqueIdentity;

import java.util.UUID;

public class ContractEmployee extends Employee implements Payment{

    private  String name;
    private String federalTaxIdmember = UUID.randomUUID().toString();

    public ContractEmployee(String name) {
        this.name = name;
    }

    @Override
    public double calculatePay(int fixSalary) {
        return  fixSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }


    public String toString() {
        return "ContractEmployee{" +
                "name='" + name + '\'' +
                ", federalTaxIdmember=" + federalTaxIdmember +
                '}';
    }

}
