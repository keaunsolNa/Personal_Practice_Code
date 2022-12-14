package command_Pattern;

public class CeilingFanOffCommand implements Command{
	CeilingFan ceilingFan;
	int prevSpeed;
	
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}

	public void undo() {
		if(prevSpeed == ceilingFan.HIGH) {
			ceilingFan.high();
		} else if(prevSpeed == ceilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if(prevSpeed == ceilingFan.LOW) {
			ceilingFan.low();
		} else if(prevSpeed == ceilingFan.OFF) {
			ceilingFan.off();
		}
	}
}
