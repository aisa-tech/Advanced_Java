package example2;

public class Rentapp {
	
	public static void main(String[] args) {
		
		
		Car car = new Car();
		House house = new House();
		
		Rental<Car>carRental = new Rental<Car>(car);
		Rental<House>houseRental = new Rental<House>(house);
		
		
		
		carRental.processRental();
		houseRental.processRental();
		
		
		
	}

}
