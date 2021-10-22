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
public class Patient {

    public static void main(String[] args) {
        DoctorControllerImpl dentistDoctor = new DoctorControllerImpl(new DentistDoctor());
        DoctorControllerImpl anaesthetistsDoctor = new DoctorControllerImpl(new AnaesthetistsDoctor());

        dentistDoctor.checkPatient();
        dentistDoctor.givePriscription();

        anaesthetistsDoctor.checkPatient();
        anaesthetistsDoctor.givePriscription();

    }
}
