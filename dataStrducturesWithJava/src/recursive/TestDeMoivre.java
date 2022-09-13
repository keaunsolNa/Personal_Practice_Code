package recursive;

public class TestDeMoivre {
	private static final double SR5 = Math.sqrt(5);		// 2.2360679774997896
	private static final double PH1 = (1 + SR5)/2;		// 1.6180339887498948
	private static final double PS1 = (1 - SR5)/2;		// -0.6180339887498948
	
	public static void main(String[] args) {
		for (int n = 0; n <= 10; n++)
			System.out.println("f(" + n + ") = " + f(n));
		for(int n = 30; n <= 40; n++) {
			long t0 = System.currentTimeMillis();
			long m = f(n);
			long t1 = System.currentTimeMillis();
			System.out.println("f(" + n + ") = " + m + "\ttime: " + (t1-t0));
		}
	}
	
	static long f(int n) {
		return (long)((Math.pow(PH1,n) - Math.pow(PS1, n))/SR5);
	}
}
