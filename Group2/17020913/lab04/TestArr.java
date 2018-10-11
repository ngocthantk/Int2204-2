package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestArr {

	@Test
	void test() {
		
		
		int arr[]= {2,1,6,7,8};
		int n= Main.SlMang( arr,5);
		
		assertEquals(1,n);
	}
	@Test
	void test2() {
		
		
		int arr[]= {20,5,3,9,8};
		int n= Main.SlMang( arr,5);
		
		assertEquals(1,n);
	}
	@Test
	void test3() {
		
		
		int arr[]= {1,3,6,7,8};
		int n= Main.SlMang( arr,5);
		
		assertEquals(1,n);
	}
	@Test
	void test4() {
		
		
		int arr[]= {88,5,999,7,8};
		int n= Main.SlMang( arr,5);
		
		assertEquals(1,n);
	}
	@Test
	void test5() {
		
		
		int arr[]= {9,5,6,7,8};
		int n= Main.SlMang( arr,5);
		
		assertEquals(1,n);
	}

}
