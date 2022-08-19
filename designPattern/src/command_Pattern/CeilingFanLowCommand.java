package command_Pattern;

public class CeilingFanLowCommand implements Command{
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.low();
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
