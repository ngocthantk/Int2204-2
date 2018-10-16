package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCaub_01 extends lab04 {

	@Test
	void test() {
		int a[]= {1,2,3,4};
		int i = MinArr(a);
		assertEquals(1,i);
	}
	@Test
	void test2() {
		int a[]= {-1,5,3,14,0};
		int i = MinArr(a);
		assertEquals(-1,i);
	}
	@Test
	void test3() {
		int a[]= {15,1,9,8};
		int i = MinArr(a);
		assertEquals(1,i);
	}
	@Test
	void test4() {
		int a[]= {-1,2,3,-8};
		int i = MinArr(a);
		assertEquals(-8,i);
	}
	@Test
	void test5() {
		int a[]= {18,8,-2,5};
		int i = MinArr(a);
		assertEquals(-2,i);
	}
}
