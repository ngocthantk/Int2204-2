package task4;

import junit.framework.TestCase;

public class maxIntTest extends TestCase {
	//test 1 đưa vào 3,4
	public void test1() {
	     maxInt a = new maxInt();
	     int i1 = a.find(3, 4);
	     assertEquals(4, i1);
	}
	//test 2 đưa vào 4,5
	public void test2() {
	     maxInt a = new maxInt();
	     int i2 = a.find(4, 5);
	     assertEquals(5, i2);
	}
	//test 3 đưa vào 0,1
	public void test3() {
	     maxInt a = new maxInt();
	     int i3 = a.find(0, 1);
	     assertEquals(1, i3);
	}
	//test 4 đưa vào 9,4
	public void test4() {
	     maxInt a = new maxInt();
	     int i4 = a.find(9, 4);
	     assertEquals(9, i4);
	     }
	//test 5 đưa vào 5,6
	public void test5() {
	     maxInt a = new maxInt();
	     int i5 = a.find(5, 6);
	     assertEquals(6, i5);
	}
}

	

