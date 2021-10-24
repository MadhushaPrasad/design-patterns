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
public class Coffie extends Beverage {

	@Override
	void addCondiments() {
		System.out.println("Add suger and milk.");
	}

	@Override
	void brew() {
		System.out.println("Stripping coffie through filter.");
	}
}



