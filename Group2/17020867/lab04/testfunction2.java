package function2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testfunction2 {

	@Test
	void test1() {
		int [] a = new int [100];
		for (int i=0; i<100; i++) a[i] = i;
		function2 fc = new function2();
		assertEquals(0, fc.min(a));
	}
	void test2() {
		int [] a = new int [100];
		for (int i=0; i<100; i++) a[i] = i-1;
		function2 fc = new function2();
		assertEquals(-1, fc.min(a));
	}
	void test3() {
		int [] a = new int [100];
		for (int i=0; i<100; i++) a[i] = i + 1;
		function2 fc = new function2();
		assertEquals(1, fc.min(a));
	}
	void test4() {
		int [] a = new int [100];
		for (int i=0; i<100; i++) a[i] = i - 2;
		function2 fc = new function2();
		assertEquals(-2, fc.min(a));
	}
	void test5() {
		int [] a = new int [100];
		for (int i=0; i<100; i++) a[i] = i + 3;
		function2 fc = new function2();
		assertEquals(3, fc.min(a));
	}

}
