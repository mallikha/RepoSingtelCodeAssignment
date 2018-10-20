package com.singtel.solutions;

import com.singtel.models.Fish;
import com.singtel.models.FishSize;

public interface SolutionB2 {
	
	public static void main(String[] args) {
		Fish clownFish = new Fish();
		Fish shark = new Fish();
		
		clownFish.setColor("Orange");
		clownFish.setSize(FishSize.SMALL);
		clownFish.setJoker(true);
		clownFish.setEatsOtherFish(false);
		
		System.out.println("--- Clown Fish ---");
		System.out.println(clownFish);
		
		shark.setColor("Grey");
		shark.setSize(FishSize.LARGE);
		shark.setJoker(false);
		shark.setEatsOtherFish(true);
		
		System.out.println("--- Shark Fish ---");
		System.out.println(shark);
		
	}

}
