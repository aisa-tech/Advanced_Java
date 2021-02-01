package example2;

public class Rental  <T extends Rentable >{
	
	T ItemToRent;

	public Rental(T itemToRent) {
		ItemToRent = itemToRent;
	}
	
	
	public void processRental() {
		ItemToRent.rentOut();
	}
	
	
	

	public T getItemToRent() {
		return ItemToRent;
	}

	public void setItemToRent(T itemToRent) {
		ItemToRent = itemToRent;
	}
	
	
	
	

}
