package hashTable;

public class TestMap {
	public static void main(String[] args) {
		java.util.Map<String, Country> map = new java.util.HashMap<>();
		map.put("AT", new Country("Austria", "German", 32378, 8139299));
		map.put("BE", new Country("Belgium", "Dutch", 11800, 10182034));
		map.put("DK", new Country("Denmark", "Danish", 16639, 5356845));
		map.put("FR", new Country("France", "Faench", 211200, 58978172));
		map.put("GR", new Country("Greece", "Greek", 50900, 10707135));
		map.put("IE", new Country("Ireland", "English", 27100, 3632944));
		map.put("IT", new Country("Italy", "Italian", 116300, 56735130));
		map.put("ES", new Country("Spain", "Spanish", 194880, 39167744));
		System.out.println("map.keySet(): " + map.keySet());
		System.out.println("map.size(): " + map.size());
		System.out.println("map.get(\"ES\") : " + map.size());
		Country es = (Country)map.get("ES");
		es.population = 400000000;
		System.out.println("map.get(\"ES\"): " + map.get("ES"));
		System.out.println("map.remove(\"ES\"): " + map.remove("ES"));
		System.out.println("map.get(\"ES\"): " + map.get("ES"));
		System.out.println("map.keySet(): " + map.keySet());
		System.out.println("map.size(): " + map.size());
	}
		
}
