package stack;

public class LinkedStack implements Stack{
	private Node top;
	private int size;
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	@Override
	public Object peek() {
		if(size == 0) throw new java.util.NoSuchElementException();
		return top.object;
	}
	
	@Override
	public Object pop() {
		if(size == 0) throw new java.util.NoSuchElementException();
		Object oldTop = top.object;
		top = top.next;
		--size;
		return oldTop;
	}
	@Override
	public void push(Object object) {
		top = new Node(object,top);
		++size;
	}

	@Override
	public int size() {
		return size;
	}
	
	private static class Node{
		Object object;
		Node next;
		Node(Object object, Node next){
			this.object = object;
			this.next = next;
		}
	}
	
}
