package command_Pattern;

public class GarageDoor {
	
	String location = "";
	
	public GarageDoor(String location) {
		this.location = location;
	}
	public void doorUp() {
		System.out.println(location + "Door is Up");
	}

	public void doorDown() {
		System.out.println(location + "Door is Down");
	}

}
