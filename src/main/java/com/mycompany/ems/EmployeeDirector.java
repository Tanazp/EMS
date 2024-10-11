/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ems;

/**
 *
 * @author patha
 */
public class EmployeeDirector {
    private EmployeeBuilder builder;

    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    public Employee construct(String id, String name, String department, String role, int hours, double salary) {
        return builder.setId(id)
                      .setName(name)
                      .setDepartment(department)
                      .setRole(role)
                      .setWorkingHours(hours)
                      .setSalary(salary)
                      .build();
    }
}

