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
public class Consultant extends Employee {

    public Consultant() {
        description = "Consultant";
    }

    @Override
    public double getSalary() {
        return 70000;
    }

}
