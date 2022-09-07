package stack;

public class TestArrayStack {
	public static void main(String[] args) {
		Stack crates = new ArrayStack(4);
		crates.push("CARROTS");
		crates.push("ORANGES");
		crates.push("RAISINS");
		crates.push("PICKLES");
		crates.push("BANAANS");
		System.out.println("crates.size() : " + crates.size() + "\tcrates.peek() : " + crates.peek());
		
		System.out.println("crates.pop() : " + crates.pop());
		System.out.println("crates.pop() : " + crates.pop());
		System.out.println("crates.pop() : " + crates.pop());
		System.out.println("crates.size() : " + crates.size() + "\tcrates.peek() : " + crates.peek());
		
		crates.push("WALNUS");
		crates.push("OYSTERS");
		System.out.println("crates.size() : " + crates.size() + "\tcrates.peek() : " + crates.peek());
		System.out.println("crates.pop() : " + crates.pop());
		System.out.println("crates.pop() : " + crates.pop());
		System.out.println("crates.pop() : " + crates.pop());
		System.out.println("crates.pop() : " + crates.pop());
		System.out.println("crates.pop() : " + crates.pop());
		
	}
}
