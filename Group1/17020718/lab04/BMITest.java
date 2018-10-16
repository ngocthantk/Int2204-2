package lap04.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BMITest {

	@Test
	void test() {
		assertEquals("Béo phì", BMI.evaluate(70000, 12));
	}
	@Test
	void test2() {
		assertEquals("Thiếu cân", BMI.evaluate(70, 12));
	}
	@Test
	void test3() {
		assertEquals("Béo phì", BMI.evaluate(40000, 15));
	}
	@Test
	void test4() {
		assertEquals("Thiếu cân", BMI.evaluate(70, 2));
	}
	@Test
	void test5() {
		assertEquals("Bình thường", BMI.evaluate(84, 2));
	}
	

}
