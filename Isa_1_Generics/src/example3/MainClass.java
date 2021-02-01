package example3;

import java.util.ArrayList;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		ArrayList<Animal>animals = new ArrayList<>();
		ArrayList<Monkey>monkey = new ArrayList<>();
		
		ZooKeeper zookeper = new ZooKeeper();
		
		zookeper.feedAnimals(animals);
		zookeper.feedAnimals(monkey);
		
		
		
		
	}

}
