package objectOrientedProgramming;

public class Convert {
	public static void main(String[] args) {
		System.out.println("TEST");
		if(args.length != 2) exit();
		double value = Double.parseDouble(args[0]); // convert String
		char scale = Character.toUpperCase(args[1].charAt(0));
		if(scale != 'C' && scale != 'F')exit();
		Temperature temperature = new MyTemperature(value, scale);
		System.out.println(temperature);
	}
	
	private static void exit() {
		// prints usage message and then terminates the program;
		System.out.println(
				"Usage: java Convert <temperature> <scale>"
				+ "\nwhere:"
				+ "\t<temperature> is the temperature that you wnat to convert"
				+ "\n\t<scale> is either \"C\" or \"F\"."
				+ "\nExample: java Convert 67 F"
				);
		System.exit(0);
	}
}
