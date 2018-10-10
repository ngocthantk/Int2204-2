package lab004;

import static org.junit.Assert.*;

import org.junit.Test;

public class MangTest {

	@Test
	public void test1() {
		int[] a={1,2,3,4,5};
	assertEquals(1, Mang.min(a));
	}
	@Test
	public void test2() {
		int[] b={72,43,9,22,11};
	assertEquals(43, Mang.min(b));
	}
	@Test
	public void test3() {
		int[] c={20,12,53,24,15};
	assertEquals(12, Mang.min(c));
	}
	@Test
	public void test4() {
		int[] d={91,97,102,6,8};
	assertEquals(102, Mang.min(d));
	}
	@Test
	public void test5() {
		int[] e={97,99,101,100,102};
	assertEquals(97, Mang.min(e));
	}

}
