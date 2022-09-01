package objectOrientedProgramming;

public class Phone {
	private String areaCode, number;
	
	public Phone(Phone that) {
		this.areaCode = that.areaCode;
		this.number = that.number;
	}
	
	public Phone(String string, String string2) {
		this.areaCode = string;
		this.number = string2;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
}
