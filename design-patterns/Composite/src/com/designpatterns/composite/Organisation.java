package com.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Organisation {

    String name;
    List<Employee> employees = new ArrayList<>();

    public Organisation(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void printOrganisationsDetails() {
        System.out.println("Organisation name: " + name);

        employees.stream().forEach(employee -> {
            System.out.println("Employee name: " + employee.getName());
            System.out.println("Employee role: " + employee.getRole());
            System.out.println("Employee salary: " + employee.getSalary());
            System.out.println("============================================");
        });
    }

    public void printTotalSalaries() {
        System.out.println("Total employee salaries: " + employees
                .stream()
                .mapToInt(employee -> employee.getSalary())
                .sum());
    }

}
