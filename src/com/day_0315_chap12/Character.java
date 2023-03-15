package com.day_0315_chap12;

public abstract class Character {
	private String name;
	private int hp;
	
	
	public Character(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + "은 도망쳤다");
	}

	public abstract void attack(Kinoko kinoko);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
