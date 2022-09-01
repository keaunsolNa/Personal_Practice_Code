package objectOrientedProgramming;

public class TestPrimeAlgorithm {
	public static void main(String[] args) {
		for(int n = -100; n <= 100; n++) 
			if(isPrime(n)) System.out.println(n + " ");
	}
	
	public static boolean isPrime(int n) {
		
		if(n<2)return false;
		if(n<4)return true;
		if(n%2==0)return false;
		
		
		for(int d = 3; d*d <= n; d += 2 ) {
			if(n%d==0) return false;
		}
		return true;
	}
	
}
