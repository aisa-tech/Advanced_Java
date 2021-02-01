import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainClass {
	
	public static void main(String[] args) {
		
		Product p1 = new Product("Laptop", 5000, 0.18);
		
		try(
				ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("p1.dat"));
				) 
		{
			writer.writeObject(p1);
			writer.flush();			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	 

}
