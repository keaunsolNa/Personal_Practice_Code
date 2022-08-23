package iterator_Pattern;

import java.util.Iterator;
import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterable {

	MenuItem[] items;
	int position;
	
	public AlternatingDinerMenuIterator(MenuItem[] items) {
		this.items = items;
		Calendar rightNow = Calendar.getInstance();
		position = rightNow.DAY_OF_WEEK % 2;
	}
	
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 2;
		return menuItem;
	}
	
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public void remove() {
		throw new UnsupportedOperationException(
				"remove()는 지원하지 않습니다.");
		
	}
	
	
	
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
