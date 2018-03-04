package com.designpatterns.composite;

import java.util.List;

public class Developer implements Employee {

    private String name;
    private int salary;
    private String role;

    public Developer(String name, String role, int salary){
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getRole() {
        return role;
    }

}
