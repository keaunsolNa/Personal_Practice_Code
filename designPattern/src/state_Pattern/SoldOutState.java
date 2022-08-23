package state_Pattern;

public class SoldOutState implements State {

	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	
	@Override
	public void insertQuarter() {
		System.out.println("매진되었습니다.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("매진되었습니다.");
	}

	@Override
	public void turnCrank() {
		System.out.println("매진되었습니다.");
	}

	@Override
	public void dispense() {
		System.out.println("매진되었습니다. 알맹이가 나갈 수 없습니다.");
	}

}
