/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.command;

/**
 *
 * @author Madhusha Prasad
 */
public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on.");
    }

    public void off() {
        System.out.println(location + " light is off.");
    }
}
