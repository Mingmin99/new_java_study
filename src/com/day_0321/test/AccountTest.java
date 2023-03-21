package com.day_0321.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.day_0321.unitTest.Account;



public class AccountTest {

	@Test 
	public void test() {
		Account account = new Account ("홍길동", 30000);
		assertEquals("홍길동", account.getOwner());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void throwsExceptionWithTWOcHARNAME() {}
}
 