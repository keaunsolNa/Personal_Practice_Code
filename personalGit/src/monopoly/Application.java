package monopoly;

import java.util.HashMap;
import java.util.Scanner;

public class Application {
	public int money;
	public static boolean life = true;
	
	
	public Application() {
	}
	public Application(int money, boolean life) {
		this.money = money;
		this.life = life;
	}
	@Override
	public String toString() {
		return "Application [money=" + money + ", life=" + life + "]";
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public boolean isLife() {
		return life;
	}
	public void setLife(boolean life) {
		this.life = life;
	}
	public static void main(String[] args) {

		/*
		 * 40칸짜리 10*4의 브루마블
		 * 각 칸마다 독립된 효과. 
		 * 4명의 플레이어 (유저 1, 컴퓨터3)
		 * 각각의 플레이어는 스레드로 관리.
		 * 3바퀴를 돌고 나서 
		 * 전역변수 money가 가장 많은 플레이어가 승리.
		 * 파산시 패배
		 * 각 칸마다 건물을 세울 수 있음
		 * 모든 건물은 랜드마크처럼 건설 후 재건설 불가 -> 스태틱 파이널 필드 변수
		 * 타 플레이어가 건설한 칸에 도착 시 일정 금액을 차감
		 * 차감한 돈은 건물 주인에게 지급
		 * 무인도, 세계여행(가능하다면) 
		 * 한 번의 행동은 6칸 주사위 랜덤 난수로 지정
		 * 행동의 구분은 스캐너로
		 * 유저가 건물의 주인인지 아닌지 어떻게 판단할 것인가?.
		 */
		Monopoly_Map map = new Monopoly_Map();
		Monopoly_Citys citys = new Monopoly_Citys();
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("O	O	O	O	O	O	O	O	O	O");
			System.out.println();
			System.out.println("O									O");
			System.out.println();
			System.out.println("O									O");
			System.out.println();
			System.out.println("O									O");
			System.out.println();
			System.out.println("O									O");
			System.out.println("				Monopoly!");
			System.out.println("O									O");
			System.out.println();
			System.out.println("O									O");
			System.out.println();
			System.out.println("O									O");
			System.out.println();
			System.out.println("O									O");
			System.out.println();
			System.out.println("O	O	O	O	O	O	O	O	O	O");

			int i =0;
			int dice = (int)(Math.random()*6) +1;
			
			for(i=0; i<30; i+=dice) {
				System.out.println("엔터키를 눌러 주사위를 던지세요!");
				sc.nextLine();
				map.setLocation(i);
				dice = (int)(Math.random()*6) +1;
				if(map.getLocation() == 0) {
					map.map0(); continue;
				} else if (map.getLocation() == 1) {
					map.map1(); continue;
				} else if (map.getLocation() == 2) {
					map.map2(); continue;
				} else if (map.getLocation() == 3) {
					map.map3(); continue;
				} else if (map.getLocation() == 4) {
					map.map4RandomCard(); continue;
				} else if (map.getLocation() == 5) {
					map.map5(); continue;
				} else if (map.getLocation() == 6) {
					map.map6(); continue;
				} 
				
			}; 
		}while(life == false);
		
	}

}
