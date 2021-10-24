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
public class Engineer extends Employee {

    public Engineer() {
        description = "Engineer";
    }

    @Override
    public double getSalary() {
        return 60000;
    }
}
