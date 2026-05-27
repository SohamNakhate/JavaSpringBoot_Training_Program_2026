package com.soham.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.soham.ReverseString;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString r = new ReverseString();
		String reversed = r.reverseString("Soham"); 
		String expected = "mahoS"; 
		assertEquals(reversed,expected);
	}
}
