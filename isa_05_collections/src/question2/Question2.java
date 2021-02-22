package question2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question2 {

	//Cluster the card numbers into two sets: in one display the repeating cards and their counts;
	// in the other display the cards that appear only  once.
	public static void main(String[] args) {
		
		Map<String, Integer>countMap = new HashMap<String, Integer>();

// In here we can use it, but in big files it will make problems coz it can fill our memory.
		try {
			List<String>lines	= Files.readAllLines(Paths.get("creditcards.txt"));
			
			for (String line : lines) {
				
				if(countMap.get(line) != null) {
					countMap.put(line, countMap.get(line)+1);
				}else {
					countMap.put(line, 1);
				}
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Repeating numbers : ");
		for(String key : countMap.keySet()) {
			if(countMap.get(key)>1) {
				System.out.println(key + ":" + countMap.get(key));
				
			}
		
		}

		System.out.println("Non-Repeating numbers : ");
		for(String key : countMap.keySet()) {
			if(countMap.get(key)==1) {
				System.out.println(key + ":" + countMap.get(key));
				
			}
		
		}
	
	}	
	
}
