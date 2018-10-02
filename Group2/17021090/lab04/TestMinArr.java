import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMinArr {
	
	@Test
	public void test1() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		assertEquals("Test 1", BT.minArr(arr1), 1);
	}

	@Test
	public void test2() {
		int[] arr2 = { 0, 0, 0, 0, 0, 0, 0 };
		assertEquals("Test 2", BT.minArr(arr2), 0);
	}

	@Test
	public void test3() {
		int[] arr3 = { 100, 200, 201, -22, -555 };
		assertEquals("Test 3", BT.minArr(arr3), -555);
	}

	@Test
	public void test4() {
		int[] arr4 = { 10000, 100002, 123344, 2132131, 2222222 };
		assertEquals("Test 4", BT.minArr(arr4), 10000);
	}

	@Test
	public void test5() {
		int[] arr5 = { -10, -20, -30, -40, -50, -60, -70 };
		assertEquals("Test 5", BT.minArr(arr5), -70);
	}

}