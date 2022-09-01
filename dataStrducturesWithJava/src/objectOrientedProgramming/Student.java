package objectOrientedProgramming;

public class Student extends Person{ // Student inherits Person
	protected String country;		 // Student aggregates String
	protected int credits;
	protected double gpa;
	
	public Student(String name, boolean male, int yob, Phone phone, String country) {
		super(name, male, yob, phone);
		this.country = country;
	} 

}
