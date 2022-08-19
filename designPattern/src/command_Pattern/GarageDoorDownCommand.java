package command_Pattern;

public class GarageDoorDownCommand implements Command{
	GarageDoor garageDoor;
	
	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.doorDown();
	}

	@Override
	public void undo() {
		garageDoor.doorUp();
	}

}