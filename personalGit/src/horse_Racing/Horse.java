package horse_Racing;

public class Horse extends Thread{

	public int runningHorse() {
		
		int speed = (int)((Math.random()*100)) + 0;
		return speed;
	}
	
	@Override
	public void run() {
	}
}
