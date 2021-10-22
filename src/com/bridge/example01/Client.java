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
public class Client {

    public static void main(String[] args) {
        RemoteControllerImpl rcImpl = new RemoteControllerImpl(new SonyTv());
        RemoteControllerImpl rcImpl2 = new RemoteControllerImpl(new LG());

        rcImpl.off();
        rcImpl2.on();
    }

}
