package collection;

public class TestArrayCollection {

	public static void main(String[] args) {
		String[] strings = {"CH", "JP", "IN", "ID", "AU", "NZ"};
		Collection bag = new ArrayCollection();
		for(int i = 0; i < strings.length; i++)
			bag.add(strings[i]);
		System.out.println(bag);
		bag.add("JP");
		bag.add("TH");
		System.out.println(bag);
		for(Iterator it = bag.iterator(); it.hasNext();) 
			System.out.print(it.next() + " ");
		System.out.println();
		if(bag.remove("KR")) System.out.println(bag);
		else System.out.println("\"KR\" not found");
		if(bag.remove("JP")) System.out.println(bag);
		else System.out.println("\"JP\" not found");
		Iterator it = bag.iterator();
		it.next();
		it.next();
		it.remove();
		System.out.println(bag);
		it.next();
		it.next();
		it.next();
		it.remove();
		System.out.println(bag);
	}

}
