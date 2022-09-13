package recursive;

public class TestTrig {

	public static void main(String[] args) {
		for(double x = 0.0; x < 1.0; x+= 0.1)
			System.out.println(sin(x) + "\t" + Math.sin(x));
		for(double x = 0.0; x < 1.0; x+= 0.1)
			System.out.println(cos(x) + "\t" + Math.cos(x));
	}

	static double sin(double x) {
		if(-0.01 < x && x < 0.01) return x - x*x*x/6;		// base
		return 2*sin(x/2)*cos(x/2);							// recursion
	}
	
	static double cos(double x) {
		if(-0.01 < x && x < 0.01) return 1.0 - x*x/2;		// base
		return 1 - 2*sin(x/2)*sin(x/2);						// recursion
	}
}
