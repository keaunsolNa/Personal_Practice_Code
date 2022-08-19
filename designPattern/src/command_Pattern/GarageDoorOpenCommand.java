package command_Pattern;

public class GarageDoorOpenCommand implements Command{
	GarageDoor open;
	
	public GarageDoorOpenCommand(GarageDoor open) {
		this.open = open;
	}
	
	@Override
	public void execute() {
		open.doorUp();
	}

	@Override
	public void undo() {
		open.doorDown();
	}

}
