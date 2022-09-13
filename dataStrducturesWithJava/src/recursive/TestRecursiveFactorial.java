package recursive;

public class TestRecursiveFactorial {
	public static void main(String[] args) {
		
		for(long i = 0; i < 20; i++) 
			System.out.println(i + "\t" + factorial(i));
		}
	
	
	static long factorial(long n) {
		if(n < 2) return 1;				// base
		return n*factorial(n-1);		// recursion
	}
}
