package com.singtel.models;

/**
 * 
 * @author mallikarjuna
 * Implementation of ITalk that says Meow
 */
public class MeowTalk implements ITalk {

	@Override
	public void talk() {
		System.out.println("Meow");
	}
	
	

}
