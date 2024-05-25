package com.emard.mvc.view;

import com.emard.mvc.models.Employee;

public class EmployeeDashboardView {
    public void printEmployeeInformation(Employee employee){
        System.out.println("Name: "+employee.getFirstName()+ " "+employee.getLastName());
        System.out.println(String.format("SSN: %s", employee.getSsNumber()));
        System.out.println(String.format("Salary: %s", employee.getSalary()));
    }
}
