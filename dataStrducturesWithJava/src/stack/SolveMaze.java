package stack;

public class SolveMaze {
	Maze maze;
	Rat rat;
	Stack stack;
	
	public static void main(String[] args) {
		new SolveMaze(args[0]);
	}
	
	public SolveMaze(String file) {
		maze = new Maze(file);
		rat = new Rat(maze);
		stack = new ArrayStack(0);
		maze.print();
		while(!rat.isOut()) {
			Location currentLocation = rat.getLocation();
		}
	}
}
