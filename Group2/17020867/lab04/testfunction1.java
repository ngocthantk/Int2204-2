package function1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testfunction1 {

	@Test
	void test1() {
		
		function1 fc = new function1();
		assertEquals(4, fc.max(3,4));
		
	}
	void test2() {
		
		function1 fc = new function1();
		assertEquals(0, fc.max(0, -1));
	}
	void test3() {
		
		function1 fc = new function1();
		assertEquals(-1, fc.max(-1, -2));
	}
	void test4() {
		
		function1 fc = new function1();
		assertEquals(9, fc.max(9, 8));
	}
	void test5() {
		
		function1 fc = new function1();
		assertEquals(10, fc.max(0, 10));
	}
	
	

}
