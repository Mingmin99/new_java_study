package com.day_0316.chap14.exam2;

import java.util.Objects;

public class BankAccount {
	String accountNumber;
	int balance;

	@Override
	public String toString() {
		return balance + "원 (계좌번호 = " + accountNumber + " ) ";
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public BankAccount(String accountNumber, int balance) {
		this.accountNumber = accountNumber.trim();
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if ((this.accountNumber.trim().equals(other.accountNumber.trim()))) {

			return false;
		}

		return true;
	}

}
