/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ems;

/**
 *
 * @author patha
 */
public class FullTimeEmployee extends Employee {
    @Override
    public void clockIn() {
        System.out.println(getName() + " clocked in (Full-time).");
    }

    @Override
    public void clockOut() {
        System.out.println(getName() + " clocked out (Full-time).");
    }

    @Override
    public void trackWorkHours() {
        System.out.println(getName() + " tracked work hours (Full-time).");
    }
}
