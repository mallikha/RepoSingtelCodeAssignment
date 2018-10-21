package com.singtel.models;

/**
 * 
 * @author mallikarjuna
 * Implementation of ITalk that says Cock-a-doodle-doo
 */
public class CockadoodledooTalk implements ITalk {

	@Override
	public void talk() {
		System.out.println("Cock-a-doodle-doo");
	}

}
