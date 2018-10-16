package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCauA_01 extends lab04 {

	@Test
	void test() {
		int i=Max(2, 3);
		assertEquals(3,i);
	}
	@Test
	void test1() {
		int i= Max(3, 5);
		assertEquals(5,i);
	}
	@Test
	void test2() {
		int i=Max(-2, 5);
		assertEquals(5,i);
	}
	@Test
	void test3() {
		int i= Max(3, -1);
		assertEquals(3,i);
	}
	@Test
	void test4() {
		int i= Max(16, 11);
		assertEquals(16,i);
	}

}
