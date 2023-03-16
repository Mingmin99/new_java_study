package com.day_0315.chap11;

public class Hero {
	private String name = "김용명";

	public Hero() {
		System.out.println("wer");
	}
	public String getName() {
		return name;
	}

	public void setNane(String name) {
		this.name = name;
	}

	private int hp = 100;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void attack(Kinoko kinoko) {
		System.out.println(this.name + "의 공격!");

		this.hp -= 5;
		System.out.println("5포인트의 데미지를 주었다!");

	}

	public void run() {
		System.out.println(this.name + "은 도망쳤다");
	}
}
