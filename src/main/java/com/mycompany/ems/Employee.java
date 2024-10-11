/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ems;

/**
 *
 * @author patha
 */
public abstract class Employee {
    protected String id;
    protected String name;
    protected String department;
    protected String role;
    protected int workingHoursPerWeek;
    protected double salary;

    public abstract void clockIn();
    public abstract void clockOut();
    public abstract void trackWorkHours();

    // Getters and Setters for the properties
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public int getWorkingHoursPerWeek() { return workingHoursPerWeek; }
    public void setWorkingHoursPerWeek(int workingHoursPerWeek) { this.workingHoursPerWeek = workingHoursPerWeek; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

