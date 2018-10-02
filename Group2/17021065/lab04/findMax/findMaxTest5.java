package tuan3.findMax;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class findMaxTest5 {

	@Test
	void test() {
		int i = findMax.max(0, -99);
		assertEquals(0, i);
	}

}
