package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class BMITest {

	@Test
	void test1() {
		assertEquals("Binh thuong", BMI.outPut(63,1.73));
	}
	
	@Test
	void test2() {
		assertEquals("Beo phi", BMI.outPut(54,1.73));
	}
	
	@Test
	void test3() {
		assertEquals("Thua can", BMI.outPut(100,1.53));
	}
	
	@Test
	void test4() {
		assertEquals("Thieu can", BMI.outPut(43,1.66));
	}
	
	@Test
	void test5() {
		assertEquals("Binh thuong", BMI.outPut(56,1.79));
	}
	


}
