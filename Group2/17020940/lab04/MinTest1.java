package lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinTest1 {

	@Test
	public void test() {
		int arr[]= {1,2,3,4,5};
		int min = Min.findMin(arr);
		assertEquals(1,min);
	}
	@Test
	public void test1() {
		int arr[]= {5,4,3,2,1};
		int min = Min.findMin(arr);
		assertEquals(2,min);	}
	@Test
	public void test2() {
		int arr[]= {21,22,23,24,25};
		int min = Min.findMin(arr);
		assertEquals(21,min);
	}
	@Test
	public void test3() {
		int arr[]= {11,12,13,14,15};
		int min = Min.findMin(arr);
		assertEquals(11,min);
	}
	@Test
	public void test4() {
		int arr[]= {-3,-2,-1,0};
		int min = Min.findMin(arr);
		assertEquals(-3,min);
	}

}
