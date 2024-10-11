/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ems;

/**
 *
 * @author patha
 */
public class FullTimeEmployeeBuilder implements EmployeeBuilder {
    private FullTimeEmployee employee = new FullTimeEmployee();

    public FullTimeEmployeeBuilder setId(String id) { employee.setId(id); return this; }
    public FullTimeEmployeeBuilder setName(String name) { employee.setName(name); return this; }
    public FullTimeEmployeeBuilder setDepartment(String department) { employee.setDepartment(department); return this; }
    public FullTimeEmployeeBuilder setRole(String role) { employee.setRole(role); return this; }
    public FullTimeEmployeeBuilder setWorkingHours(int hours) { employee.setWorkingHoursPerWeek(hours); return this; }
    public FullTimeEmployeeBuilder setSalary(double salary) { employee.setSalary(salary); return this; }

    public FullTimeEmployee build() { return employee; }
}



