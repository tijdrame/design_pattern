package com.emard.mvc.controller;

import com.emard.mvc.models.Employee;
import com.emard.mvc.view.EmployeeDashboardView;

public class EmployeeController {
    private Employee employeeModel;
    private EmployeeDashboardView view;

    public EmployeeController(Employee employeeModel, EmployeeDashboardView view) {
        this.employeeModel = employeeModel;
        this.view = view;
    }
    public void setEmployee(String name, String lastName, String ssNumber, double salary){
        employeeModel.setFirstName(name);
        employeeModel.setLastName(lastName);
        employeeModel.setSsNumber(ssNumber);
        employeeModel.setSalary(salary);
    }
    public String getEmployee(){
        return String.format("Name: %s %s,  SSN: %s, salary: %d ",
                employeeModel.getFirstName(), employeeModel.getLastName(),
                employeeModel.getSsNumber(), employeeModel.getSalary());
    }
    public void updateDashboardView(){
        view.printEmployeeInformation(employeeModel);
    }
}
