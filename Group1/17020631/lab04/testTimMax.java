package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testTimMax {

	@Test
	void test() {
		int k=timMax.max(4, 5);
		assertEquals(5,k);
	}
	@Test
	void Test() {
		int k=timMax.max(1, 2);
		assertEquals(2,k);
	}
	@Test
	void test_() {
		int k=timMax.max(0, 1);
		assertEquals(1,k);
	}
	@Test
	void TEST() {
		int k=timMax.max(4, 5);
		assertEquals(5,k);
	}
	@Test
	void test__() {
		int k=timMax.max(6, 7);
		assertEquals(7,k);
	}
}
