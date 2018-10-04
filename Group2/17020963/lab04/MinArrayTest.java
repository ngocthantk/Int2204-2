package MinArray;

import junit.framework.TestCase;

public class MinArrayTest extends TestCase {
//dua vao 1 mang co 100 phan tu, phan tu nho nhat la 0
	public void test1() {
		int [] b = new int[100];
		for(int i = 0; i < 100; i++) {
			b[i] = i;
		}
		int i = MinArray.find(b);
		assertEquals(0, i);
	}
//dua vao 1 mang co 100 phan tu, phan tu nho nhat la 1	
	public void test2() {
		int [] b = new int[100];
		for(int i = 0; i < 100; i++) {
			b[i] = i;
		}
		b[0] = 708;
		int i = MinArray.find(b);
		assertEquals(1, i);
	}
//dua vao 1 mang co 100 phan tu, phan tu nho nhat la 2
	public void test3() {
		int [] b = new int[100];
		for(int i = 0; i < 100; i++) {
			b[i] = i;
		}
		b[0] = 708;
		b[1] = 789;
		int i = MinArray.find(b);
		assertEquals(2, i);
	}
//dua vao 1 mang co 100 phan tu, phan tu nho nhat la 3	
	public void test4() {
		int [] b = new int[100];
		for(int i = 0; i < 100; i++) {
			b[i] = i;
		}
		b[0] = 708;
		b[1] = 789;
		b[2] = 1407;
		int i = MinArray.find(b);
		assertEquals(3, i);
	}
//dua vao 1 mang co 100 phan tu, phan tu nho nhat la 4	
	public void test5() {
		int [] b = new int[100];
		for(int i = 0; i < 100; i++) {
			b[i] = i;
		}
		b[0] = 708;
		b[1] = 789;
		b[2] = 1407;
		b[3] = 1808;
		int i = MinArray.find(b);
		assertEquals(4, i);
	}
}
