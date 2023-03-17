package com.day_0317.generic;

public class Pocket<E extends Character> {
	private E data;

	public void put(E data) {
		this.data = data;
	}

	public E get() {
		return this.data;
	}

}
