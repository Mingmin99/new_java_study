package com.day_0316.chap14.exam2;

public class Main {

	public static void main(String[] args) {

		BankAccount a = new BankAccount("4649", 1592);
		System.out.println(a);
		BankAccount b = new BankAccount("4649", 1592);
		if (a.equals(b)) {

			System.out.println("같");
		}
	}

}
