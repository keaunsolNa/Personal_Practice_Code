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
			System.out.println("๐ด๐ White_Horse๊ฐ" + wh.runningHorse() + "km ์๋๋ก ์ง์ฃผ ์ค!"); 
			white_horse_j++;
			continue;
		} if(i>=1000) {
		} System.out.println("------White_Horse๊ฐ " + white_horse_j + "๋ฒ์ ์ง์ฃผ๋ก ๊ฒฐ์น์ ์ ๋๋ฌํฉ๋๋ค!------");
	}
}
