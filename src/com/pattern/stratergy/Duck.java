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

public abstract class Duck {
	
	IFlyBehaviour flyBehaviour;
	
	IQuackBehaviour quackBehaviour;
	
	public abstract void display();
	
	public void performFly(){
		flyBehaviour.fly();
	}
	
	public void performQuack(){
		quackBehaviour.quack();
	}
	
	public void swim(){
		System.out.println("All ducks float even Decoy");
	}

	public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
}
