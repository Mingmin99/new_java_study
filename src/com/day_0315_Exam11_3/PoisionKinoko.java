package com.day_0315_Exam11_3;

public class PoisionKinoko extends Kinoko {

	int toxic = 5;
	private char suffix;

	public char getSuffix() {
		return suffix;
	}

	public void setSuffix() {
		this.suffix = suffix;
	}

	public PoisionKinoko(char suffix) {
		super(suffix);

	}

	@Override
	public void attack(Hero hero) {
		super.attack(hero);

		if (toxic != 0) {
			System.out.println("추가로, 독 포자를 살포했다!");
			int damage = (int) (hero.getHp() * 0.2);
			hero.setHp(hero.getHp() - damage);
			System.out.println(damage + " 포인트의 데미지");
			toxic--;
			System.out.println("독 공격의 남은횟수를 1 감소시킨다");
		}

	}

}
