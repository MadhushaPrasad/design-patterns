/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bridge.exaple02;

/**
 *
 * @author Madhusha Prasad
 */
public class DentistDoctor implements Doctor{
    @Override
    public void checkPatient() {
        System.out.println("Dentist Doctor check patient");
    }

    @Override
    public void givePriscription() {
        System.out.println("Dentist Doctor give priscription");
    }
}
