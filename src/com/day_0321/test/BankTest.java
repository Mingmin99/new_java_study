package com.day_0321.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.day_0321.unitTest.Bank;

public class BankTest {

	@Test
	(expected = IllegalArgumentException.class)
	public void testNameLength() {
		Bank bank = new Bank();
		bank.setName("b");

	}

}
