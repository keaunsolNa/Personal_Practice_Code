package com.project.model.dto;

import java.util.Date;

public class Product_ALL_DTO {

	private int fruitno;
	private String fruitName;
	private String fruitNativeHabitat;
	private int price;
	private int stock;
	
	private int inoutNumber;
	private int inoutNo;
	private int inoutAmount;
	private String inoutStatus;
	
	private int timeNumber;
	private int timeNo;
	private java.util.Date timeReleaseDate;
	private java.util.Date timeShelfLifeDate;
	
	public Product_ALL_DTO() {
	}
	public Product_ALL_DTO(int fruitno, String fruitName, String fruitNativeHabitat, int price, int stock,
			int inoutNumber, int inoutNo, int inoutAmount, String inoutStatus, int timeNumber, int timeNo,
			Date timeReleaseDate, Date timeShelfLifeDate) {
		this.fruitno = fruitno;
		this.fruitName = fruitName;
		this.fruitNativeHabitat = fruitNativeHabitat;
		this.price = price;
		this.stock = stock;
		this.inoutNumber = inoutNumber;
		this.inoutNo = inoutNo;
		this.inoutAmount = inoutAmount;
		this.inoutStatus = inoutStatus;
		this.timeNumber = timeNumber;
		this.timeNo = timeNo;
		this.timeReleaseDate = timeReleaseDate;
		this.timeShelfLifeDate = timeShelfLifeDate;
	}
	public int getFruitno() {
		return fruitno;
	}
	public void setFruitno(int fruitno) {
		this.fruitno = fruitno;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitNativeHabitat() {
		return fruitNativeHabitat;
	}
	public void setFruitNativeHabitat(String fruitNativeHabitat) {
		this.fruitNativeHabitat = fruitNativeHabitat;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getInoutNumber() {
		return inoutNumber;
	}
	public void setInoutNumber(int inoutNumber) {
		this.inoutNumber = inoutNumber;
	}
	public int getInoutNo() {
		return inoutNo;
	}
	public void setInoutNo(int inoutNo) {
		this.inoutNo = inoutNo;
	}
	public int getInoutAmount() {
		return inoutAmount;
	}
	public void setInoutAmount(int inoutAmount) {
		this.inoutAmount = inoutAmount;
	}
	public String getInoutStatus() {
		return inoutStatus;
	}
	public void setInoutStatus(String inoutStatus) {
		this.inoutStatus = inoutStatus;
	}
	public int getTimeNumber() {
		return timeNumber;
	}
	public void setTimeNumber(int timeNumber) {
		this.timeNumber = timeNumber;
	}
	public int getTimeNo() {
		return timeNo;
	}
	public void setTimeNo(int timeNo) {
		this.timeNo = timeNo;
	}
	public java.util.Date getTimeReleaseDate() {
		return timeReleaseDate;
	}
	public void setTimeReleaseDate(java.util.Date timeReleaseDate) {
		this.timeReleaseDate = timeReleaseDate;
	}
	public java.util.Date getTimeShelfLifeDate() {
		return timeShelfLifeDate;
	}
	public void setTimeShelfLifeDate(java.util.Date timeShelfLifeDate) {
		this.timeShelfLifeDate = timeShelfLifeDate;
	}
	@Override
	public String toString() {
		return "Product_ALL_DTO [fruitno=" + fruitno + ", fruitName=" + fruitName + ", fruitNativeHabitat="
				+ fruitNativeHabitat + ", price=" + price + ", stock=" + stock + ", inoutNumber=" + inoutNumber
				+ ", inoutNo=" + inoutNo + ", inoutAmount=" + inoutAmount + ", inoutStatus=" + inoutStatus
				+ ", timeNumber=" + timeNumber + ", timeNo=" + timeNo + ", timeReleaseDate=" + timeReleaseDate
				+ ", timeShelfLifeDate=" + timeShelfLifeDate + "]";
	}

	
	
	
}
