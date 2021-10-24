/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.decorator;

/**
 *
 * @author Madhusha Prasad
 */
public class Manager extends Employee {

    public Manager() {
        description = "Manager";
    }

    @Override
    public double getSalary() {
        return 80000;
    }

}
