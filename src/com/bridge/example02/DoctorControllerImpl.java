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
public class DoctorControllerImpl implements DoctorController {

    Doctor doctor;

    public DoctorControllerImpl(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public void checkPatient() {
        doctor.checkPatient();
    }

    @Override
    public void givePriscription() {
        doctor.givePriscription();
    }

}
