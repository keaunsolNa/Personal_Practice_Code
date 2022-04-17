package com.college.member.model.dto;

import java.io.Serializable;

public class TB_DepartmentDTO implements Serializable{
	
	private static final long serialVersionUID = -6090783257836936656L;
	
	private int no;
	private String name;
	private String category;
	private String openYN;
	private int capacity;
	public TB_DepartmentDTO() {
	}
	public TB_DepartmentDTO(int no, String name, String category, String openYN, int capacity) {
		this.no = no;
		this.name = name;
		this.category = category;
		this.openYN = openYN;
		this.capacity = capacity;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getOpenYN() {
		return openYN;
	}
	public void setOpenYN(String openYN) {
		this.openYN = openYN;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "TB_DepartmentDTO [capacity=" + capacity + ", category=" + category + ", name=" + name + ", no=" + no
				+ ", openYN=" + openYN + "]";
	}
	
	
}
