package com.day_0316.instance;

import java.util.Objects;

public class Hero {
	// field.variable
	// global variable
	// member.variable

	String name;
	int hp;
	static int Money;



	void attack() {
		System.out.println(this.name + "는 공격했다!");
		System.out.println("적에게 5포인트의 데미지를 주었다!");
	}

	void run() {
		System.out.println(this.name + "는 도망쳤다!");
		System.out.println("GAME OVER");
		System.out.println("최종 HP는" + this.hp + "입니다");
	}

	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "는" + sec + "초 앉았다");
		System.out.println("HP" + sec + "포인트가 회복되었다");
	}

	void slip() {
		this.hp -= 5;
		System.out.println(this.name + "는 넘어졌다");
		System.out.println("5의 데미지!");
	}

	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "는 잠을 자고 회복했다");

	}

	static void setRandomMoney() {

	}

	@Override
	public int hashCode() {
		return Objects.hash(hp, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hero other = (Hero) obj;
		return hp == other.hp && Objects.equals(name, other.name);
	}
	
	
	
	}


