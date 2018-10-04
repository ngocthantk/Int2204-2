package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCauD_01 extends lab04 {

	@Test
	void test() {
		String s=Print(30,1.2);
		assertEquals("Thieu Can",s);
	}
	@Test
	void test2() {
		String s=Print(30,1.2);
		assertEquals("Binh Thuong",s);
	}
	@Test
	void test3() {
		String s=Print(30,1.2);
		assertEquals("Thua Can",s);
	}
	@Test
	void test4() {
		String s=Print(30,1.2);
		assertEquals("Beo Phi",s);
	}
	@Test
	void test5() {
		String s=Print(30,1.7);
		assertEquals("Thieu Can",s);
	}

}
