package com.day_0315.chap12.Exam2;

public abstract class Asset {
	private String name;
	private String color;
	private int price;

	public Asset(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;

	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public String getColor() {
		return color;

	}

	public void setColor(String color) {
		this.color = color;

	}

	public int getPrice() {
		return price;

	}

	public void setPrice(int price) {
		this.price = price;

	}

	public Asset(String name, String color, String price) {

	}

}