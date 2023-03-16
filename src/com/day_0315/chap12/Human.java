package com.day_0315.chap12;

public interface Human extends Creature {
	void talk();
	void hear();
	void watch();
	
	//추가로 부모 인스턴스에서 run을 상속받고 있
}
