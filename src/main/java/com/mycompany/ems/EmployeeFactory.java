/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ems;

/**
 *
 * @author patha
 */
public class EmployeeFactory {
    public static Employee createEmployee(String type) {
        if (type.equalsIgnoreCase("full-time")) {
            return new FullTimeEmployee();
        } else if (type.equalsIgnoreCase("part-time")) {
            return new PartTimeEmployee();
        }
        throw new IllegalArgumentException("Unknown employee type: " + type);
    }
}

