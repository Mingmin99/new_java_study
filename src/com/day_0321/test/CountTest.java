package com.day_0321.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.day_0321.unitTest.Count;



public class CountTest {

	@Test
	public void testCount() {
		Count c = new Count();
		assertEquals(1, c.count());
	}
	
}
