package command_Pattern;

public class Stereo {

	String location = "";
	
	public Stereo(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println(location + "Stereo is On");
	}

	public void setCD() {
		System.out.println(location + "Stereo CD is Set");
	}

	public void setVolume(int i) {
		System.out.println(location + "Stereo Volume is 11");
	}

	public void off() {
		System.out.println(location + "Stereo is Off");
	}

	public void outCD() {
		System.out.println(location + "Stereo CD is Out");
	}

}
