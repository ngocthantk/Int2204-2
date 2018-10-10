package Labo4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BMITest {

	@Test
	void test1() {
		String i = BMI.BMI(50,1.62);
		assertEquals("Binh Thuong",i);
	}
	@Test
	void test2() {
		String i = BMI.BMI(90,1.62);
		assertEquals("Beo Phi",i);
	}
	@Test
	void test3() {
		String i = BMI.BMI(50,1.77);
		assertEquals("Thieu Can",i);
	}
	@Test
	void test4() {
		String i = BMI.BMI(100,1.62);
		assertEquals("Binh Thuong",i);
	}
	@Test
	void test5() {
		String i = BMI.BMI(70,1.7);
		assertEquals("Thua Can",i);
	}

}
