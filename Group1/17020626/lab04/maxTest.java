<<<<<<< HEAD
package lab004;

import static org.junit.Assert.*;

import org.junit.Test;

public class maxTest {

	@Test
	public void test1() {
		int i = max.Max(4,5);
		assertEquals(5,i);
	}
	@Test
	public void test2() {
		assertEquals(48,max.Max(48,26));
	}
	@Test
	public void test3() {
		assertEquals(11,max.Max(17,11));
	}
	@Test
	public void test4() {
		assertEquals(12,max.Max(12,1));
	}
	@Test
	public void test5() {
		assertEquals(33,max.Max(77,33));
	}

}
=======
package lab004;

import static org.junit.Assert.*;

import org.junit.Test;

public class maxTest {

	@Test
	public void test1() {
		int i = max.Max(4,5);
		assertEquals(5,i);
	}
	@Test
	public void test2() {
		assertEquals(48,max.Max(48,26));
	}
	@Test
	public void test3() {
		assertEquals(11,max.Max(17,11));
	}
	@Test
	public void test4() {
		assertEquals(12,max.Max(12,1));
	}
	@Test
	public void test5() {
		assertEquals(33,max.Max(77,33));
	}

}
>>>>>>> 8698251a186993be093e172d03823408519eb608
