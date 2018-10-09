package pkTC;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testsolon1 {

	@Test
	void test() {
//		testcase tc1= new testcase();
		int b = testcase.solonhon(4, 3);
		assertEquals(3,b);
	}
	@Test
	void test1() {
		testcase tc1= new testcase();
		int b = tc1.solonhon(4, 3);
		assertEquals(4,b);
	}
	@Test
	void test2() {
		testcase tc3 = new testcase();
		int d = tc3.solonhon(7, 3);
		assertEquals(3,d);
	}
	@Test
	void test3() {
		testcase tc4 = new testcase();
		int e = tc4.solonhon(0, 3);
		assertEquals(3,e);
	}
	@Test
	void test4() {
		testcase tc1= new testcase();
		int b = tc1.solonhon(6, 3);
		assertEquals(3,b);
	}
}
