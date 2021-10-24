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
public class VeggiePizzaBuilder extends PizzaBuilder {

    Pizza pizza;

    public VeggiePizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public void buildPizzaBase() {
        System.out.println("Building Veggie Pizza base");
        pizza.setName("Veggie Pizza");
    }

    @Override
    public void buildPizzaTopping() {
        System.out.println("Add Veggie pizza Topping");
        pizza.setSauce("Pizza sauce");
    }

    @Override
    public Pizza getPizza() {
        System.out.println("Returning Veggie Pizza");
        return this.pizza;
    }

}
