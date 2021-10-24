/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.observer;

/**
 *
 * @author Madhusha Prasad
 */
public class ObserverImpl implements Observer {

    private String id;
    private String state;

    public ObserverImpl(String id) {
        this.id = id;
    }

    @Override
    public void update(Subject subject) {

        this.state = subject.getStatus();
        System.out
                .println("Observer recieved state change of subject ID is = "
                        + this.id + " Status = " + this.state);
    }
}
