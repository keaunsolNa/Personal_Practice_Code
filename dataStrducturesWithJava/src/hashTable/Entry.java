package hashTable;

public interface Entry {
	public Object getKey();
	// RETURN: key;
	// POST: key is the first object in this ordered pair;
	
	public Object getValue();
	// RETURN: value;
	// POST : value is the second object in this ordered pair;
	
	public void setValue(Object value);
	// POST: value is the second object in this ordered pair;
}
