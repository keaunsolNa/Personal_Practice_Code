package command_Pattern;

public class GarageDoorUpCommand implements Command{
	GarageDoor garageDoor;
	
	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.doorUp();
	}

	@Override
	public void undo() {
		garageDoor.doorDown();
	}

}

