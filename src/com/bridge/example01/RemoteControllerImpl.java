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
public class RemoteControllerImpl implements RemoteController {

    Tv tv;

    public RemoteControllerImpl(Tv tv) {
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

}
