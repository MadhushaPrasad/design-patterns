/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.bridge;

/**
 *
 * @author Madhusha Prasad
 */
public class SonyTV implements TV {

    @Override
    public void on() {
        System.out.println("Switch on Sony TV");
    }

    @Override
    public void off() {
        System.out.println("Switch off Sony TV");
    }

    @Override
    public void tune(int chanel) {
        System.out.println("Switch on chanel in Sony TV is: " + chanel);
    }

}
