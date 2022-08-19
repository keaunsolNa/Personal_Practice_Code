package command_Pattern;

public class RemoteLoader3 {
	
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
		
		
		LightOnCommand lightOn = 
				new LightOnCommand(light);
		LightOffCommand lightOff = 
				new LightOffCommand(light);
		StereoOnWithCDCommand stereoOn = 
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = 
				new StereoOffCommand(stereo);
		TVOnCommand tvOn = 
				new TVOnCommand(tv);
		TVOffCommand tvOff = 
				new TVOffCommand(tv);
		HottubOnCommand hottubOn = 
				new HottubOnCommand(hottub);
		HottubOffCommand hottubOff = 
				new HottubOffCommand(hottub);
		
		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On -----");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Undo -------");
		remoteControl.undoButtonWasPushed();
		System.out.println("--- Pushing Macro On -----");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off-----");
		remoteControl.offButtonWasPushed(0);
		
	
	}
}
