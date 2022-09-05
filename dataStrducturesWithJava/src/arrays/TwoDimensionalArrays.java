package arrays;

public class TwoDimensionalArrays {
	public static void main(String[] args) {
		int[][] a = new int[3][];					// an array of 3 sub-arrays(rows)
		a[0] = new int[] {22, 44, 66, 88};			// the first row
		a[2] = new int[] {33, 77};					// the third row
		System.out.println("a: " + a + "\na.length: " + a.length);
		IntArrays.print(a[0]);;
		IntArrays.print(a[2]);
		System.out.println("a[2].length: " + a[2].length);
		int[][] b = {{22, 44, 66, 88},				// the first row of b
					 {0, 0, 0, 0},					// the second row of b
					 {33, 55, 77, 0}};				// the third row of b
		System.out.println("b: " + b + "\nb.length: " + b.length);
		IntArrays.print(b[0]);
		IntArrays.print(b[2]);
		System.out.println("b[2].length: " + b[2].length);
	}
}
