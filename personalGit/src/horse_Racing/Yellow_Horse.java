package horse_Racing;

public class Yellow_Horse extends Horse implements Runnable {
	public int yellow_horse_j = 0;
	
	@Override
	public int runningHorse() {
		int speed = (int)((Math.random()*100)) + 0;
		return speed;
	}
	
	@Override
	public void run() {
		Yellow_Horse wh = new Yellow_Horse();
		int i = 0;
		for(i = 0; i < 1000; i+=wh.runningHorse()) {
			System.out.println("🐴🐎 Yellow_Horse가" + wh.runningHorse() + "km 속도로 질주 중!"); 
			yellow_horse_j++;
			continue;
		} if(i>=1000) {
		} System.out.println("------Yellow_Horse가 " + yellow_horse_j+ "번의 질주로 결승점에 도달합니다!------");
	}
}
