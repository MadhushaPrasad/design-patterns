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
public class Tea extends Beverage {

	@Override
	void brew() {
		System.out.println("Steeping the Tea.");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Lemon.");
	}
}




