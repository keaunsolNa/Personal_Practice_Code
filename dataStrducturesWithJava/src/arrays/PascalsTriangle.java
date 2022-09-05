package arrays;

public class PascalsTriangle {

	public static void main(String[] args) {
		int rows = Integer.parseInt("7");
		int[][] a = init(rows);
		print(a);
	}
	
	static int[][] init(int n){
		int[][] a = new int[n][n];
		for(int i = 0; i < n; i++) 
			for(int j = 0; j <= i; j++) 
				if(j == 0 || j == i) a[i][j] = 1;
				else a[i][j] = a[i-1][j-1] + a[i-1][j];
		return a;
	}
	
	static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j <= i; j++)
				print(a[i][j], 5);
			System.out.println();
		}
	}
	
	static void print(int n, int w) {
		// prints n right - justified in a field on width w:
		String s = "" + n, blanks = "                        ";
		int len = s.length();
		System.out.print(blanks.substring(0, w-len) +s);
	}

}
