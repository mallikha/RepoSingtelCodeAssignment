package com.singtel.solutions;

import com.singtel.models.Animal;
import com.singtel.models.Dolphin;
import com.singtel.models.SimpleSwim;

public class SolutionB3 {
	
	public static void main(String[] args) {
		Animal dolphin = new Dolphin(new SimpleSwim());
		dolphin.getSwim().swim();
		
	}

}
