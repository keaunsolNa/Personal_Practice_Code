package hashTable;

public class Country {
	public String name, language;
	public int area, population;
	
	public Country(String n, String l, int a, int p) {
		name = n; language = l; area = a; population = p;
	}
	
	public String toString() {
		return "(" + name + ", " + language + ", " + area + "," + population + ")"; 
	}
}
