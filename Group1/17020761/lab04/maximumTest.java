package chap04.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class maximumTest {

	@Test
	public void test() {
		assertEquals(1, maximum.maximum(-5,1));
	}
	
	@Test
	public void test1() {
		assertEquals(10, maximum.maximum(5,10));
	}
	
	@Test
	public void test2() {
		assertEquals(-8, maximum.maximum(-10,-8));
	}
	
	@Test
	public void test3() {
		assertEquals(3, maximum.maximum(-5,3));
	}
	
	@Test
	public void test4() {
		assertEquals(1, maximum.maximum(0,1));
	}
}
