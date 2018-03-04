package com.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/*
* Every organization is composed of employees.
*
* Each of the employees has the same features i.e. has a salary,
* has some responsibilities, may or may not report to someone,
* may or may not have some subordinates etc.
*
* Composite pattern lets clients treat the individual objects in a
* uniform manner.
*
* Create a system that allows organisation to hold and display information
* about different types of employees
*
* */

public class Main {

    public static void main(String[] args) {
        String orgName = "Org LTD";
        Organisation org = createOrganisation(orgName);

        addEmployeesToOrganisation(org);
        org.printOrganisationsDetails();
        org.printTotalSalaries();
    }

    private static Organisation createOrganisation(String name){
        return new Organisation(name);
    }

    private static void addEmployeesToOrganisation(Organisation org) {
        org.addEmployee(new Developer("James", "Senior Software Engineer", 30000));
        org.addEmployee(new Developer("Tom", "Software Engineer", 25000));
        org.addEmployee(new Developer("Roy", "Software Engineer", 28000));
        org.addEmployee(new Developer("Frank", "Principal Software Engineer", 45000));

        org.addEmployee(new Designer("Jack", "Lead UX Engineer", 45000));
        org.addEmployee(new Designer("Mark", "Senior UI Engineer", 32000));
    }
}
