package objectOrientedProgramming;

public class Person {
	// INVARIANT: all instances are immutable;
	protected final boolean male;
	protected final String name;
	protected final Phone phone;
	protected final int yob;
	
	public Person(String name, boolean male, int yob, Phone phone) {
		this.name = name;
		this.male = male;
		this.yob = yob;
		this.phone = new Phone(phone);
	}
	public Person(String name, boolean male, int yob, Person friend) {
		this.name = name;
		this.male = male;
		this.yob = yob;
		this.phone = friend.phone;
	}

	public  String getName() {
		return name;
	}

	public Phone getPhone() {
		return phone;
	}
	
	public int getYob() {
		return yob;
	}

	public boolean isMale() {
		return male;
	}
	



	
	
	
	
}
