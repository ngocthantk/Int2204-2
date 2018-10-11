package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testBMI {

	@Test
	void test1() {
		String a=BMI.kiemTra(1.7f, 70f);
		assertEquals("thua can",a);
	}
	@Test
	void test2() {
		String a=BMI.kiemTra(1.8f, 78f);
		assertEquals("thua can",a);
	}
	@Test
	void test3() {
		
		String a=BMI.kiemTra(1.7f, 50f);
		assertEquals("thieu can",a);
	}
	@Test
	void test4() {
		
		String a=BMI.kiemTra(1.7f, 40f);
		assertEquals("thieu can",a);
	}
	@Test
	void test5() {
		
		String a=BMI.kiemTra(1.7f, 90f);
		assertEquals("beo phi",a);
	}
}
