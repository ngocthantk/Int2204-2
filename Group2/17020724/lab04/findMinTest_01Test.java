package lab04;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class findMinTest_01Test {
	@Test
	public void test01() {
		int[] a = {16,11,22,11,20,12};
		assertEquals(11, Main.findMin(a));
	}
	@Test
	public void test02() {
		int[] a = {1,4,5,6,8,9,-11,-14,-9999999,-6,-3};
		assertEquals(-9999999, Main.findMin(a));
	}
	@Test
	public void test03() {
		int[] a = {-20,20,1222,3,2,5,7,8,4,7,9,-9,-4,7,3,2,0};
		assertEquals(-20, Main.findMin(a));
	}
	@Test
	public void test04() {
		int[] a = {11,111,1111};
		assertEquals(11, Main.findMin(a));
	}
	@Test
	public void test05() {
		int[] a = {1,99,10};
		assertEquals(1, Main.findMin(a));
	}
}
