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
public class EmployeeDirectorTest {
    
    @Test
    public void testEmployeeConstruction() {
        EmployeeBuilder builder = new FullTimeEmployeeBuilder();
        EmployeeDirector director = new EmployeeDirector(builder);
        Employee emp = director.construct("101", "Alice", "IT", "Developer", 40, 70000);
        assertNotNull(emp);
        assertEquals("Alice", emp.getName());
        assertEquals(70000, emp.getSalary());
    }
}

