package horse_Racing;

public class White_Horse extends Horse implements Runnable{
	int white_horse_j = 0;
	
	@Override
	public int runningHorse() {
		int speed = (int)((Math.random()*90)) + 0;
		return speed;
	}
	
	@Override
	public void run() {
		White_Horse wh = new White_Horse();
		int i = 0;
		for(i = 0; i < 1000; i+=wh.runningHorse()) {
			System.out.println("🐴🐎 White_Horse가" + wh.runningHorse() + "km 속도로 질주 중!"); 
			white_horse_j++;
			continue;
		} if(i>=1000) {
		} System.out.println("------White_Horse가 " + white_horse_j + "번의 질주로 결승점에 도달합니다!------");
	}
}
