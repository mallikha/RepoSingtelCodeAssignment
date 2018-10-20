package com.singtel.solutions;

import com.singtel.models.Bird;
import com.singtel.models.IFly;
import com.singtel.models.ISing;
import com.singtel.models.IWalk;
import com.singtel.models.SimpleFly;
import com.singtel.models.SimpleSing;
import com.singtel.models.SimpleWalk;

public class SolutionA1 {
	
	public static void main(String[] args) {
		IWalk walk = new SimpleWalk();
		IFly fly = new SimpleFly();
		ISing sing = new SimpleSing();
		
		Bird bird = new Bird(walk, fly, sing);
		bird.getWalk().walk();
		bird.getFly().fly();
		bird.getSing().sing();
	}

}
