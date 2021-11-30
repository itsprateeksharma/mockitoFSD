package newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Java lambda expression can be used in the collection framework. 
 * It provides efficient and concise way to iterate, filter and fetch data.
 */
public class LambdaComparatorDemo {

	public static void main(String[] args) {
		
		Student s1=new Student(101, "Tim", 98);
		Student s2=new Student(102, "Joe", 75);
		Student s3=new Student(103, "Nick", 81);
		Student s4=new Student(104, "Rey", 92);
		
		//add students to ArrayList
		List<Student> sList=new ArrayList<Student>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		System.out.println("Sort students based on names :" );
		
		//implementing lambda expression to sort user defined 
		//objects using comparator interface's compareTo() method

		Collections.sort(sList,(st1,st2) -> {
			return st1.name.compareTo(st2.name);
		});
		
		for(Student s: sList)
		{
			System.out.println(s.rollNumber+" "+s.name+" "+s.marks);
		}
		
		//sort in descending order based on marks of a student
		System.out.println("----------Descending Order based on marks:");
		
		Collections.sort(sList,(st1,st2) -> {
			return st2.marks.compareTo(st1.marks);
		});
		//foreach() loop
		sList.forEach(s->System.out.println(s.rollNumber+" "+s.name+" "+s.marks));

		
		
	}

}
