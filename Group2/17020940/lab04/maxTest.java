package lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class maxTest {

	@Test
	public void test() {
		int i = max.findMax(5, 4);
		assertEquals(5,i);
	}
	@Test
	public void test1() {
		int i = max.findMax(5, 4);
		assertEquals(5,i);
	}
	@Test
	public void test2() {
		int i = max.findMax(15, 14);
		assertEquals(15,i);
	}
	@Test
	public void test3() {
		int i = max.findMax(25, 24);
		assertEquals(5,i);
	}
	@Test
	public void test4() {
		int i = max.findMax(105, 94);
		assertEquals(105,i);
	}

}
