/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.stratergy;

/**
 *
 * @author Madhusha Prasad
 */
public class TestDuck {

    public static void main(String[] args) {

        System.out.println("Start Mollard Duck");
        System.out.println("==================");
        Duck mollard = new MollardDuck();
        mollard.performFly();
        mollard.performQuack();

        System.out.println("Start Model Duck");
        System.out.println("==================");
        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehaviour(new FlyRocketPower());
        model.performFly();

        model.performQuack();
        model.setQuackBehaviour(new ModelQuack());
        model.performQuack();
    }
}
