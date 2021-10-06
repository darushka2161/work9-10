package com.company;

public abstract  class Employee {
    private String Name;
    private String Surname;
    private double Salary;
    private String Title;

    public Employee(String name, String surname, double Salary, String title) {
        Name = name;
        Surname = surname;
        this.Salary = Salary;
        Title = title;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
