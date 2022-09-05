package arrays;

public class ObjectArray {

	public static void main(String[] args) {
		String s = "Mercury";
		Float x = new Float(3.14159);
		java.util.Date d = new java.util.Date();
		int[] a = new int[] {11, 33, 55, 77, 99};
		Object[] object = {s, x, d, a};
		print(object);
	}
	
	static void print(Object[] a) {
		System.out.print("{" + a[0]);
		for(int i = 1; i < a.length; i++)
			System.out.print(", " + a[i]);
		System.out.println("}");
		if(a[0] instanceof String)
			System.out.println(((String)a[0]).charAt(6));
		if(a[1] instanceof Float)
			System.out.println(((Float)a[1]).isNaN());
		if(a[2] instanceof java.util.Date)
			System.out.println(((java.util.Date)a[2]).getTime());
		if(a[3] instanceof int[])
			System.out.println(((int[])a[3]).length);
	}

}
