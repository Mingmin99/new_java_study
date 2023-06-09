package com.day_0315.chap12.Exam4;

public abstract class TangibleAsset extends Asset implements Thing {

	private double weight;

	public TangibleAsset(String name, String color, int price, double weight) {
		super(name, color, price);
		this.weight = weight;

	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
