package com.day_0317.exam1;

public class StrongBox<T> {
	private T infor;
	private int limit;

	enum KeyType {

		PADLOCK, BUTTON, DIAL, FINGER;
	}

	// 열쇠의 종류를 받는 생성자
	StrongBox(KeyType keytype) {

		if (keytype == KeyType.PADLOCK) {
			this.limit = 1024;
		}
		if (keytype == KeyType.BUTTON) {
			this.limit = 10000;
		}
		if (keytype == KeyType.DIAL) {
			this.limit = 30000;
		}
		if (keytype == KeyType.FINGER) {
			this.limit = 1000000;
		}

	}

	public void put(T infor) {
		this.infor = infor;
	}

	public T get() {
		limit--;
		if (limit > 0) {
			return this.infor;
		} else {
			return null;
		}

	}

}
