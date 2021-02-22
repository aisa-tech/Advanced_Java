package example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static  void main(String[] args) {
		
		Student stu1 = new Student(2009, "Isa ");
		Student stu2 = new Student(2010, "Ali ");
		Student stu3 = new Student(2009, "Veli ");
		Student stu4 = new Student(2011, "Ayse ");
		Student stu5 = new Student(2012, "Fatma ");
		Student stu6 = new Student(2010, "Melih ");
		
		
		List<Student>studentList = new ArrayList<Student>();
		
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		studentList.add(stu4);
		studentList.add(stu5);
		studentList.add(stu6);
		
		
		
		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
			
				return new Integer(o1.getBeginYear()).compareTo(o2.getBeginYear());
			}
	
		});
		
		System.out.println(studentList);
		System.out.println("------");
		
		
		Set<Student>stuSet = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return new Integer (o1.getBeginYear()).compareTo(o2.getBeginYear());
			}
			
			
		});
		
		System.out.println(studentList);
		
		
	}
}
