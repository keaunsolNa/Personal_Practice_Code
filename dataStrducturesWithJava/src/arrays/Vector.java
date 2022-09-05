package arrays;

public class Vector {
	protected Object[] objects;					// backing array
	protected int size;							// actual number of Objects stored
	protected static final int CAPACITY=10;		// default array length
	
	public Vector(int capacity) {
		if(capacity <=0) throw new IllegalArgumentException("capacity<=0");
		objects = new Object[capacity];
	}
	
	public Vector() {
		this(CAPACITY);
	}
	
	public int size() {
		return size;
	}
	
	protected void resize() {
		int n = objects.length;
		Object[] temp = new Object[2*n];
		System.arraycopy(objects, 0, temp, 0, n);
		objects = temp;
	}
	
	public String toString() {
		if(size == 0)return "()";
		StringBuffer buf = new StringBuffer("(" + objects[0]);
		for(int i = 1; i < size; i++)
			buf.append("," + objects[i]);
		return buf + ")";
	}
	
	public Vector(Object[] a) {
		int n = a.length;
		objects = new Object[2*n];
		System.arraycopy(a, 0, objects, 0, n);
		size = n;
	}
	
	public static void main(String[] args) {
		Vector v  = new Vector(args);
		System.out.println(v);
	}
}
