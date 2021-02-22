package iteratorExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		
		List<String>names = new ArrayList<String>();
		names.add("Isa");
		names.add("Ayse");
		names.add("Veli");
		names.add("Orhun");
		
		//Code below generated ConcurrentModificationException
		//Because in a foreach loop list is tried to be modified !
		
		/*
		for (String name : names) {
			if(name == "Ayse") {
				names.remove(name);
			}
			
		}
		
		System.out.println(names);
		*/
		
		Iterator<String> it =  names.iterator();
			
		while(it.hasNext()) {
			String currentElement = it.next();
			if(currentElement.equals("Veli")) {
				it.remove();
			}
			
			
		}
		System.out.println(names);
	}

}
