package adaptor_Pattern;

public class DuckTestDrive {
	public static void main(String[] args) {
		
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdaptor = new TurkeyAdaptor(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdaptor says...");
		testDuck(turkeyAdaptor);
		
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
