package tuan3.findMax;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class findMaxTest2 {

	@Test
	void test() {
		int i = findMax.max(-7, 78);
		assertEquals(78, i);
	}

}
