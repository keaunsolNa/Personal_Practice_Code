package monopoly;

import java.util.Scanner;

public class Monopoly_Citys {

	private int cost;
	private int toll;
	private boolean build = false;
	private int owner = 0;
	private String city;
	private int money;
	

	public Monopoly_Citys(int cost, int toll, boolean build, int owner, String city, int money) {
		this.cost = cost;
		this.toll = toll;
		this.build = build;
		this.owner = owner;
		this.city = city;
	}
	public Monopoly_Citys() {
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getToll() {
		return toll;
	}
	public void setToll(int toll) {
		this.toll = toll;
	}
	public boolean isBuild() {
		return build;
	}
	public void setBuild(boolean build) {
		this.build = build;
	}
	public int isOwner() {
		return owner;
	}
	public void setOwner(int owner) {
		this.owner = owner;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Monopoly_Citys [cost=" + cost + ", toll=" + toll + ", build=" + build + ", owner=" + owner + ", city="
				+ city + "]";
	}
	
	Application ap = new Application();
	
	
	public void citys() {
		Scanner sc = new Scanner(System.in);
		do {
			if(build != true) {
				System.out.println("현재 도시 " +city+ "은/는 주인이 없습니다.");
				System.out.println("건물을 건설하시겠습니까? 비용은 " +cost+ "원입니다.");
				System.out.println("건물을 건설하시려면 1번, 지나치시려면 2번을 누르세요.");
				System.out.println("현재 당신의 재산은 " +money+"원이 있습니다.");
				int yesornot = sc.nextInt();
				switch(yesornot) {
					case 1:  
						if(money>cost) {
							money -= cost;
							System.out.println("도시 " +city+ "에 건물을 세우셨습니다.");
							System.out.println("남은 재산은 " +money+"원입니다.");
							build = true;
							owner = 1;
							return;
						}else if(money<cost) {
							System.out.println("건물을 만들 돈이 모자랍니다.");
							return;
						}
					case 2:
						System.out.println("그냥 지나치기로 합니다.");
						return;
					default : System.out.println("잘못 누르셨습니다.");
					break;
				}
			} else if(build == true) {
				if(owner ==1) {
					System.out.println("현재 도시 " +city+ "의 주인은 당신입니다.");
					break;
				} else if(owner !=1) {
					System.out.println("타 플레이어의 도시에 도착했습니다.");
					System.out.println("통행료는 " +toll+ "원 입니다.");
					if(money>=toll) {
						money-=toll;
							System.out.println("통행료를 지불했습니다. 현재 남은 재산은 " +money+ "원입니다." );
							break;
					}else if(money<toll) {
						System.out.println("현재 당신의 재산은 " +money+ "원입니다.");
						System.out.println("지불할 돈이 없습니다. 파산!");
						ap.life = false;
						return;
					}
				}
			}
		} while(true);
		
		
	} //citys method end
	
	
	
} // Monopoly_citys class end

