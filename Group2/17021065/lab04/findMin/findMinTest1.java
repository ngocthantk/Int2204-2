package tuan3.findMin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class findMinTest1 {

	@Test
	void test() {
		int[] a = {1, 2};
		int i = findMin.min(a, a.length);
		assertEquals(1, i);
	}

}
