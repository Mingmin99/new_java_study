package com.day_0315.chap11;

public class SuperHero extends Hero {
	private boolean flying;

	public SuperHero() {
		super();
		System.out.println("sdfsdf");
	}
	public void fly() {
		flying = true;
		System.out.println("날았다!");
	}

	public void land() {
		flying = false;
		System.out.println("착지했다!");
	}

	@Override
	public void run() {
		System.out.println("퇴각했다!");
	}

	@Override
	public void attack(Kinoko kinoko) {
		super.attack(kinoko);
		
		
		
		if (this.flying) {
			System.out.println(this.getName() + "의 공격!");
			
		}
	}

}
