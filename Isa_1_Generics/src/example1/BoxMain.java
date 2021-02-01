package example1;

public class BoxMain {
	
	public static void main(String[] args) {
		
		Box<Integer,Integer> intBox = new Box<>(23,45);
		Box<Student,Integer> stuBox = new Box<>(new Student(),45);
		
		
		intBox.getInfo();
		stuBox.getInfo();
		
		
	}

}
