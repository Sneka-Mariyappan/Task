package com.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AssertProgram {
	@Test
	public void testAssertEquals() {
		assertEquals(10, 10);
	}
	@Test
	public void testNull() {
		assertNull(null,null);
	}
	@Test
	public void testTrue() {
		boolean a=10>3;
		assertTrue(a);
	}
	@Test
	public void testSame() {
		assertSame("karan","karan");
	}
	@Test
	public void testArray() {
		int[] a = {26,9,926};
		int[] b = {26,9,926};
		assertArrayEquals(a,b);
	}
	

}
