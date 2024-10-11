/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ems;

/**
 *
 * @author patha
 */
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private static EmployeeManager instance;
    private List<Employee> employees;

    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(String employeeId) {
        employees.removeIf(employee -> employee.getId().equals(employeeId));
    }

    public Employee getEmployee(String employeeId) {
        return employees.stream()
                .filter(emp -> emp.getId().equals(employeeId))
                .findFirst()
                .orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}

