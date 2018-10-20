package com.singtel.solutions;

import com.singtel.models.Bird;
import com.singtel.models.CockadoodledooTalk;
import com.singtel.models.IFly;
import com.singtel.models.ISwim;
import com.singtel.models.ITalk;
import com.singtel.models.IWalk;
import com.singtel.models.MeowTalk;
import com.singtel.models.NoSwim;
import com.singtel.models.Parrot;
import com.singtel.models.SimpleFly;
import com.singtel.models.SimpleWalk;
import com.singtel.models.WoofTalk;

public class SolutionA4 {
	
	public static void main(String[] args) {
		IFly parrotFly = new SimpleFly();
		ISwim parrotSwim = new NoSwim();
		IWalk parrotWalk = new SimpleWalk();
		
		ITalk dogParrotTalk = new WoofTalk();
		ITalk catParrotTalk = new MeowTalk();
		ITalk roosterParrotTalk = new CockadoodledooTalk();
		
		Bird dogParrot = new Parrot(parrotWalk, parrotFly, null, dogParrotTalk, parrotSwim);
		Bird catParrot = new Parrot(parrotWalk, parrotFly, null, catParrotTalk, parrotSwim);
		Bird roosterParrot = new Parrot(parrotWalk, parrotFly, null, roosterParrotTalk, parrotSwim);
		
		System.out.println(" --- Dog Parrot --- ");
		dogParrot.getTalk().talk();
		
		System.out.println(" --- Cat Parrot --- ");
		catParrot.getTalk().talk();
		
		System.out.println(" --- Rooster Parrot --- ");
		roosterParrot.getTalk().talk();
		
		/*Note: If another parrot comes with different way of talking, another class should be created 
		implementing ITalk or uses existing ones like QuackTalk*/
		
	}

}
