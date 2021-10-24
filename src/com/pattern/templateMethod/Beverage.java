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
public abstract class Beverage {
	
	final void prepareRecepie(){
		boilWater();
		brew();
		addCondiments();
		pourInCup();
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater(){
		System.out.println("Boiling water.");
	}
	
	void pourInCup(){
		System.out.println("Pour into cup.");
	}
}
