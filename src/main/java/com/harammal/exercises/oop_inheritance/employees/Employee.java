package com.harammal.exercises.oop_inheritance.employees;

public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDetails() {
        return "Employee{" + "name='" + name + "', salary=" + salary + "}";
    }

    @Override
    public String toString() {
        return getDetails();
    }
}
