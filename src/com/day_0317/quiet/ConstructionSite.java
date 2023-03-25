package com.day_0317.quiet;

public class ConstructionSite extends Location {
	public int radius;

	public ConstructionSite(int a, int b, int radius) {
		super(a, b);
		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
