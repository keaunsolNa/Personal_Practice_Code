package command_Pattern;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
//		Light light = new Light();
//		GarageDoor garageDoor = new GarageDoor();
//		LightOnCommand lightOn = new LightOnCommand(light);
//		GarageDoorOpenCommand garageOpen = 
//				new GarageDoorOpenCommand(garageDoor);
		
		
//		remote.setCommand(lightOn);
		remote.buttonWasPresses();
//		remote.setCommand(garageOpen);
		remote.buttonWasPresses();
	}
}
