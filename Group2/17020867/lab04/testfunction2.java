package function2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testfunction2 {

	@Test
	void test1() {
		int [] a = new int [100];
		for (int i=0; i<100; i++) a[i] = i;
		assertEquals(0, function2.min(a));
	}
	@Test
	void test2() {
		int [] a = new int [100];
		for (int i=0; i<100; i++) a[i] = i-1;
		a[50] = -2;
		assertEquals(-2,function2.min(a) );
	}
	@Test
	void test3() {
		int [] a = new int [100];
		for (int i=0; i<100; i++) a[i] = i + 1;
		a[49] = -9;
		assertEquals(-9,function2.min(a) );
	}
	@Test
	void test4() {
		int [] a = new int [100];
		for (int i=0; i<100; i++) a[i] = i - 2;
		a[70]= -10;
		assertEquals(-10, function2.min(a));
	}
	@Test
	void test5() {
		int [] a = new int [100];
		for (int i=0; i<100; i++) a[i] = i + 3;
		assertEquals(3, function2.min(a));
	}

}
