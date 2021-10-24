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
public interface RemoteController {

    void on();

    void off();

    void tune(int chanel);
}
