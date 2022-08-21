package adaptor_Pattern;

public class EnumerationIterator implements Iterator {

	Enumeration enums;
	
	public EnumerationIterator(Enumeration enums) {
		this.enums = enums;
	}
	
	@Override
	public boolean hasNext() {
		return enums.hasMoreElements();
	}

	@Override
	public Object next() {
		return enums.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
