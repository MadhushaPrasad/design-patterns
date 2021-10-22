/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singleton.example02;
/**
 *
 * @author Madhusha Prasad
 */
public class SingleObject {

    private static SingleObject singleObject;

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        if (singleObject == null) {
            return new SingleObject();
        }
        return singleObject;
    }

    public void showMessage(String mess) {
        System.out.println(mess);
    }

}
