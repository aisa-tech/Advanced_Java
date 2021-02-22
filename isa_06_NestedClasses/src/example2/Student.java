package example2;

public class Student {
	
	private int beginYear;
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int beginYear, String name) {
		this.beginYear = beginYear;
		this.name = name;
	}

	public void setBeginYear(int beginYear) {
		this.beginYear = beginYear;
	}
	public int getBeginYear() {
		return beginYear;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [beginYear=" + beginYear + ", name=" + name + "]";
	}
	
	
	
}
