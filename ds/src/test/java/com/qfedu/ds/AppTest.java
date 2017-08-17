package com.qfedu.ds;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
	
	@Test
	public void testIsValidBracket_Valid() {
		assertTrue(App.isValidBracket("(2+3)*[4-5]"));
		assertTrue(App.isValidBracket("6* (2*[3+4]+5)"));
		assertTrue(App.isValidBracket("((2*[{3+4}*6])+5)*2"));
	}
	
	@Test
	public void testIsValidBracket_Invalid() {
		assertFalse(App.isValidBracket("(2+3]*[4-5]"));
		assertFalse(App.isValidBracket("((2+3)*[4-5]"));
		assertFalse(App.isValidBracket("(2+3)*[4-5]]"));
		assertFalse(App.isValidBracket("6* (2*[3+4]+5)}"));
		assertFalse(App.isValidBracket("6* (2*[3+4]+5}"));
	}
}