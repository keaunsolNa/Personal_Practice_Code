package abstractDataTypes;

public interface Bag {
	public void add(Object object);
	public boolean contains(Object object);
	public Object getFirst();
	public Object getNext();
	public boolean remove(Object object);
	public int size();
	
}
