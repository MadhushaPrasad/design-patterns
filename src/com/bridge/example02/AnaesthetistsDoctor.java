/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bridge.example02;

/**
 *
 * @author Madhusha Prasad
 */
public class AnaesthetistsDoctor implements Doctor{

    @Override
    public void checkPatient() {
        System.out.println("Anaesthetists Doctor check patient");
    }

    @Override
    public void givePriscription() {
        System.out.println("Anaesthetists Doctor give priscription");
    }
    
}
