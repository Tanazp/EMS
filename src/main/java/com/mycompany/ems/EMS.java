/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ems;

/**
 *
 * @author patha
 */
public class EMS {
    public static void main(String[] args) {
        EmployeeManager manager = EmployeeManager.getInstance();

        // Use Builder pattern to construct employees
        EmployeeBuilder fullTimeBuilder = new FullTimeEmployeeBuilder();
        EmployeeDirector director = new EmployeeDirector(fullTimeBuilder);
        Employee emp1 = director.construct("101", "Alice", "IT", "Developer", 40, 70000);

        EmployeeBuilder partTimeBuilder = new PartTimeEmployeeBuilder();
        director = new EmployeeDirector(partTimeBuilder);
        Employee emp2 = director.construct("102", "Bob", "HR", "Assistant", 20, 25000);

        // Add employees to the system
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        // Use Factory to create another employee
        Employee emp3 = EmployeeFactory.createEmployee("full-time");
        emp3.setId("103");
        emp3.setName("Charlie");
        emp3.setDepartment("Sales");
        emp3.setRole("Manager");
        emp3.setWorkingHoursPerWeek(40);
        emp3.setSalary(90000);
        manager.addEmployee(emp3);

        // Simulate actions
        emp1.clockIn();
        emp2.clockIn();
        emp3.clockIn();

        // Retrieve and manage employees
        Employee retrievedEmp = manager.getEmployee("101");
        System.out.println("Retrieved Employee: " + retrievedEmp.getName());
    }
}

