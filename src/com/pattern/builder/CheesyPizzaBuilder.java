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
public class CheesyPizzaBuilder extends PizzaBuilder {

    Pizza pizza;

    public CheesyPizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public void buildPizzaBase() {
        System.out.println("Building the cheesy pizza base");
        pizza.setName("Cheesy pizza");
    }

    @Override
    public void buildPizzaTopping() {
        System.out.println("Add Cheesy Pizza Topping");
        pizza.setSauce("Cheesy sauce");
    }

    @Override
    public Pizza getPizza() {
        System.out.println("Returning Cheesy pizza");
        return this.pizza;
    }
}
