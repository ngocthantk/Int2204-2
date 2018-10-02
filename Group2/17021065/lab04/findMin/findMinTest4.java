package tuan3.findMin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class findMinTest4 {

	@Test
	void test() {
		int[] a = {-1, 0, 55, 1321, 2354354};
		int i = findMin.min(a, a.length);
		assertEquals(-1, i);
	}

}
