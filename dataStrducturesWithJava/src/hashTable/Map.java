package hashTable;

public interface Map {

	public Object get(Object key);
	// RETURN: value;
	// POST: if value!=null, then (key, value) is in this map;
	//		 if value==null, then no record in this map has the given key;
	
	public Object put(Object key, Object value);
	// RETURN: oldValue;
	// POST: if oldValue==null, then (key, value) is in this map;
	//		 if oldValue!=null, then (key, oldValue) was in this map;
	
	public Object remove(Object key);
	// RETURN: oldValue;
	// POST: if oldValue==null, no record in this map has the given key;
	// 		 if oldValue!=null, then (key, oldValue) was in this map;
	
	public int size();
	// RETURN: n;
	// POST: this map contains n records;
	
}
