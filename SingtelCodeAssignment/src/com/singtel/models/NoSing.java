package com.singtel.models;

public class NoSing implements ISing {

	@Override
	public void sing() {
		System.out.println("I can't sing");
	}

}
