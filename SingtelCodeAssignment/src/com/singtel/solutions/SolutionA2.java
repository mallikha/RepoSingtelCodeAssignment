package com.singtel.solutions;

import com.singtel.models.Bird;
import com.singtel.models.Chicken;
import com.singtel.models.CluckTalk;
import com.singtel.models.Duck;
import com.singtel.models.IFly;
import com.singtel.models.ISwim;
import com.singtel.models.ITalk;
import com.singtel.models.IWalk;
import com.singtel.models.NoFly;
import com.singtel.models.NoSwim;
import com.singtel.models.QuackTalk;
import com.singtel.models.SimpleSwim;
import com.singtel.models.SimpleWalk;

public class SolutionA2 {
	
	public static void main(String[] args) {
		IFly duckFly = new NoFly();
		ITalk duckTalk = new QuackTalk(); 
		ISwim duckSwim = new SimpleSwim();
		IWalk duckWalk = new SimpleWalk();
		
		IFly chickenFly = new NoFly();
		ITalk chickenTalk = new CluckTalk();
		ISwim chickenSwim = new NoSwim();
		IWalk chickenWalk = new SimpleWalk();
		
		Bird duck = new Duck(duckWalk, duckFly, null, duckTalk, duckSwim);
		Bird chicken = new Chicken(chickenWalk, chickenFly, null, chickenTalk, chickenSwim);
		
		System.out.println(" --- Duck --- ");
		duck.getWalk().walk();
		duck.getFly().fly();
		duck.getTalk().talk();
		duck.getSwim().swim();
		
		System.out.println(" --- Chicken --- ");
		chicken.getWalk().walk();
		chicken.getFly().fly();
		chicken.getTalk().talk();
		chicken.getSwim().swim();
		
		
	}

}
