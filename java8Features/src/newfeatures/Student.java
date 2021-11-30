package newfeatures;

public class Student {
	
	Integer rollNumber;
	String name;
	Double marks;
	
	public Student(Integer rollNumber, String name, int marks) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = (double) marks;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public Double getMarks() {
		return marks;
	}
	
	
	
	

}
