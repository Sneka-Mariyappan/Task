package com.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calculator calc = new Calculator();
	@Before
	public void print() {
		System.out.println("Hello");
	}
@Test
public void testAdd() {
	System.out.println(calc.add(10,20));
}
@Test
public void testDiv() {
	calc.div();
}
@Test
public void testSub() {

	 System.out.println(calc.sub());
}

@Test
public void testMulti() {
	calc.multi(5, 5);
}
@After
public void printBye() {
	System.out.println("Bye");
}
}
