package example3;

import java.util.ArrayList;

public class ZooKeeper {
	
	public void feedAnimals(ArrayList<? extends Animal>animals) {
		
		System.out.println("Feed Animals.");
		
		for (Animal animal : animals) {
			System.out.println("Animals fed..");
			
			
		}
		
		
	}

}
