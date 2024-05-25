package com.emard.mvc;

import com.emard.mvc.controller.EmployeeController;
import com.emard.mvc.models.Employee;
import com.emard.mvc.view.EmployeeDashboardView;

public class TestMvc {
    public static void main(String[] args) {
        Employee employee = retrieveEmployeeFromServer();
        //create view
        EmployeeDashboardView view = new EmployeeDashboardView();
        EmployeeController controller= new EmployeeController(employee, view);
        controller.updateDashboardView();
    }
    public static Employee retrieveEmployeeFromServer(){
        Employee employee = new Employee();
        employee.setSsNumber("12344896");
        employee.setFirstName("James");
        employee.setLastName("Bond");
        employee.setSalary(125000);
        return employee;
    }
}
