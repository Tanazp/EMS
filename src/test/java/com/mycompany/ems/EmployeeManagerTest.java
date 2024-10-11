/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ems;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author patha
 */
public class EmployeeManagerTest {
    
    @Test
     public void testSingleton() {
        EmployeeManager manager1 = EmployeeManager.getInstance();
        EmployeeManager manager2 = EmployeeManager.getInstance();
        assertSame(manager1, manager2);
    }

    @Test
    public void testAddEmployee() {
        EmployeeManager manager = EmployeeManager.getInstance();
        Employee emp = new FullTimeEmployee();
        emp.setId("101");
        emp.setName("Test Employee");
        manager.addEmployee(emp);
        assertEquals(emp, manager.getEmployee(emp.getId()));
    }
}
