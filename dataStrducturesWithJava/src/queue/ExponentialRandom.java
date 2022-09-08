package queue;

import java.util.Random;

public class ExponentialRandom extends java.util.Random {
	private double mean;
	
	public ExponentialRandom(double mean) {
		super(System.currentTimeMillis());
		this.mean = mean;
	}
	
	public double nextDouble() {
		return -mean*Math.log(1.0-super.nextDouble());
	}
	
	public int nextInt() {
		return (int)Math.ceil(nextDouble());
	}
}
