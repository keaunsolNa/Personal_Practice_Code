package linkedStructures;

public class Main {
	private static int m = 22;
	
	public Main() {
		Nested nested = new Nested();
		System.out.println("Outside of Nested; nested.n = " + nested.n);
		nested.f();
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
	private static class Nested {
		private int n = 44;
		
		private void f() {
			System.out.println("inside of Nested; m =" + m);
		}
	}

}
