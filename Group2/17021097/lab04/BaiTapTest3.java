package phamanhtu.v;

import junit.framework.TestCase;

public class BaiTapTest3 extends TestCase {
	public void test()
	{
	String expresion = BaiTap.BMI(52, 1.62);
	assertEquals("Bình thường", expresion);
	}
	public void test2()
	{
	String expresion1 = BaiTap.BMI(70, 1.5);
	assertEquals("Béo phì", expresion1);
	}
	public void test3()
	{
	String expresion2 = BaiTap.BMI(40, 1.8);
	assertEquals("Thiếu cân", expresion2);
	}
	public void test4()
	{
	String expresion3 = BaiTap.BMI(56, 1.72);
	assertEquals("Bình thường", expresion3);
	}
	public void test5()
	{
	String expresion4 = BaiTap.BMI(56, 1.54);
	assertEquals("Thừa cân", expresion4);
	}
}
