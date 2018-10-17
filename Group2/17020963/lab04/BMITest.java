package BMI;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BMITest {

	@Test
//test voi chieu cao 1.65m, can nang 70kg
		public void test1() {
			String s = BMI.findBMI(1.65, 70);
			assertEquals("Beo phi", s);
		}
	@Test
//test voi chieu cao 1.50m, can nang 42kg	
		public void test2() {
			String s = BMI.findBMI(1.50, 42);
			assertEquals("Binh thuong", s);
		}
	@Test
//test voi chieu cao 1.65m, can nang 65kg	
		public void test3() {
			String s = BMI.findBMI(1.65, 65);
			assertEquals("Thua can", s);
		}
	@Test
//test voi chieu cao 1.65m, can nang 60kg	
		public void test4() {
			String s = BMI.findBMI(1.65, 60);
			assertEquals("Binh thuong", s);
		}
	@Test
//test voi chieu cao 1.65m, can nang 45kg	
		public void test5() {
			String s = BMI.findBMI(1.65, 45);
			assertEquals("Thieu can", s);
		}
}
