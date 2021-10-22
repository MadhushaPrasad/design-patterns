/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bridge.example01;

/**
 *
 * @author Madhusha Prasad
 */
public class LG implements Tv{

     @Override
    public void on() {
        System.out.println("On method of LG TV");

    }

    @Override
    public void off() {
        System.out.println("Off method of LG TV");
    }
    
}
