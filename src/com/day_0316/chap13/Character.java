package com.day_0316.chap13;

public abstract class Character {
	String name;
	private int hp;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void run() {
		System.out.println(name + "은 도망쳤다");
	}

	public abstract void attack(Monster monster);

// 추상클래스니까 상세부분 미정, body 설정해주지 않는다.
//	public abstract void attack(Kinoko kinoko);;

}
