package Labo4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrminTest {

	@Test
	void test1() {
		int [] i = {0,1,2,3,4,5,6};
		int a = Arrmin.min(i);
		assertEquals(0,a);
	}
	@Test
	void test2() {
		int [] i = {9,8,9,9,9,9,99,9};
		int a = Arrmin.min(i);
		assertEquals(8,a);
	}
	@Test
	void test3() {
		int [] i = {6,5,3,7,3,8};
		int a = Arrmin.min(i);
		assertEquals(3,a);
	}
	@Test
	void test4() {
		int [] i = {9,35,34,23,54,6,4,3,234,2,5};
		int a = Arrmin.min(i);
		assertEquals(2,a);
	}
	@Test
	void test5() {
		int [] i = {4,323,54,23,54,23,556,7};
		int a = Arrmin.min(i);
		assertEquals(54,a);
	}
		
}
