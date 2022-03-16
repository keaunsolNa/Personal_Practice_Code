package horse_Racing;

public class Black_Horse extends Horse implements Runnable {
	int black_horse_j = 0;

	@Override
	public int runningHorse() {
		int speed = (int)((Math.random()*80)) + 0;
		return speed;
	}
	
	@Override
	public void run() {
		Black_Horse wh = new Black_Horse();
		int i = 0;
		for(i = 0; i < 1000; i+=wh.runningHorse()) {
			System.out.println("🐴🐎 Black_Horse가" + wh.runningHorse() + "km 속도로 질주 중!"); 
			black_horse_j++;
			continue;
		} if(i>=1000) {
		} System.out.println("------Black_Horse가 " + black_horse_j + "번의 질주로 결승점에 도달합니다!------");
	}  
}
