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
public class FlyWithWings implements IFlyBehaviour{

	@Override
	public void fly() {
		System.out.println("I am flying with wings");
	}
}
