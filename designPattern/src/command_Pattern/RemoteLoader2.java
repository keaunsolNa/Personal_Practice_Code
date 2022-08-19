package command_Pattern;

public class RemoteLoader2 {
	
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
		
		CeilingFanMediumCommand ceilingFanMediumCommand = 
				new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHighCommand = 
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
		
		remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOff);
		
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
	}
}
