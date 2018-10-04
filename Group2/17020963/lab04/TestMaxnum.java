package MaxNumber;

import junit.framework.TestCase;

public class TestMaxnum extends TestCase {
//test1 voi 2 so 4 va 5
	public void test1() {
		int i = Maxnum.Findmax(18, 8);
		assertEquals(18, i);
	}
//test1 voi 2 so 7 va 8	
	public void test2() {
		int i = Maxnum.Findmax(7, 8);
		assertEquals(8, i);
	}
//test1 voi 2 so 14 va 7
	public void test3() {
		int i = Maxnum.Findmax(14, 7);
		assertEquals(14, i);
	}
//test1 voi 2 so 14 va 99
	public void test4() {
		int i = Maxnum.Findmax(19, 99);
		assertEquals(99, i);
	}
//test1 voi 2 so 20 va 16
	public void test5() {
		int i = Maxnum.Findmax(20, 16);
		assertEquals(20, i);
	}
}
