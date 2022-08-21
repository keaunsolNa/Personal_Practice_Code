package adaptor_Pattern;

import java.util.Random;

public class DuckAddaptor implements Turkey{

	Duck duck;
	Random rand;
	
	public DuckAddaptor(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}
	
	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		if(rand.nextInt(5) == 0) {
			duck.fly();
		}
	}

}
