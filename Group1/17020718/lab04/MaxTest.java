package lap04.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTest {

	@Test
	void test() {
		int a = 2, b =3;
		assertEquals(3, Max.maxtwonumber(a, b));
	}
	@Test
	void test2() {
		int a = 45, b =33;
		assertEquals(45, Max.maxtwonumber(a, b));
	}
	@Test
	void test3() {
		int a = 21, b =33;
		assertEquals(33, Max.maxtwonumber(a, b));
	}
	@Test
	void test4() {
		int a = 212, b =23;
		assertEquals(212, Max.maxtwonumber(a, b));
	}
	@Test
	void test5() {
		int a = 444, b =54;
		assertEquals(444, Max.maxtwonumber(a, b));
	}

}
