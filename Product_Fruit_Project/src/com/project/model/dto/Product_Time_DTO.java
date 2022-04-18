package com.project.model.dto;

import java.util.Date;

public class Product_Time_DTO {

	private int number;
	private int no;
	private java.util.Date releaseDate;
	private java.util.Date shelfLifeDate;
	
	public Product_Time_DTO() {
	}
	public Product_Time_DTO(int number, int no, Date releaseDate, Date shelfLifeDate) {
		this.number = number;
		this.no = no;
		this.releaseDate = releaseDate;
		this.shelfLifeDate = shelfLifeDate;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public java.util.Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(java.util.Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public java.util.Date getShelfLifeDate() {
		return shelfLifeDate;
	}
	public void setShelfLifeDate(java.util.Date shelfLifeDate) {
		this.shelfLifeDate = shelfLifeDate;
	}
	@Override
	public String toString() {
		return "Product_Time_DTO [number=" + number + ", no=" + no + ", releaseDate=" + releaseDate + ", shelfLifeDate="
				+ shelfLifeDate + "]";
	}
	
	
}
