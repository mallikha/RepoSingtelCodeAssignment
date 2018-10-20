package com.singtel.solutions;

import com.singtel.models.Chicken;
import com.singtel.models.CockadoodledooTalk;
import com.singtel.models.IFly;
import com.singtel.models.ISwim;
import com.singtel.models.ITalk;
import com.singtel.models.IWalk;
import com.singtel.models.NoFly;
import com.singtel.models.NoSwim;
import com.singtel.models.Rooster;
import com.singtel.models.SimpleWalk;

public class SolutionA3 {
	
	public static void main(String[] args) {
		IFly roosterFly = new NoFly();
		ITalk roosterTalk = new CockadoodledooTalk();
		ISwim roosterSwim = new NoSwim();
		IWalk roosterWalk = new SimpleWalk();
		
		Chicken rooster = new Rooster(roosterWalk, roosterFly, null, roosterTalk, roosterSwim);
		
		System.out.println(" --- Rooster --- ");
		rooster.getWalk().walk();
		rooster.getFly().fly();
		rooster.getTalk().talk();
		rooster.getSwim().swim();
	}

}
