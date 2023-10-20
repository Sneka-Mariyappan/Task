package com.junit;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class MaxAssert {

	MaxNumber m = new MaxNumber();
	@Test
	public void testArray() {
		int[] a = {10,30,20};
		//assertEquals(m.findMax(a),30);
	}
}
