package linkedStructures;

public class TestBigInt {
	public static void main(String[] args) {
		BigInt x = new BigInt(0);
		BigInt y = new BigInt(1);
		BigInt z = new BigInt(1);
		
		for(int i = 0; i < 100; i++) {
			x = y;
			y = z;
			z = x.plus(y);
			System.out.println(z);
		}
	}
}
