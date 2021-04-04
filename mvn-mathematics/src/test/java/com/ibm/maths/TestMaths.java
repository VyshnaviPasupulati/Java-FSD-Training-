package com.ibm.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestMaths {
	private static Maths maths;
	@BeforeAll
	public static void setup() {
		maths = new Maths();
	}
	@Test
	public void testAdd() {
		assertEquals(10,maths.add(5,5));
	}
	@Test
	public void testSubs() {
		assertEquals(10,maths.subs(15, 5));
	}
	@Test
	public void testDiv() {
		assertEquals(10,maths.div(50, 5));
	}
	@Test
	public void testZeroDiv() {
		assertThrows(Exception.class,()->{maths.div(2,0);});
	}

}
