package objectOrientedProgramming;

public class TestPerson {
	public static void main(String[] args) {
		Phone p = new Phone("804", "3790550");
		Person john = new Person("John Adams", true, 1980, p);
		System.out.println(john);

		System.out.println(john.getName());
		
		Person jane = new Person("Jane Adams", false, 1981, john);
		System.out.println(jane);
		john = null;
		System.out.println(jane);
		
	}
}
