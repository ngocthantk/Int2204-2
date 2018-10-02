package tuan3.findMin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class findMinTest3 {

	@Test
	void test() {
		int[] a = {0, 1, 2, 3, 4, 5};
		int i = findMin.min(a, a.length);
		assertEquals(0, i);
	}

}
