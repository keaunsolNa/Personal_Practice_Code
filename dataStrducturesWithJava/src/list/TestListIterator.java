package list;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
	public static void main(String[] args) {
		String[] countries = {"AT", "DE", "ES","FR"};
		List list = Arrays.asList(countries);
		System.out.println("list: " + list);
		ListIterator it = list.listIterator();
		System.out.println("it.nextIndex() : " + it.nextIndex());
		System.out.println("it.next() : " + it.next());
		System.out.println("it.nextIndex() : " + it.nextIndex());
		System.out.println("it.next() : " + it.next());
		System.out.println("it.nextIndex() : " + it.nextIndex());
		System.out.println("it.next() : " + it.next());
		System.out.println("it.previousIndex() : " + it.previousIndex());
		System.out.println("it.previous() : " + it.previous());
		System.out.println("it.previousIndex() : " + it.previousIndex());
		System.out.println("it.previous() : " + it.previous());
	}
}
