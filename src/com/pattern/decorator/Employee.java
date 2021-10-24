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
public abstract class Employee {

    public String description;

    public Employee() {
        description = "General employee details";
    }

    abstract public double getSalary();

}
