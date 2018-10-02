package tuan3.findMax;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class findMaxTest4 {

	@Test
	void test() {
		int i = findMax.max(-9, -99);
		assertEquals(-9, i);
	}

}
