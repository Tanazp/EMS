/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ems;

/**
 *
 * @author patha
 */
public class PartTimeEmployeeBuilder implements EmployeeBuilder {
    private PartTimeEmployee employee = new PartTimeEmployee();

    /**
     *
     * @param id
     * @return
     */
    @Override
    public PartTimeEmployeeBuilder setId(String id) { employee.setId(id); return this; }
    public PartTimeEmployeeBuilder setName(String name) { employee.setName(name); return this; }
    public PartTimeEmployeeBuilder setDepartment(String department) { employee.setDepartment(department); return this; }
    public PartTimeEmployeeBuilder setRole(String role) { employee.setRole(role); return this; }
    public PartTimeEmployeeBuilder setWorkingHours(int hours) { employee.setWorkingHoursPerWeek(hours); return this; }
    public PartTimeEmployeeBuilder setSalary(double salary) { employee.setSalary(salary); return this; }

    public PartTimeEmployee build() { return employee; }
}
