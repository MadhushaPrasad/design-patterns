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
public class RemotePersonImpl implements IRemotePerson {

    @Override
    public String geenerateFullName() {
        System.out.println("Invoke remote geenerateFullName() method.");
        return null;
    }

    @Override
    public String generateFullAddress() {
        System.out.println("Invoke remote generateFullAddress() method.");
        return null;
    }

}
