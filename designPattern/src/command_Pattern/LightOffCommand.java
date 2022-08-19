package command_Pattern;

public class LightOffCommand implements Command{
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
}
