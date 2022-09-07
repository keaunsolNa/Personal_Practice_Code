package stack;

public class Maze {
	private int m, n;
	private int[][] a;
	private static final int OPEN = 0, WALL = 1, TRIED = 2, PATH = 3;
	
	public Maze(String file) {
		
	}
	
	public boolean isOpen(Location location) {
		return (a[location.getY()][location.getX()] == OPEN); 
	}
	
	public void markMoved(Location location) {
		a[location.getY()][location.getX()] = TRIED;
	}
	
	public void markTried(Location location) {
		a[location.getY()][location.getX()] = TRIED;
	}
	
	public int getWidth() {
		return n;
	}
	
	public int getHeight() {
		return m;
	}
	
	public void print() {
		char[] chars = {' ','+','?','o'};
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++)	
				System.out.println(chars[a[i][j]]);
			System.out.println();
		}
	}
}
