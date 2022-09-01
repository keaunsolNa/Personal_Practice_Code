package objectOrientedProgramming;

/**
 * An interface for representing temperatures, with functionality
 * for converting their values between Celsius and Fahrenheit.
 * @author keaunsolNa
 * @See MyTemperature
 */

public interface Temperature {
	
	/** @return the Celsius value for this temperature. */
	public double getCelsius();
	
	/** @return the Fahrenheit value for this temperature. */
	public double getFahrenheit();
	
	/** @param celsius the Celsius value for this temperature */
	public void setCelsius(double celsius);
	
	/** @param fahrenheit the Fahrenheit value for this temperature */
	public void setFahrenheit(double fahrenheit);
	
}
