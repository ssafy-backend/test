package com.ssafy.board.model;

import java.util.List;

public class BoardDto {

	private String code;
	private String name;
	private int quantity;
	private String category;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "BoardDto [code=" + code + ", name=" + name + ", quantity=" + quantity + ", category=" + category + "]";
	}
	

	
}
