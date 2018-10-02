package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinArrTest {

	@Test
	public void test1() {
		int[] a = {4,5,7,3,8};
		assertEquals(2,MinArr.minArr(a));
	}
	
	@Test
	public void test2() {
		int[] a = {4,5,7,3,8};
		assertEquals(4,MinArr.minArr(a));
	}
	
	@Test
	public void test3() {
		int[] a = {4,5,7,3,8,3,3,3,2,2,1};
		assertEquals(1,MinArr.minArr(a));
	}
	
	@Test
	public void test4() {
		int[] a = {4,5,7,3,8,6,8,9,2,11,0};
		assertEquals(0,MinArr.minArr(a));
	}
	
	@Test
	public void test5() {
		int[] a = {4,5,7,3,8};
		assertEquals(3,MinArr.minArr(a));
	}

}
