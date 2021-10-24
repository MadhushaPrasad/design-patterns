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
public class RemoteControllerImpl implements RemoteController {

    TV tv;

    public RemoteControllerImpl(TV tv) {
        this.tv = tv;
    }

    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void off() {
        tv.off();
    }

    @Override
    public void tune(int chanel) {
        tv.tune(chanel);
    }
}
