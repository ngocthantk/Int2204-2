package task4;

import junit.framework.TestCase;

public class BMITest extends TestCase {

	//test 1 đưa vào chiều cao 15 cân nặng 5
	public void test1() {
		
			BMI a = new BMI();
			String b=a.find(15, 5);
			assertEquals("Thieu can",b );

		
	}
	//test 2 đưa vào chiều cao 2500 cân nặng 5
	public void test2() {
		
		BMI a = new BMI();
		String b=a.find(2500, 5);
		assertEquals("Beo phi",b );

	}
	//test 3 đưa vào chiều cao 475 cân nặng 5
    public void test3() {
		
		BMI a = new BMI();
		String b=a.find(475, 5);
		assertEquals("Binh thuong",b );

	}
  //test 4 đưa vào chiều cao 500 cân nặng 5
    public void test4() {
		
		BMI a = new BMI();
		String b=a.find(500, 5);
		assertEquals("Binh thuong",b );

	}
  //test 5 đưa vào chiều cao 575 cân nặng 5
    public void test5() {
		
		BMI a = new BMI();
		String b=a.find(575, 5);
		assertEquals("Thua can",b );

	}

}
