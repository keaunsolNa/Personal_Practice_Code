package state_Pattern;

public class GumballMachine {

	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		
		this.count = numberGumballs;
		if(numberGumballs > 0) {
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	
	public final State getSoldOutState() {
		return soldOutState;
	}

	public final State getNoQuarterState() {
		return noQuarterState;
	}

	public final State getHasQuarterState() {
		return hasQuarterState;
	}

	public final State getSoldState() {
		return soldState;
	}

	public final State getWinnerState() {
		return winnerState;
	}

	public final State getState() {
		return state;
	}

	public final int getCount() {
		return count;
	}

	void releaseBall() {
		System.out.println("알맹이가 나가고 있습니다");
		if(count != 0) {
			count = count -1;
		}
		
	}
}
