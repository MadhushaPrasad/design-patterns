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
public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage("Single Object is called");
    }
}
