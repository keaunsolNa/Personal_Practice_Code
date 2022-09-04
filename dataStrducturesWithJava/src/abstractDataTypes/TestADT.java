package abstractDataTypes;

public class TestADT {
	public static void main(String[] args) {
		
		Bag bag = new ArrayBag();
		System.out.println("ADD 전");
		bag.add("CA");
		bag.add("US");
		bag.add("MX");
		bag.add("RU");
		bag.add("US");
		bag.add("MX");
		
		System.out.println("ADD 후");
		bag.remove("US");
		System.out.println("REMOVE 후");
		
		IntsDate date = new IntsDate(1997, 10, 4);
		System.out.println(date.toString());
	}
}
