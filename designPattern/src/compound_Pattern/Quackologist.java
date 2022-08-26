package compound_Pattern;

public class Quackologist implements Observer{

	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " jst quacked.");
	}

}
