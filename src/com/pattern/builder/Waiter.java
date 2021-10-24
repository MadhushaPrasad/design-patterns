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
public class Waiter {

    PizzaBuilder pizzaBuilder;

    public Waiter(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public Waiter serve() {
        pizzaBuilder.buildPizzaBase();
        pizzaBuilder.buildPizzaTopping();
        return this;
    }

}
