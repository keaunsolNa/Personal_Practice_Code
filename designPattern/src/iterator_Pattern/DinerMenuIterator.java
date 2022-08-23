package iterator_Pattern;

import java.util.Iterator;
import java.util.List;

public class DinerMenuIterator implements Iterator {
	MenuItem[] list;
	int position = 0;
  
	public DinerMenuIterator(MenuItem[] items) {
		this.list = items;
	}
	
	@Override
	public Object next() {
		MenuItem menuItem = list[position];
		position = position +1;
		return menuItem;
	}
  
	@Override
	public boolean hasNext() {
		if(position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
			("next()를 한 번도 호출하지 않은 상태에서는 삭제할 수 없습니다.");
		}
		
		if(list[position -1] != null) {
			for(int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}
 
}
