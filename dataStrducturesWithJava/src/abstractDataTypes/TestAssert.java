package abstractDataTypes;

public class TestAssert {
	public static void main(String[] args) {
		assert 2 < 4;
		System.out.println("The assert statement is working");
	
		try {
			assert 4 < 4;
			System.out.println("this line should not execute");
		} catch(Error error) {
			System.out.println("Catching the " + error + " object");
		}
		
		System.out.println("The error was caught.");
		
	}
}
