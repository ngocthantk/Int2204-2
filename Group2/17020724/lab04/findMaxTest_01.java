package lab04;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class findMaxTest_01 {
	@Test
	public void test01() {
		assertEquals(20, Main.findMax(20, 12));
	}
	@Test
	public void test02() {
		assertEquals(16, Main.findMax(-16, 16));
	}
	@Test
	public void test03() {
		assertEquals(4, Main.findMax(-5, 4));
	}
	@Test
	public void test04() {
		assertEquals(-12, Main.findMax(-20, -12));	
	}
	@Test
	public void test05() {
		assertEquals(0, Main.findMax(0, -100000000));	
	}
}
