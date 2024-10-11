/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ems;

/**
 *
 * @author patha
 */
public class PartTimeEmployee extends Employee {
    @Override
    public void clockIn() {
        System.out.println(getName() + " clocked in (Part-time).");
    }

    @Override
    public void clockOut() {
        System.out.println(getName() + " clocked out (Part-time).");
    }

    @Override
    public void trackWorkHours() {
        System.out.println(getName() + " tracked work hours (Part-time).");
    }
}
