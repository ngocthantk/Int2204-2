package function3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testfunction {

	@Test
	void test1() {
		assertEquals("thua can",function.BMI(65, 1.65));
	}
	@Test
	void test2() {
		assertEquals("binh thuong",function.BMI(50, 1.5));
	}
	@Test
	void test3() {	
		assertEquals("beo phi",function.BMI(50, 1.1));
	}
	@Test
	void test4() {
		assertEquals("thieu can",function.BMI(65, 1.9));	
	}
	@Test
	void test5() {
		assertEquals("thua can",function.BMI(65, 1.65));
	}

}
