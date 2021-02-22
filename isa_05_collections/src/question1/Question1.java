package question1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class Question1 {

	public static void main(String[] args) {
		
		try(BufferedReader reader = new BufferedReader(new FileReader(new File("creditcards.txt")));) {
			
			Set<String>cardList = new HashSet<String>();
			String line = "";
			while((line = reader.readLine()) != null) {
				cardList.add(line);
				
			}
			System.out.println("Card size : " + cardList.size());
			for (String numbers : cardList) {
		
				System.out.println(numbers);
				
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}
	
	
}
