package task4;

import junit.framework.TestCase;

public class minArrTest extends TestCase {
	//test 1 đưa vào mảng có 10 phần tử
	public void test1() {
		int [] s = new int[100];
		for(int i=0;i<100;i++)
		{
			s[i]=i;
		}
		minArr a = new minArr();
		int i =a.find(s, 10);
		assertEquals(0, i);

	}
	//test 1 đưa vào mảng có 11 phần tử và s[0]=2
	public void test2() {
		int [] s = new int[100];
		for(int i=0;i<100;i++)
		{
			s[i]=i;
		}
		s[0]=2;
		minArr a = new minArr();
		int i =a.find(s, 11);
		assertEquals(1, i);

	}
	//test 3 đưa vào mảng có 10 phần tử 
	public void test3() {
		int [] s = new int[100];
		for(int i=0;i<100;i++)
		{
			s[i]=i;
		}
		minArr a = new minArr();
		int i =a.find(s, 12);
		assertEquals(0, i);

	}
	//test 4 đưa vào mảng có 15
	public void test4() {
		int [] s = new int[100];
		for(int i=0;i<100;i++)
		{
			s[i]=i;
		}
		minArr a = new minArr();
		int i =a.find(s, 15);
		assertEquals(0, i);

	}
	//test 1 đưa vào mảng có 50 phần tử 
	public void test5() {
		int [] s = new int[100];
		for(int i=0;i<100;i++)
		{
			s[i]=i;
		}
		minArr a = new minArr();
		int i =a.find(s, 50);
		assertEquals(0, i);

	}

}
