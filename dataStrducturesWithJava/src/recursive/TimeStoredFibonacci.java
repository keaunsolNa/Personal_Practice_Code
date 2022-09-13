package recursive;

public class TimeStoredFibonacci {

	public static void main(String[] args) {
		for(int i = 30; i <= 40; i++) {
			long t0 = System.currentTimeMillis();
			long m = Fibonacci.number(i);
			long t1 = System.currentTimeMillis();
			System.out.println("f(" + i + ") = " + m + " \ttime: " + (t1-t0));
		}
	}
}

class Fibonacci {
	private static long[] fib = new long[100];
	private static int lastFibindex = 2;
	
	static {		// class initializer
		fib[1] = fib[2] = 1;
	}
	
	public static long number(int n) {
		for(int i = lastFibindex+1; i<=n; i++)
			fib[i] = fib[i-1] + fib[i-2];
		if(n > lastFibindex) lastFibindex = n;
		return fib[n];
	}
}
