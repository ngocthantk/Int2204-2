package lab04;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BMITest_01 {

	@Test
	public void test01() {
		assertEquals("Thieu can", Main.BMI(52, 1.70));
	}
	@Test
	public void test02() {
		assertEquals("Beo phi", Main.BMI(62, 1.57));	
	}
	@Test
	public void test03() {
		assertEquals("Binh thuong", Main.BMI(50, 1.57));	
	}
	@Test
	public void test04() {
		assertEquals("Binh thuong", Main.BMI(52, 1.57));	
	}
	@Test
	public void test05() {
		assertEquals("Thua can",Main.BMI(58, 1.57));	
	}
}
