package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lab4.Method;

class TestBMI {


	@Test
	void test1() {
		assertEquals("Béo phì", Method.BMI(66.0, 1.65));
	}
	@Test
	void test2() {
		assertEquals("Thừa cân", Method.BMI(110.0, 1.7));
	}
	@Test
	void test3() {
		assertEquals("Thiếu cân", Method.BMI(49.0, 1.7));
	}
	@Test
	void test4() {
		assertEquals("Thiếu cân", Method.BMI(65.0, 1.7));
	}
	@Test
	void test5() {
		assertEquals("Bình thường", Method.BMI(55.0, 1.7));
}
}
