package collection;

import java.util.Objects;

public abstract class AbstractCollection implements Collection{
	protected AbstractCollection() {
		
	}
	
	public boolean add(Object object) {
		throw new UnsupportedOperationException();
	}
	
//	public boolean addAll(Collection collection) {
//		return false;
//	}
	
//	public void clear() {
//		for(Iterator it = iterator(); it.hasNext();) {
//			it.next();
//			it.remove();
//		}
//	}
	
	public boolean contatins(Object object) {
		Iterator it = iterator();
		if(object == null) 
			while(it.hasNext()) {
				if(it.next() == null) return true;
			}
		else 
			while(it.hasNext())
				if(object.equals(it.next())) return true;
		
		return false;
	}
	
//	public boolean contatinsAll(Collection collection) {
//		return false;
//	}
	
	public boolean isEmpty() {
		return (size() == 0);
	}
	
	public abstract Iterator iterator();
	
	public boolean remove(Object object) {
		Iterator it = iterator();
		if(object == null)
			while(it.hasNext()) {
				if(it.next() == null) {
					it.remove();
					return true;
				}
			}
		else
			while(it.hasNext())
				if(object.equals(it.next())) {
					it.remove();
					return true;
				}
		return false;
	}
	
	public boolean removeAll(Collection collection) {
		boolean modified = false;
		for(Iterator it = iterator(); it.hasNext();)
			if(collection.contains(it.next())) {
				it.remove();
				modified = true;
			}
		return modified;
	}
	
//	public boolean retainAll(Collection collection) {
//		return false;
//		
//	}
	
	public abstract int size();
	
//	public Object[] toArray() {
//		return null;
//		
//	}
	
	public Object[] toArray(Object[] objects) {
		int n = size();
		if(objects.length < n) {
			Class objectsType = objects.getClass();
			Class componentType = objectsType.getComponentType();
			Object x = java.lang.reflect.Array.newInstance(componentType, n);
			objects = (Object[])x;
		}
		Iterator it = iterator();
		for(int i = 0; i < n; i++)
			objects[i] = it.next();
		if(objects.length > n) objects[n] = null;
		
		return objects;
	}
	
	public String toString() {
		if(isEmpty())return "[]";
		Iterator it = iterator();
		StringBuffer buf = new StringBuffer("[" + it.next());
		while(it.hasNext())
			buf.append(","+it.next());
		return(buf + "]");
	}
			
}
