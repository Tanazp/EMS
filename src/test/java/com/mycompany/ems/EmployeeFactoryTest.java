/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author patha
 */
public class EmployeeFactoryTest {
    
    @Test
  public void testFactoryCreatesFullTimeEmployee() {
        Employee emp = EmployeeFactory.createEmployee("full-time");
        assertTrue(emp instanceof FullTimeEmployee);
    }

    @Test
    public void testFactoryCreatesPartTimeEmployee() {
        Employee emp = EmployeeFactory.createEmployee("part-time");
        assertTrue(emp instanceof PartTimeEmployee);
    }
}