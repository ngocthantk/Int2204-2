package tuan3.findMin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class findMinTest5 {

	@Test
	void test() {
		int[] a = {-2121, -42424, 0, 1441, 5454, 6676876, -123, 431256,};
		int i = findMin.min(a, a.length);
		assertEquals(-42424, i);
	}

}
