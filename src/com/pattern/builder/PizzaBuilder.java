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
public abstract class PizzaBuilder {

    public abstract void buildPizzaBase();

    public abstract void buildPizzaTopping();

    public abstract Pizza getPizza();

}
