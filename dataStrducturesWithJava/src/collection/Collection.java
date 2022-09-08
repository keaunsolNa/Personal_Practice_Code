package collection;

public interface Collection {
	public boolean add(Object object);
//	public boolean addAll(Collection collection);
	public void clear();
	public boolean contains(Object object);
//	public boolean contatinsAll(Collection collection);
//	public boolean equals(Object object);
//	public int hashCode();
	public boolean isEmpty();
	public Iterator iterator();
	public boolean remove(Object object);
//	public boolean removeAll(Collection collection);
//	public boolean retainAll(Collection collection);
	public int size();
//	public Object[] toArray();
//	public Object[] toArray(Object[] object);
	
}
