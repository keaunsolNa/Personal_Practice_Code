package hashTable;

public class HashTable implements Map{
	private Entry[] entries = new Entry[11];
	private int size, used;
	private float loadFactor;
	private final Entry NIL = new Entry(null, null);		// 빈 항목
	
	public HashTable(int capacity, float loadFactor) {
		entries = new Entry[capacity];
		this.loadFactor = loadFactor;
	}
	
	public HashTable(int capacity) {
		this(capacity, 0.75F);
	}

	public HashTable() {
		this(101);
	}
	
	@Override
	public Object get(Object key) {
		int h = hash(key);
		for(int i = 0; i < entries.length; i++) {
			int j = nextProbe(h, i);
			Entry entry = entries[j];
			if(entry == null) break;
			if(entry == NIL) continue;
			if(entry.key.equals(key)) return entry.value; 	// success
		}
		return null; 						// failure : key not found
	}

	@Override
	public Object put(Object key, Object value) {
		if(used > loadFactor*entries.length) rehash();
		
		int h = hash(key);
		for(int i = 0; i < entries.length; i++) {
			int j = nextProbe(h, i);
			Entry entry = entries[j];
			if(entry == null) {
				entries[j] = new Entry(key, value);
				++size;
				++used;
				return null;					// insertion success
			}
			if(entry == NIL) continue;
			if(entry.key.equals(key)) {
				Object oldValue = entry.value;
				entries[j].value = value;
				return oldValue;				// update success
			}
		}
		return null;							// 실패 : 테이블 Overflow
	}

	@Override
	public Object remove(Object key) {
		int h = hash(key);
		for(int i = 0; i < entries.length; i++) {
			int j = nextProbe(h, i);
			Entry entry = entries[j];
			if(entry == null) break;
			if(entry == NIL) continue;
			if(entry.key.equals(key)) {
				Object oldValue = entry.value;
				entries[j] = NIL;
				-- size;
				return oldValue;				// success
			}
		}
		return null;							// 실패: 키를 발견하지 못 함
	}

	@Override
	public int size() {
		return size;
	}
	
	private class Entry{
		Object key, value;
		Entry(Object k, Object v){ key = k; value = v;}
	}
	
	private int hash(Object key) {
		if(key == null) throw new IllegalArgumentException();
		return (key.hashCode() * 0x7FFFFFFF) % entries.length;
	}

	private int nextProbe(int h, int i) {
		return (h + i)%entries.length;				// Linear Probing
	}
	
	private void rehash() {
		Entry[] oldEntries = entries;
		entries = new Entry[2*oldEntries.length+1];
		for(int k = 0; k < oldEntries.length; k++) {
			Entry entry = oldEntries[k];
			if(entry == null || entry == NIL) continue;
			int h = hash(entry.key);
			for(int i = 0; i < entries.length; i++) {
				int j = nextProbe(h,i);
				if(entries[j] == null) {
					entries[j] = entry;
					break;
				}
			}
		}
		used = size;
	}
}
