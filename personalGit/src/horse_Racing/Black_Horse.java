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
			System.out.println("๐ด๐ Black_Horse๊ฐ" + wh.runningHorse() + "km ์๋๋ก ์ง์ฃผ ์ค!"); 
			black_horse_j++;
			continue;
		} if(i>=1000) {
		} System.out.println("------Black_Horse๊ฐ " + black_horse_j + "๋ฒ์ ์ง์ฃผ๋ก ๊ฒฐ์น์ ์ ๋๋ฌํฉ๋๋ค!------");
	}  
}
