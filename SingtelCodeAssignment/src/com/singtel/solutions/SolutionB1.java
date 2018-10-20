package com.singtel.solutions;

import com.singtel.models.Animal;
import com.singtel.models.Fish;
import com.singtel.models.ISing;
import com.singtel.models.ISwim;
import com.singtel.models.IWalk;
import com.singtel.models.NoSing;
import com.singtel.models.NoWalk;
import com.singtel.models.SimpleSwim;

public class SolutionB1 {
	
	public static void main(String[] args) {
		
		ISwim fishSwim = new SimpleSwim();
		IWalk fishWalk = new NoWalk();
		ISing fishSing = new NoSing();
		
		Animal fish = new Fish(fishWalk, null, fishSing, null, fishSwim);
		fish.getWalk().walk();
		fish.getSing().sing();
		fish.getSwim().swim();
	}

}
