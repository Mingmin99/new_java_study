package com.day_0321.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.day_0321.unitTest.DownCounter;



public class DownCounterTest {

	@Test
	public void testCount() {
		DownCounter c = new DownCounter();
		assertEquals(-1, c.count());
	}

}
