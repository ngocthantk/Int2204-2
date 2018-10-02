import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMax2 {

	@Test
	void test1() {
		int[] mang = {1,2,3,4,5,6,4,7,8,34};
		assertEquals(1,TimMaxMang.Min(mang, mang.length));
	}
	@Test
	void test2() {
		int[] mang = {6,1,7,9,3,4};
		assertEquals(1,TimMaxMang.Min(mang, mang.length));
	}
	@Test
	void test3() {
		int[] mang = {7,8,34,5,8,1,43,6,2};
		assertEquals(1,TimMaxMang.Min(mang, mang.length));
	}
	@Test
	void test4() {
		int[] mang = {122,11,66,23435,54,33};
		assertEquals(13,TimMaxMang.Min(mang, mang.length));
	}
	@Test
	void test5() {
		int[] mang = {5,6,784,3,6,32473264,652,123};
		assertEquals(1788,TimMaxMang.Min(mang, mang.length));
	}
}
