package collection;

import java.util.*;								// includes the Collections Framework

public class TestCollection {

	public static void main(String[] args) {
		String[] strings = {"CA", "US", "MX", "AR", "BR", "CH"};
		println(strings);
		ArrayList<String> list = new ArrayList<>(Arrays.asList(strings));
		System.out.println(list);
		list.add("VE");				System.out.println(list);
		ArrayList<String> list2 =
				new ArrayList<>(Arrays.asList(new String[] {"MX", "HN", "GT"}));
		System.out.println(list2);
		list.addAll(list2);			System.out.println(list);
		list.remove("MX");			System.out.println(list);
		System.out.println("list.containsAll(list2) = " + list.containsAll(list2));
		list.remove("HN");			System.out.println(list);
		System.out.println("LIST.containsAll(list2) = " + list.containsAll(list2));
		list.removeAll(list2);		System.out.println(list);
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList(new String[] {"BR", "US", "PE"}));
		System.out.println(list3);
		list.retainAll(list3);
		System.out.println(list);
		list.toArray(strings);
		println(strings);
		}
		
	public static void println(String[] a) {
		System.out.print("{" + a[0]);
		for(int i = 1; i < a.length; i++)
			System.out.print("," + a[i]);
		System.out.println("}");
	}
}
