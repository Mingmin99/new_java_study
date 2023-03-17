package com.day_0316.instance.comparable;

public class Account implements Comparable<Account> {
	int number;

	@Override
	public int compareTo(Account obj) {

		if (this.number < obj.number) {
			return -1;
		}

		if (this.number > obj.number) {
			return 1;
		}
		return 0;
	}

}
