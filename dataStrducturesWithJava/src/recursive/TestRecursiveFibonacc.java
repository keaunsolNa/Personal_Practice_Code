package recursive;

public class TestRecursiveFibonacc {

	public static void main(String[] args) {
		for(int i = 30; i <= 40; i++) {
			long t0 = System.currentTimeMillis();
			long m = f(i);
			long t1 = System.currentTimeMillis();
			System.out.println("f(" + i + ") = " + m + " \ttime: " + (t1-t0));
		}
		
		for(int i = 30; i <= 40; i++) {
			long t0 = System.currentTimeMillis();
			long m = f2(i);
			long t1 = System.currentTimeMillis();
			System.out.println("f(" + i + ") = " + m + " \ttime: " + (t1-t0));
		}
	}
	
	static long f(int n) {
		if(n < 1) return 0;			// base
		if(n < 3) return 1;			// base
		return f(n-1) + f(n-2);		// recursion
	}

	static long f2(int n) {
		if(n<2) return n;
		long f0 = 0, f1=1, f2=1;
		for( int i = 2; i < n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f1 + f0;
		}
		return f2;
	}
}
