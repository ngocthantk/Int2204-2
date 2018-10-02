package function3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testfunction3 {

	@Test
	void test1() {
		
		function3 fc = new function3();
		assertEquals("thua can",fc.BMI(65, 1.65) );
	}
	void test2() {
		
		function3 fc = new function3();
		assertEquals("binh thuong",fc.BMI(50, 1.5) );
	}
	
	void test3() {
		
		function3 fc = new function3();
		assertEquals("beo phi",fc.BMI(50, 1.1) );
	}
	void test4() {
		
		function3 fc = new function3();
		assertEquals("thieu can",fc.BMI(65, 1.9) );
	}
	void test5() {
		
		function3 fc = new function3();
		assertEquals("thua can",fc.BMI(65, 1.65) );
	}

}
