package phamanhtu.v;

import junit.framework.TestCase;

public class BaiTapTest extends TestCase 
{
	public void test()
	{
		int m = BaiTap.GTLN(19,24);
		assertEquals(24, m);
	}
	public void test1()
	{
		int m1 = BaiTap.GTLN(1999,2000);
		assertEquals(2000, m1);
	}
	public void test2()
	{
		int m2 = BaiTap.GTLN(12,2);
		assertEquals(12, m2);
	}
	public void test3()
	{
		int m3 = BaiTap.GTLN(13,10);
		assertEquals(13, m3);
	}
	public void test4()
	{
		
		int m4 = BaiTap.GTLN(11,17);
		assertEquals(17, m4);
	}
}

