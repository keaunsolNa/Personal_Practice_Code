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
			System.out.println("๐ด๐ Yellow_Horse๊ฐ" + wh.runningHorse() + "km ์๋๋ก ์ง์ฃผ ์ค!"); 
			yellow_horse_j++;
			continue;
		} if(i>=1000) {
		} System.out.println("------Yellow_Horse๊ฐ " + yellow_horse_j+ "๋ฒ์ ์ง์ฃผ๋ก ๊ฒฐ์น์ ์ ๋๋ฌํฉ๋๋ค!------");
	}
}
