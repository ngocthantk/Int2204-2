package lab04;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ATest {
	
	@Test


   void test() {
		//A a=new A();
		int x1=A.Max(4,-4);
		assertEquals(4,x1);
		
		
}
	@Test
	void test1() {
		//A a=new A();
		
		int x2=A.Max(0, 9);
	assertEquals(9,x2);
		
	}
	@Test
	void test2() {
		//A a=new A();
		
		int x3=A.Max(9999999, 9);
		assertEquals(9999999,x3);
	
}
	@Test
	void test3() {
		//A a=new A();
		
		int x4=A.Max(-0, 0);
		assertEquals(0,x4);
		
	}
	@Test
	void test4() {
		//A a=new A();
		
		int x5=A.Max(-100000, 9);
		assertEquals(9,x5);
		
	}
	
	@Test
	void testb1() {
	//	A a=new A();
		String x=A.BMI(1.7,40);
		assertEquals("thieu can", x);
		
	}
	@Test
	void testb2() {
	//	A a=new A();
		String x=A.BMI(1.7,40);
		assertEquals("thieu can", x);
		
	}
	@Test
	void testb3() {
	//	A a=new A();
		String x=A.BMI(1.7,80);
		assertEquals("beo phi", x);
		
	}
	@Test
	void testb4() {
		//A a=new A();
		String x=A.BMI(1.7,60);
		assertEquals("binh thuong", x);
		
	}
	@Test
	void testb5() {
	//	A a=new A();
		String x=A.BMI(1.7,70);
		assertEquals("beo phi", x);
		
	}
	@Test
	void testc1() {
		int arr1[]=new int[100];
		for(int i=0;i<100;i++)
		{
			arr1[i]=i;
		}
	//	A a=new A();
		int i=A.arr(arr1);
		assertEquals(0,i);
	}
	@Test
	void testc2() {
		int arr1[]=new int[100];
		for(int i=0;i<100;i++)
		{
			arr1[i]=i-10;
		}
		//A a=new A();
		int i=A.arr(arr1);
		assertEquals(-10,i);
	}
	@Test
	void testc3() {
		int arr1[]=new int[100];
		for(int i=0;i<100;i++)
		{
			arr1[i]=i+10;
		}
	//	A a=new A();
		int i=A.arr(arr1);
		assertEquals(10,i);
	}
	@Test
	void testc4() {
		int arr1[]=new int[100];
		for(int i=0;i<100;i++)
		{
			arr1[i]=i*10;
		}
	//	A a=new A();
		int i=A.arr(arr1);
		assertEquals(-10,i);
	}
	@Test
	void testc5() {
		int arr1[]=new int[100];
		for(int i=0;i<100;i++)
		{
			arr1[i]=i/10;
		}
		//A a=new A();
		int i=A.arr(arr1);
		assertEquals(-10,i);
	}


}