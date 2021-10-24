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
public class MollardDuck extends Duck{
	
	public MollardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am a real Mollard Duck.");
	}
}
