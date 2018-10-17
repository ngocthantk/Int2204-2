package Labo4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class maxIntTest {

	@Test
	void test1() {
		int i = maxInt.max(3, 5);
		assertEquals(2,i);
	}
	@Test
	void test2() {
		int i = maxInt.max(7, 9);
		assertEquals(9,i);
	}
	@Test
	void test3() {
		int i = maxInt.max(10, 22);
		assertEquals(22,i);
	}
	@Test
	void test4() {
		int i = maxInt.max(90, 9);
		assertEquals(90,i);
	}
	@Test
	void test5() {
		int i = maxInt.max(77, 9);
		assertEquals(9,i);
	}
	

}
