package list;

public class TestContiguousList {

	public static void main(String[] args) {
		java.util.List<String> g8 = new ContiguousList();
		g8.add("CA");					// Canada
		g8.add("DE");					// Germany
		g8.add("FR");					// France
		g8.add("GB");					// Great Britain
		g8.add("IT");					// Italy
		g8.add("RU");					// Russia
		g8.add("US");					// United States
		System.out.println(g8);
		g8.add(5, "JP");				// Japan
		System.out.println(g8);
		System.out.println("g8.size() : " + g8.size());
		System.out.println("g8.contains(\"JP\") : " + g8.contains("JP"));
		System.out.println("g8.contains(\"CN\") : " + g8.contains("CN"));
		System.out.println("g8.get(3): " + g8.get(3));
		System.out.println("g8.subList(3, 6): " + g8.subList(3, 6));
		g8.remove(6);
		System.out.println(g8);
		System.out.println("g8.set(0,\"CN\"): " + g8.set(0, "CN"));	// China
		System.out.println(g8);
		
	}

}
