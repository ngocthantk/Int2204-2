package chap04.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mainTest {

	@Test
	public void testFindmin() {
		assertEquals(1, Main.findmin(new int[] {1,2,3,4,5}));
	}
	@Test
	public void testFindmin1() {
		assertEquals(17, Main.findmin(new int[] {17,20,10,14,15}));
	}
	
	@Test
	public void testFindmin2() {
		assertEquals(0, Main.findmin(new int[] {1,-2,0,4,5}));
	}
	
	@Test
	public void testFindmin3() {
		assertEquals(5, Main.findmin(new int[] {7,8,10,12,5}));
	}
	
	@Test
	public void testFindmin4() {
		assertEquals(-8, Main.findmin(new int[] {1,2,3,-8,5}));
	}
	
}
