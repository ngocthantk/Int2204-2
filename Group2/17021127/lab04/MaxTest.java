<<<<<<< HEAD
package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTest {

	@Test
	void test1() {
		int a = 1, b = 10;
		assertEquals(1, Method.max(a, b));
	}
	@Test
	void test2() {
		int a = 10, b =1;
		assertEquals(10, Method.max(a, b));
	}
	@Test
	void test3() {
		int a = 3, b = 4;
		assertEquals(3, Method.max(a, b));
	}
	@Test
	void test4() {
		assertEquals(100, Method.max(100, 200));
	}
	@Test
	void test5() {
		assertEquals(5, Method.max(4, 5));
	}

}
=======
package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTest {

	@Test
	void test1() {
		int a = 1, b = 10;
		assertEquals(1, Method.max(a, b));
	}
	@Test
	void test2() {
		int a = 10, b =1;
		assertEquals(10, Method.max(a, b));
	}
	@Test
	void test3() {
		int a = 3, b = 4;
		assertEquals(3, Method.max(a, b));
	}
	@Test
	void test4() {
		assertEquals(100, Method.max(100, 200));
	}
	@Test
	void test5() {
		assertEquals(5, Method.max(4, 5));
	}

}
>>>>>>> 8698251a186993be093e172d03823408519eb608
