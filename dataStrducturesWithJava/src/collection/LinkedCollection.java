package collection;

public class LinkedCollection extends AbstractCollection{
	private static class Node{
		Object object;
		Node prev, next;
		Node() { prev = next = this;}
		Node(Object o, Node p, Node n){object = o; prev = p; next = n;}
	}
	
	private int size;
	private Node head = new Node();				// dummy head node
	
	public boolean add(Object object) {
		head.prev = head.prev.next = new Node(object, head.prev, head);
		++size;
		return true;							// no object is rejected
	}
	
	public Iterator iterator() {
		return new Iterator() {					// anonymous inner class
			private Node cursor = head.next;	// current element node
			private boolean okToRemove = false;
			public boolean hasNext() { return cursor != head;}
			public Object next() {
				if(cursor == head) throw new RuntimeException();
				okToRemove = true;
				Object object = cursor.object;
				cursor = cursor.next;
				return object;
			}
			public void remove() {
				if(!okToRemove) throw new IllegalStateException();
				cursor.prev = cursor.prev.prev;
				cursor.prev.next = cursor;
				--size;
				okToRemove = false;				// must call next() agina before remove();
						
			}
		};
	}
	public int size() {
		return size;
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
