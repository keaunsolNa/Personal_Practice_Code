package stack;

public class Location implements Cloneable{
	private int x, y;
	
	public Location(int x, int y) {
		
	}
	
	public Object clone() {
		return x;
		
	}
	
	public int getX() {
		return x;
		
	}
	
	public int getY() {
		
		return y;
	}
	
	public void move(int direction) {
		switch(direction) {
			case Direction.NORTH: --y; break;
			case Direction.EAST : ++x; break;
			case Direction.SOUTH : ++y; break;
			case Direction.WEST : --x; break;
		}
	}
	
	public Location adjacent(int direction) {
		switch(direction) {
			case Direction.NORTH : return new Location(x, y-1);
			case Direction.EAST : return new Location(x + 1, y);
			case Direction.SOUTH : return new Location(x, y+1);
			case Direction.WEST : return new Location(x -1, y);
		}
		return null;
	}
	
	public String toString() {
		
		return null;
	}
	
}
