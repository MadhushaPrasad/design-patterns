/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.adapter;

/**
 *
 * @author Madhusha Prasad
 */
public class PersonImpl implements IPerson {

    @Override
    public String getFirstName() {
        return "Nimal";
    }

    @Override
    public String getLastName() {
        return "Senevirathne";
    }

    @Override
    public String getAddressLine1() {
        return "No:117/1, Kandy Road,";
    }

    @Override
    public String getAddressLine2() {
        return "Mudungoda";
    }
}
