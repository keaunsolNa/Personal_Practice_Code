package collection;

public class ArrayCollection extends AbstractCollection{
	private final int INITIAL_LENGTH = 16;
	private int size;
	private Object[] a = new Object[INITIAL_LENGTH];
	
	public boolean add(Object object) {
		if(size == a.length)resize();
		a[size++] = object;
		return true;					// no object is rejected
	}
	
	@Override
	public Iterator iterator() {
		return new Iterator() {				// anonymous inner class
			private int i = 0;						// index of current element
			private boolean okToRemove = false;
		
			public boolean hasNext() {
				return (i < size);
			}
			
			public Object next() {
				if(i == size) throw new RuntimeException();
				okToRemove = true;
				return a[i++];
			}
			
			public void remove() {
				if(!okToRemove)	throw new IllegalStateException();
				a[--i] = a[--size];
				a[size] = null;
				okToRemove = false;						// must call next() again before remove();
			}
		};												// note the required semicolon, ending the return statement
	}
	
	@Override
	public int size() {
		return size;
	}
	
	public void resize() {
		Object[] aa = new Object[2*a.length];
		System.arraycopy(a, 0, aa, 0, size);
		a = aa;
	}
	
	@Override
	public boolean contains(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}


}
