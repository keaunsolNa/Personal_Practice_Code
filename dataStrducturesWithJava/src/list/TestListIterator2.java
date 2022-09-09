package list;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] {"AT", "DE", "ES", "FR"});
		System.out.println("list : " + list);
		ListIterator<String> it = list.listIterator();
		System.out.println("it.next() :" + it.next());
		System.out.println("it.next() :" + it.next());
		System.out.println("it.previous() :" + it.previous());
		System.out.println("it.next() :" + it.next());
		System.out.println("it.next() :" + it.next());
		System.out.println("it.previous() :" + it.previous());
		System.out.println("it.previous() :" + it.previous());
		System.out.println("it.previous() :" + it.previous());
		System.out.println("it.hasPrevious() : " + it.hasPrevious());
		System.out.println("it.hasNext() : " + it.hasNext());
	}
}
