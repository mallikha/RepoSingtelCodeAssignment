package com.singtel.models;

/**
 * 
 * @author mallikarjuna
 * ITalk implementation thats says Cluck, Cluck
 */
public class CluckTalk implements ITalk {

	@Override
	public void talk() {
		System.out.println("Cluck, Cluck");
	}

}
