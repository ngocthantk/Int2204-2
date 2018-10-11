package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BMITest {

	@Test
	void test1() {
		assertEquals("Béo phì", Method.BMI(60.0, 1.7));
	}
	@Test
	void test2() {
		assertEquals("Béo phì", Method.BMI(100.0, 1.7));
	}
	@Test
	void test3() {
		assertEquals("Thiếu cân", Method.BMI(60.0, 1.7));
	}
	@Test
	void test4() {
		assertEquals("Thiếu cân", Method.BMI(40.0, 1.7));
	}
	@Test
	void test5() {
		assertEquals("Bình thường", Method.BMI(60.0, 1.7));
	}
	

}
