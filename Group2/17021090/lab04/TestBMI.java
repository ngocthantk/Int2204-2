import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBMI {

	@Test
	public void test1() {
		assertEquals("Test 1",BT.BMI(60, 1.65), "Binh thuong");
	}
	
	@Test
	public void test2() {
		assertEquals("Test 2",BT.BMI(60, 1.5), "Beo phi");
	}
	
	@Test
	public void test3() {
		assertEquals("Test 3",BT.BMI(45, 1.6), "Thieu can");
	}
	
	@Test
	public void test4() {
		assertEquals("Test 4",BT.BMI(70, 1.68), "Thua can");
	}
	
	@Test
	public void test5() {
		assertEquals("Test 5",BT.BMI(100, 2), "Beo phi");
	}

}
