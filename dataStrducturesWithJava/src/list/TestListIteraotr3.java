package list;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class TestListIteraotr3 {
	public static void main(String[] args) {
		String[] countries = {"AT","DE","ES","FR"};
		List<String> list = Arrays.asList(countries);
		System.out.println("list : " + list);
		ListIterator<String> it = list.listIterator();
		it.next();
		it.next();
		it.set("CZ");				// change DE to CZ
		System.out.println("list: " + list);
		System.out.println("countries[1]: " + countries[1]);
		countries[3] = "GB";		// change FR to GB
		System.out.println("list : " + list);
		
	}
}
