package example1;

import java.util.List;
import example1.Book.Chapter;

public class Mainclass {
	
	public static void main(String[] args) {
		
		Chapter introChapter = new Book().new Chapter(1, "Alice");
		
		Book book = new Book("Alice is in Wonderland", 2007, introChapter);
		
		book.setIntroPage();
		
		
		FirstPage fp = new FirstPage();
		book.addPage(fp);
		
		
		
		book.addPage(new Page() {
			private String color = "Black";
			@Override
			public void getContent() {
				System.out.println("Color is " + color);
				System.out.println("Second page");
				
			}
		});

		book.setAuthor(new Author() {
			
			@Override
			public void getInfo() {
				System.out.println("Primary author: Some author");
			}
			
		});
		
		book.getInfo();
		
		
	}
	
	
}