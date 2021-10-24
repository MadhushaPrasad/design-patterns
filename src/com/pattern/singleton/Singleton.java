/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.singleton;

/**
 *
 * @author Madhusha Prasad
 */

public class Singleton {
	
	private static Singleton singleton;
	
	private Singleton() { }
	
	public static Singleton getInstance(){
		
		if(singleton == null){
			singleton = new Singleton();
			System.out.println("Singleton invocation");
		}
		return singleton;
	}
}
