package com.company;

public class Manager extends Employee implements EmployeePosition{


    public Manager(String name, String surname, double baseSalary, String jobTitle) {
        super(name, surname, baseSalary, jobTitle);
    }

    @Override
    public String getJobTitle() {
        return getTitle();
    }

    @Override
    public double calcSalary(int baseSalary) {
        return getSalary()+baseSalary;
    }
}
