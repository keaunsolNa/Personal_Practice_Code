package arrays;

public class TestSequentialSearch {
	
	public static void main(String[] args) {
		int[] a = {66, 44, 99, 33, 55, 22, 88, 77};
		System.out.println("search(a, " + 55 + "): " + search(a, 55));
		System.out.println("search(a, " + 50 + "): " + search(a, 50));
	}
	
	public static int search(int[] a, int target) {
		for(int i = 0; i < a.length; i++)
			if(a[i] == target) return i;
		return -a.length;
	}
}
