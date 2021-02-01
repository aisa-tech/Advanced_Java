import java.io.Serializable;

public class Product implements Serializable{

	private static final long serialVersionUID = 4753251087152228687L;
	private String name;
	private double price;
	private double vat;
	
	private transient double taxAmount;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	

	
	public Product(String name, double price, double vat) {
		super();
		this.name = name;
		this.price = price;
		this.vat = vat;
		taxAmount= price*vat;
		
	}
	public double getTaxAmount() {
		
	if(taxAmount==0) {
		taxAmount= price*vat;
	}
	return taxAmount;
	
		
	}
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	
	
	
	
	
	
	
	
	
	

}
