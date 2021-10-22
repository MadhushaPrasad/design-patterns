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
public class SonyTv implements Tv {

    @Override
    public void on() {
        System.out.println("On method of Son TV");

    }

    @Override
    public void off() {
        System.out.println("Off method of Son TV");
    }

}
