package singleton_Pattern;

public class ChocolateBoilerSingleton {
	private boolean empty;
	private boolean boiled;

	private static ChocolateBoilerSingleton uniqueInstance;
	
	private ChocolateBoilerSingleton() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoilerSingleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new ChocolateBoilerSingleton();
		}
		return uniqueInstance;
	}
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			
			empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
