package com.project.model.dto;

import java.io.Serializable;

public class Product_InOut_DTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5115547442687544227L;
	private int number;
	private int no;
	private int amount;
	private String status;
	
	public Product_InOut_DTO() {
	}

	public Product_InOut_DTO(int number, int no, int amount, String status) {
		this.number = number;
		this.no = no;
		this.amount = amount;
		this.status = status;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Product_InOut_DTO [number=" + number + ", no=" + no + ", amount=" + amount + ", status=" + status + "]";
	}
	
}
