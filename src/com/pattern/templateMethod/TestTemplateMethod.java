/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.templateMethod;

/**
 *
 * @author Madhusha Prasad
 */
public class TestTemplateMethod {

    static Beverage beverage = null;

    public static void main(String[] args) {

        System.out.println("===========Tea========== \n");
        Beverage tea = new Tea();
        tea.prepareRecepie();

        System.out.println("===========Coffie========== \n");
        Beverage coffie = new Coffie();
        coffie.prepareRecepie();
    }
}
