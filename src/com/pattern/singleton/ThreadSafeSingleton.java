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

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton threadSafeSingleton;
	
	private ThreadSafeSingleton() {}
	
	public static ThreadSafeSingleton getInstance(){
		
		if(threadSafeSingleton == null){
			synchronized (ThreadSafeSingleton.class) {
				if(threadSafeSingleton == null){
					threadSafeSingleton = new ThreadSafeSingleton();
					System.out.println("Object created for ThreadSafeSingleton.");
				}
			}
		}
		return threadSafeSingleton;
	}
}

