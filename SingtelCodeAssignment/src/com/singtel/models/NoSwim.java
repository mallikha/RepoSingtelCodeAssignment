package com.singtel.models;

/**
 * 
 * @author mallikarjuna
 * Implementation of ISwim that doesn't swim
 */
public class NoSwim implements ISwim {

	@Override
	public void swim() {
		System.out.println("I can't swim");
	}

}
