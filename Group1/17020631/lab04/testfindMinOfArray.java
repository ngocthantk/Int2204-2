package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testfindMinOfArray {

	@Test
	void test() {
		int[] arr= {1,2,3,4,5,9,7,8,6};
		int k=findMinOfArray.find(arr);
		assertEquals(1,k);
	}
	@Test
	void Test() {
		int[] arr= {11,12,13,14,15,19,27,38,56};
		int k=findMinOfArray.find(arr);
		assertEquals(11,k);
	}
	@Test
	void test_() {
		int[] arr= {11,2,3,4,5,9,7,8,6};
		
		int k=findMinOfArray.find(arr);
		assertEquals(2,k);
	}
	@Test
	void test__() {
		int[] arr= {1,2,3,4,5,9,77,8,6};
		int k=findMinOfArray.find(arr);
		assertEquals(1,k);
	}
	@Test
	void test5() {
		int[] arr= {1,2,3,4,5,9,7,8,66};
		int k=findMinOfArray.find(arr);
		assertEquals(1,k);
	}
}
