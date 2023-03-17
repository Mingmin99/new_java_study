package com.day_0316.instance.clone;

public class Hero implements Cloneable {

	public String name;
	public int hp;
	public Sword sword;

	@Override
	public Hero clone() {

		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword;
		return result;

	}

}
