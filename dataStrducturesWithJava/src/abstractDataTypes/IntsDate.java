package abstractDataTypes;

public class IntsDate implements Date{
	private int day, month, year;
	
	public IntsDate(int year, int month, int day) {
		setDay(day);
		setMonth(month);
		setYear(year);	
	}
	
	@Override
	public int getDay() {
		return day;
	}

	@Override
	public int getMonth() {
		return month;
	}

	@Override
	public int getYear() {
		return year;
	}

	@Override
	public void setDay(int day) {
		if(day < 1 || day > 31) throw new IllegalArgumentException();
		this.day = day;
	}

	@Override
	public void setMonth(int month) {
		if(month < 1 || month > 12) throw new IllegalArgumentException();
		this.month = month;
	}

	@Override
	public void setYear(int year) {
		if(year < 1700 || year > 2100) throw new IllegalArgumentException();
		this.year = year;
	}
	
	@Override
	public String toString() {
		
		return "현재 날짜는 " + year + "년, " + month + "월, " + day + "일 입니다.";
	}

}
