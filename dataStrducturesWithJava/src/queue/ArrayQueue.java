package queue;

public class ArrayQueue implements Queue {
	public Object[] a;
	private int size;
	
	public ArrayQueue() {
		
	}
	public ArrayQueue(int capacity) {
		a = new Object[capacity];
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	@Override
	public void add(Object object) {
		if(size == a.length) resize();
		a[size++] = object;
	}

	@Override
	public Object first() {
		if(size == 0) throw new IllegalStateException("Queue is empty");
		return a[size - 1];
	}

	@Override
	public Object remove() {
		if(size == 0) throw new IllegalStateException("Queue is empty");
		Object object = a[--size];
		a[size] = null;
		return object;
	}

	@Override
	public int size() {
		return size;
	}
	
	private void resize() {
		Object[] aa = a;
		a = new Object[2*aa.length];
		System.arraycopy(aa, 0, a, 0, size);
	}

}
