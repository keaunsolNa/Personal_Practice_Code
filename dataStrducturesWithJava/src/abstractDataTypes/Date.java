package abstractDataTypes;

public interface Date {
	/**
	 * @return the day number of this date.
	 */
	public int getDay();

	/**
	 * @return the month number of this date.
	 */
	public int getMonth();
	
	/**
	 *  @return the year number of this date.
	 */
	public int getYear();
	
	/**
	 * Sets the day number of this date to the given month value.
	 * @throws IllegalArgumentException if day < 1 or day > 31.
	 */
	public void setDay(int day);
	
	/**
	 * Sets the month number of this date to the given month value.
	 * @throws IllegalArgumentException if month < 1 or month > 12.
	 */
	public void setMonth(int month);
	
	/**
	 * Sets the year number of this date to the given month value.
	 * @throws IllegalArgumentException if year < 1700 or year > 2100.
	 */
	public void setYear(int year);
	
	String toString(); 
}
