package queue;

public class LinkedQueue implements Queue{
	private Node head = new Node(null);
	private int size;
	
	@Override
	public void add(Object object) {
		head.prev = head.prev.next = new Node(object, head.prev, head);
		++size;
	}
	
	@Override
	public Object first() {
		if(size == 0) throw new IllegalStateException("the queue is empty");
		return head.next.object;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public Object remove() {
		if(size == 0) throw new IllegalStateException("the queue is empty");
		Object object = head.next.object;
		head.next = head.next.next;
		head.next.prev = head;
		--size;
		return object;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	private static class Node{
		Object object;
		Node prev = this, next = this;
		
		Node(Object object){
			this.object = object;
		}
		
		Node(Object object, Node prev, Node next){
			this.object = object;
			this.prev = prev;
			this.next = next;
		}
	}
	
}
