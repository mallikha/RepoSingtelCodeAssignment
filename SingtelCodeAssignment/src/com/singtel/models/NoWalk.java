package com.singtel.models;

public class NoWalk implements IWalk {

	@Override
	public void walk() {
		System.out.println("I can't walk");
	}

}
