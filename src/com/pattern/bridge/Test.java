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
public class Test {

    public static void main(String[] args) {
        TV lgLv = new LGTV();
        TV sontTv = new SonyTV();

        new RemoteControllerImpl(lgLv).on();
        new RemoteControllerImpl(lgLv).off();
        new RemoteControllerImpl(lgLv).tune(10);
        new RemoteControllerImpl(sontTv).on();
        new RemoteControllerImpl(sontTv).off();
        new RemoteControllerImpl(sontTv).tune(20);
    }
}
