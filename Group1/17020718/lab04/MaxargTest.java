package lap04.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxargTest {

	@Test
	void test1() {
		int a[] = { 1 , 2 , 3 };
		assertEquals(1, Maxarg.maxargs(a));
	}
	@Test
	void test2() {
		int a[] = { 4 , 5 , 7 };
		assertEquals(4, Maxarg.maxargs(a));
	}
	@Test
	void test3() {
		int a[] = { 5 , 8 , 8 };
		assertEquals(5, Maxarg.maxargs(a));
	}
	@Test
	void test4() {
		int a[] = { 23 , 22 , 36 };
		assertEquals(22, Maxarg.maxargs(a));
	}
	@Test
	void test5() {
		int a[] = { 11 , 24 , 33 };
		assertEquals(11, Maxarg.maxargs(a));
	}
	

}
