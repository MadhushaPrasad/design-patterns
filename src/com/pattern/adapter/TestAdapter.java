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
public class TestAdapter {

    public static void main(String[] args) {

        IPerson person = new PersonImpl();
        IRemotePerson remotePerson = new RemotePersonImpl();

        System.out.println("Person says");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAddressLine1());
        System.out.println(person.getAddressLine2());

        System.out.println("\n Remote Persona says");
        remotePerson.geenerateFullName();
        remotePerson.generateFullAddress();

        System.out.println("\n Person Adapter says");
        PersonAdapter adapter = new PersonAdapter(person);
        testPerson(adapter);

    }

    static void testPerson(IRemotePerson remotePerson) {
        remotePerson.geenerateFullName();
        remotePerson.generateFullAddress();
    }

}
