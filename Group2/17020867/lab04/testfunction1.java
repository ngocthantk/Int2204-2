package function1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testfunction1 {

	@Test
	void test1() {
		assertEquals(4,function1.max(3,4));	
	}
	@Test
	void test2() {		
	assertEquals(0, function1.max(0, -1));
	}
	@Test
	void test3() {	
		assertEquals(-1, function1.max(-1, -2));
	}
	@Test
	void test4() {
		assertEquals(9,function1.max(9, 8)) ;
	}
	@Test
	void test5() {
		assertEquals(10,function1.max(0, 10) );
	}
	
	

}
