package lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class BMITest {

	@Test
	public void test() {
		assertEquals("Thiếu cân",BMI.result(52.0,1.69));
	}
	@Test
	public void test1() {
		assertEquals("Bình thường",BMI.result(56.0,1.69));
	}
	@Test
	public void test2() {
		assertEquals("Thiếu cân",BMI.result(60.0,1.69));
	}
	@Test
	public void test3() {
		assertEquals("Béo phì",BMI.result(63.0,1.69));
	}
	@Test
	public void test4() {
		assertEquals("Thiếu cân",BMI.result(109.0,1.69));
	}
	
}
