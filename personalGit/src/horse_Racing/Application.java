package horse_Racing;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		Black_Horse bh = new Black_Horse();
		White_Horse wh = new White_Horse();
		Yellow_Horse yh = new Yellow_Horse();
		Scanner sc = new Scanner(System.in);
		Thread t1 = new Thread(bh);
		Thread t2 = new Thread(wh);
		Thread t3 = new Thread(yh);
		int money = 10000;
		System.out.println("주어진 예산은 10000원 입니다.");
		System.out.println("검은 말의 배당은 1.5배");
		System.out.println("휜 말의 배당은 1.3배");
		System.out.println("노란 말의 배당은 1.2배 입니다.");
		do {
			System.out.println("어떤 말의 마권을 구매하시겠습니까?");
			System.out.println("1. 검은 말");
			System.out.println("2. 휜 말");
			System.out.println("3. 노란 말");
			System.out.println("4. 게임 종료");
			int choise = sc.nextInt();
			if(choise == 4) {
				System.out.println("감사합니다. 안녕히가세요");
				return;
			} else if(choise == 1) {
				System.out.println("검은 말은 0~80m의 속도로 달립니다.");
			} else if(choise == 2) {
				System.out.println("휜 말은 0~90m의 속도로 달립니다.");
			} else if(choise == 3) {
				System.out.println("노랑 말은 0~100m의 속도로 달립니다.");
			} else {
				System.out.println("준비되지 않은 마권입니다.");
				continue;
			} 
			
			System.out.println("현재 예산은 " + money + "원 있습니다.");
			System.out.println("걸고 싶은 금액을 입력하세요");
			int choiseMoney = sc.nextInt();
			if (money >= choiseMoney) {
				System.out.println("경기시작");
				try {
					bh.black_horse_j = 0;
					wh.white_horse_j = 0;
					yh.yellow_horse_j = 0;
					t1.run();
					t2.run();
					t3.run();
					t1.join();
					t2.join();
					t3.join();
					for (int i = 1; i <= 1; i++) {
							if (bh.black_horse_j < wh.white_horse_j && bh.black_horse_j < yh.yellow_horse_j) {
								System.out.println("Black_Horse 우승!");
								if (choise == 1) {
									money += (choiseMoney*1.5);
								} else {
									money = (money - choiseMoney);
								}
								break;
							}
							if (wh.white_horse_j < bh.black_horse_j && wh.white_horse_j < yh.yellow_horse_j) {
								System.out.println("White_Horse 우승!");
								if (choise == 2) {
									money += (choiseMoney*1.3);
								} else {
									money = (money - choiseMoney);
								}
								break;
							}
							if (yh.yellow_horse_j < bh.black_horse_j && yh.yellow_horse_j < wh.white_horse_j) {
								System.out.println("Yellow_Horse 우승!");
								if (choise == 3) {
									money += (choiseMoney*1.2);
								} else {
									money = (money - choiseMoney);
								}
								break;
							}
							else {
								System.out.println("우승 말이 없습니다. 경기 무효!");
							}
						}
					System.out.println("경기 종료");
					System.out.println("현재 예산은 " + money + "원 있습니다.");
					System.out.println();

				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			} else if (money < choiseMoney) {
				System.out.println("가지고 있는 돈보다 많은 돈을 걸 수 없습니다.");
				continue;
			}
		} while (money > 0);
		System.out.println("더 이상 남은 돈이 없습니다....");
		System.out.println("게임 종료...");
		return;
	} // main method 종료
}