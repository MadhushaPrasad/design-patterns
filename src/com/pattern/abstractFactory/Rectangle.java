/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.abstractFactory;

/**
 *
 * @author Madhusha Prasad
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside the Rectangle:draw() method");
    }
}
