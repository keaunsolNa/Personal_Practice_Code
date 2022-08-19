package command_Pattern;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location = "";
	int speed;
	
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}

	public void high() {
		speed = HIGH;
		System.out.println(location + " ceilingFan is on HIGH Speed");
	}
	
	public void medium() {
		speed = MEDIUM;
		System.out.println(location + " ceilingFan is on MEDIUM Speed");
	}
	
	public void low() {
		speed = LOW;
		System.out.println(location + " ceilingFan is on LOW Speed");
	}
	
	public void off() {
		speed = OFF;
		System.out.println(location + " ceilingFan is off");
	}
	
	public int getSpeed() {
		return speed;
	}
		
		
	public void on() {
		System.out.println(location + "CeilingFan is On");
	}



}
