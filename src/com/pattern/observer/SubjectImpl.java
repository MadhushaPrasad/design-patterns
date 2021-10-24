/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Madhusha Prasad
 */

public class SubjectImpl implements Subject{
	
	private String state;
	List<Observer> observerList = new ArrayList<Observer>();

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void setStatus(String status) {
		this.state = status;
		notifyObservers();
	}

	@Override
	public String getStatus() {
		return this.state;
	}
	
	/**
	 * Notify for all observers
	 */
	public void notifyObservers(){
		Iterator<Observer> iterator = observerList.iterator();
		while (iterator.hasNext()) {
			Observer observer = (Observer)iterator.next();
			observer.update(this);
		}
	}
}
