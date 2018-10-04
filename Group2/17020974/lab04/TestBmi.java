import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBmi {

	@Test
	void test1() {
		assertEquals("thieu can",BMI.BMI1(50, 1.67));
	}
	@Test
	void test2() {
		assertEquals("thua can",BMI.BMI1(65, 1.77));
	}
	@Test
	void test3() {
		assertEquals("beo phi",BMI.BMI1(70, 1.61));
	}
	@Test
	void test4() {
		assertEquals("binh thuong",BMI.BMI1(60, 1.72));
	}
	@Test
	void test5() {
		assertEquals("thieu can",BMI.BMI1(50, 1.8));
	}
}
