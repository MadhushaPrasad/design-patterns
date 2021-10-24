/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.builder;

/**
 *
 * @author Madhusha Prasad
 */
public class BuilderTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Waiter waiter1 = new Waiter(new CheesyPizzaBuilder()).serve();
        System.out.println();
        Waiter waiter2 = new Waiter(new VeggiePizzaBuilder()).serve();

    }

}
