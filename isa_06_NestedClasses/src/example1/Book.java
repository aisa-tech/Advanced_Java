package example1;

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private static int GENERATOR;
	private String title;
	private int year;
	private Author author;
	
	private Page introPage;
	
	private List<Page>pages = new ArrayList<Page>();
	
	
	private Chapter introChapter;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, int year, Chapter introChapter) {
		super();
		this.title = title;
		this.year = year;
		this.introChapter = introChapter;


	}
	public void addPage(Page page) {
		this.pages.add(page);
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Page getIntroPage() {
		return introPage;
	}

	public void setIntroPage() {
		this.introPage = introPage;
	}

	public List<Page> getPage() {
		return pages;
	}

	public void setPage(List<Page> pages) {
		this.pages = pages;
	}
	
	 class ColorPage implements Page{
		 
		 private String color;
		
		public ColorPage(String color) {
			this.color = color;
		}



		@Override
		public void getContent() {
		System.out.println("Intro page,color : " + color );
			
		}
			
	}
	 
	 ColorPage iColor = new ColorPage("Blue");
	 
	 public void getInfo() {
		 System.out.println("Book : ");
		 System.out.println(title);
		 
		System.out.println(introChapter.chapterTitle);
	 }
	public class Chapter {
		
		private int no;
		private String chapterTitle;
		
		public Chapter() {
		
		}

		public Chapter(int no, String chapterTitle) {
			super();
			this.no = no;
			this.chapterTitle = chapterTitle;
		}

		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}

		public String getChapterTitle() {
			return chapterTitle;
		}

		public void setChapterTitle(String chapterTitle) {
			this.chapterTitle = chapterTitle;
		}
		
		
		
		
	}
	

}
