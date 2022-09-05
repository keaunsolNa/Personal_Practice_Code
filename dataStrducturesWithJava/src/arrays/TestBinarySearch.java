package arrays;

public class TestBinarySearch {

	public static void main(String[] args) {
		int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
		System.out.println("search(a, " + 55 + "): " + search(a, 55));
		System.out.println("search(a, " + 50 + "): " + search(a, 50));
	}
	
	static int search(int[] a, int x) {
		int p = 0, q = a.length-1;
		while(p <= q) {						// search the segment a[p...q]
			int i = (p+q)/2;				// index of element in the middle
			System.out.println("i : " + i);
			if(a[i] == x) return i;
			if(a[i] < x) p = i+1;			// search upper half
			else q = i -1;					// search lower half
		}
		return -p-1;						// not found
	}

}
