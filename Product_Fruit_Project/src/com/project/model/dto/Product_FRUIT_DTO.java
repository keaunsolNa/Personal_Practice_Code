package com.project.model.dto;

import java.io.Serializable;

public class Product_FRUIT_DTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6197937527212343055L;
	private int no;
	private String name;
	private String nativeHabitat;
	private int price;
	private int stock;
	
	public Product_FRUIT_DTO() {
	}

	public Product_FRUIT_DTO(int no, String name, String nativeHabitat, int price, int stock) {
		this.no = no;
		this.name = name;
		this.nativeHabitat = nativeHabitat;
		this.price = price;
		this.stock = stock;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNativeHabitat() {
		return nativeHabitat;
	}

	public void setNativeHabitat(String nativeHabitat) {
		this.nativeHabitat = nativeHabitat;
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

	@Override
	public String toString() {
		return "Product_FRUIT_DTO [no=" + no + ", name=" + name + ", nativeHabitat=" + nativeHabitat + ", price="
				+ price + ", stock=" + stock + "]";
	}
	

	
}
