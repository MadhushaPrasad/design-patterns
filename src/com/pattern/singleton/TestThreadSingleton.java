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

public class TestThreadSingleton implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Thread(new TestThreadSingleton()).start();
		
		for (int i = 0; i < 10; i++) {
			Singleton.getInstance();
			ThreadSafeSingleton.getInstance();
		}
	}
	
	/**
	 * Invoke thread 
	 */
	public void run(){
		for (int i = 0; i < 10; i++) {
			Singleton.getInstance();
			ThreadSafeSingleton.getInstance();
		}
	}
}

