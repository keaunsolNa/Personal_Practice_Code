package compound_Pattern;

public class DuckCall implements Quackable{
	Observable observable;
	
	public DuckCall() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}


	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "Duck Call";
	}

}
