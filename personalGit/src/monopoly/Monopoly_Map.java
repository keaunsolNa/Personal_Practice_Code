package monopoly;

import java.util.HashMap;

public class Monopoly_Map  extends Monopoly_Citys  {

	private int round =1;
	private int location;
	public Monopoly_Map() {
	}
	public Monopoly_Map(int round, int location) {
		this.round = round;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Monopoly_Map [round=" + round + ", location=" + location + "]";
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}

	Monopoly_Citys citys = new Monopoly_Citys();
	Application ap = new Application();
	
	public int map0() {
		System.out.println("map0");
		citys.setMoney(100000000);
		
		
		return (location=0);
	}
	
	public int map1(){
		citys.setCity("인천");
		citys.setCost(20000000);
		citys.setToll(8000000);
		citys.citys();
		return location=1;
	}
	
	public int map2(){
		citys.setCity("서울");
		citys.setCost(50000000);
		citys.setToll(2200000);
		citys.citys();
		return location=2;
	}
	
	public int map3() {
		citys.setCity("경기");
		citys.setCost(30000000);
		citys.setToll(1300000);
		citys.citys();
		return location=3;
	}
	
	public String map4RandomCard() {
		return null;
		
	}
	
	public int map5() {
		citys.setCity("뉴욕");
		citys.setCost(40000000);
		citys.setToll(1800000);
		citys.citys();
		return location=5;
	}
	
	public int map6() {
		citys.setCity("워싱턴");
		citys.setCost(48000000);
		citys.setToll(2100000);
		citys.citys();
		return location=6;
		
	}
	
	
} // class end
