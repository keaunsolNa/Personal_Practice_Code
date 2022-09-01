package objectOrientedProgramming;

public class MyTemperature implements Temperature{
	private double celsius; //stores temperature as a Celsius value
	
	public MyTemperature(double value, char scale) {
		if(scale=='C') setCelsius(value);
		else setFahrenheit(value);
	}
	
	@Override
	public double getCelsius() {
		return celsius;
	}

	@Override
	public double getFahrenheit() {
		return 9*celsius/5 + 32.0;
	}

	@Override
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	@Override
	public void setFahrenheit(double fahrenheit) {
		this.celsius = 5*(fahrenheit -32)/9;
	}
	
	public String toString() {
		// Example: "25.0 C = 77.0 F"
		return round(getCelsius()) + " C = " + round(getFahrenheit()) + "F";
	}
	
	private double round(double x) {
		// returns x, rounded to one digit on the right of the decimal;
		return Math.round(10*x)/10.0;
	}

}
