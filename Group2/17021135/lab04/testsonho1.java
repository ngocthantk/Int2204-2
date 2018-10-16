package pkTC;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testsonho1 {

	@Test
	void test() {
		int a[] = new int[] {3,5,4,2,6,7};
		testcase tc = new testcase();
		int i = tc.sonhonhat(a);
		assertEquals(5,i);
	}
	@Test
	void test1() {
		int a[] = new int[] {5,32,33,55,33,11};
		testcase tc = new testcase();
		int i = tc.sonhonhat(a);
		assertEquals(5,i);
	}
	@Test
	void test2() {
		int a[] = new int[] {33,44,11,4,2,3,1,6,0};
		testcase tc = new testcase();
		int i = tc.sonhonhat(a);
		assertEquals(0,i);
	}
	@Test
	void test3() {
		int a[] = new int[] {5,3,2,6,11,66};
		testcase tc = new testcase();
		int i = tc.sonhonhat(a);
		assertEquals(66,i);
	}
	@Test
	void test4() {
		int a[] = new int[] {2,4,1,5,66,55,33};
		testcase tc = new testcase();
		int i = tc.sonhonhat(a);
		assertEquals(66,i);
	}
}
