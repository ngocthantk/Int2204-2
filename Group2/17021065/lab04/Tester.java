package tuan3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tester {
//test findMax------------------------------------------------------------------------------------------------------------
	@Test
	void findMaxTest1() {
		int i = findMax.max(7, 99);
		assertEquals(99, i);
	}
	@Test
	void findMaxTest2() {
		int i = findMax.max(-7, 78);
		assertEquals(78, i);
	}
	@Test
	void findMaxTest3() {
		int i = findMax.max(0, 99);
		assertEquals(99, i);
	}
	@Test
	void findMaxTest4() {
		int i = findMax.max(-9, -99);
		assertEquals(-9, i);
	}
	@Test
	void findMaxTest5() {
		int i = findMax.max(0, -99);
		assertEquals(0, i);
	}
//test findMin------------------------------------------------------------------------------------------------------------
	@Test
	void findMinTest1() {
		int[] a = {1, 2};
		int i = findMin.min(a, a.length);
		assertEquals(1, i);
	}
	@Test
	void findMinTest2() {
		int[] a = {-1, 2};
		int i = findMin.min(a, a.length);
		assertEquals(-1, i);
	}
	@Test
	void findMinTest3() {
		int[] a = {0, 1, 2, 3, 4, 5};
		int i = findMin.min(a, a.length);
		assertEquals(0, i);
	}
	@Test
	void findMinTest4() {
		int[] a = {-1, 0, 55, 1321, 2354354};
		int i = findMin.min(a, a.length);
		assertEquals(-1, i);
	}
	@Test
	void findMinTest5() {
		int[] a = {-2121, -42424, 0, 1441, 5454, 6676876, -123, 431256,};
		int i = findMin.min(a, a.length);
		assertEquals(-42424, i);
	}
//test bmi----------------------------------------------------------------------------------------------------------------
	@Test
	void evaluatedBMITest1() {
		String i = evaluatedBMI.BMI(40.54, 1.60);
		System.out.println(i);
		assertEquals("Thieu can", i);
	}
	@Test
	void evaluatedBMITest2() {
		String i = evaluatedBMI.BMI(60, 1.75);
		System.out.println(i);
		assertEquals("Binh thuong", i);
	}
	@Test
	void evaluatedBMITest3() {
		String i = evaluatedBMI.BMI(90, 1.70);
		System.out.println(i);
		assertEquals("Beo phi", i);
	}
	@Test
	void evaluatedBMITest4() {
		String i = evaluatedBMI.BMI(80, 1.8);
		System.out.println(i);
		assertEquals("Thua can", i);
	}
	@Test
	void evaluatedBMITest5() {
		String i = evaluatedBMI.BMI(22.995, 1.2);
		System.out.println(i);
		assertEquals("Thieu can", i);
	}
}
