package minh.dim;

import junit.framework.TestCase;

public class Test1 extends TestCase {
	
	public void testa1() {
		int num1 = Homework.Maxa_b(1,2);   // test 1
		assertEquals(2, num1);
	}
	public void testa2() {	
		int num2 = Homework.Maxa_b(3, 4);  // test 2
		assertEquals(4, num2);
	}
	public void testa3() {
		int num3 = Homework.Maxa_b(5, 6);  // test 3
		assertEquals(6, num3);
	}
	public void testa4() {
		int num4 = Homework.Maxa_b(7, 8);  // test 4
		assertEquals(8, num4);	
	}	
	public void testa5() {
		int num5 = Homework.Maxa_b(9, 10); // test 5
		assertEquals(10, num5);	
	}

}

