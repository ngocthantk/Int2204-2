package phamanhtu.v;

import junit.framework.TestCase;

public class BaiTapTest2 extends TestCase
{
	public void test()
	{
		int a[] = {1,2,3,4,5};
		int c = BaiTap.GTNN(a);
		assertEquals(1, c);
	}
	public void test2()
	{
		int a1[] = {11,22,33,44,55};
		int c1 = BaiTap.GTNN(a1);
		assertEquals(11, c1);
	}
	public void test3()
	{
		int a2[] = {51,42,33,24,15};
		int c2 = BaiTap.GTNN(a2);
		assertEquals(15, c2);
	}
	public void test4()
	{
		int a3[] = {81,92,73,64,55};
		int c3 = BaiTap.GTNN(a3);
		assertEquals(55, c3);
	}
	public void test5()
	{
		int a4[] = {10,24,36,43,57};
		int c4 = BaiTap.GTNN(a4);
		assertEquals(10, c4);
	}
}
