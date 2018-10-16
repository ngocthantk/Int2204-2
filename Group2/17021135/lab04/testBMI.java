package pkTC;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testBMI {

	@Test
	void test() {
		testcase tc = new testcase();
		String bmi = tc.BMI(45, 1.6);
		assertEquals("Thieu Can", bmi);
	}
	@Test
	void test1() {
		testcase tc2 = new testcase();
		String bmi = tc2.BMI(50, 1.7);
		assertEquals("Beo Phi", bmi);
	}
	@Test
	void test2() {
		testcase tc = new testcase();
		String bmi = tc.BMI(60, 1.6);
		assertEquals("Binh Thuong", bmi);
	}
	@Test
	void test3() {
		testcase tc = new testcase();
		String bmi = tc.BMI(80, 1.7);
		assertEquals("Thua Can", bmi);
	}
	@Test
	void test4() {
		testcase tc = new testcase();
		String bmi = tc.BMI(55, 1.6);
		assertEquals("Thieu Can", bmi);
	}
}
