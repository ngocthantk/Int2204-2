package lab004;

import static org.junit.Assert.*;

import org.junit.Test;

public class BMITest {

	@Test
	public void test1() {
		assertEquals("thua can",BMI.sodo(76, 1.77));
	}
	@Test
	public void test2() {
		assertEquals("thieu can",BMI.sodo(45, 1.63));
	}
	@Test
	public void test3() {
		assertEquals("thua can",BMI.sodo(60, 1.77));
	}
	@Test
	public void test4() {
		assertEquals("beo phi",BMI.sodo(76, 1.67));
	}
	@Test
	public void test5() {
		assertEquals("So lieu sai",BMI.sodo(-76, 1.77));
	}

}
