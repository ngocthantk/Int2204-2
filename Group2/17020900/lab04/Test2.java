package minh.dim;

import junit.framework.TestCase;

public class Test2 extends TestCase {
	public void testb1() {
		int[] arr1 = {5,6,7};
		int num1 = Homework.MaxArray(arr1);  // test 1
		assertEquals(5, num1);
	}
	public void test2() {
		int[] arr2 = {1,2,3,4,5};
		int num2 = Homework.MaxArray(arr2);  // test 2
		assertEquals(1, num2);
	}	
	public void testb3() {
		int[] arr3 = {6,5,8,10};
		int num3 = Homework.MaxArray(arr3);  // test 3
		assertEquals(5, num3);
	}	
	public void testb4() {		
		int[] arr4 = {10,20,50,3,6,9,1,2};
		int num4 = Homework.MaxArray(arr4);  // test 4
		assertEquals(1, num4);
	}	
	public void testb5() {
		int[] arr5 = {100,200,500,600,50};
		int num5 = Homework.MaxArray(arr5);  // test 5
		assertEquals(50, num5);
	}
}
