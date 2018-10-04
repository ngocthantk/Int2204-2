import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testMax1() {
		assertEquals(2,Main.max(1,2));
	}
	@Test
	void testMax2() {
		assertEquals(-1,Main.max(-1,-2));
	}
	@Test
	void testMax3() {
		assertEquals(10000,Main.max(1,10000));
	}
	@Test
	void testMax4() {
		assertEquals(2209,Main.max(1309,2209));
	}
	@Test
	void testMax5() {
		assertEquals(0,Main.max(0,0));
	}

	@Test
	void testMin1() {
		assertEquals(0,Main.min((new int [] {1 , 2 ,3 , 0 }) ));
	}
	@Test
	void testMin2() {
		assertEquals(1,Main.min((new int [] {1 , 2 , 3 , 9 }) ));
	}
	@Test
	void testMin3() {
		assertEquals(5,Main.min((new int [] {10 , 22 ,31 , 5 }) ));
	}
	@Test
	void testMin4() {
		assertEquals(3,Main.min((new int [] {1123 , 213, 3 , 120 }) ));
	}
	@Test
	void testMin5() {
		assertEquals(-9999,Main.min((new int [] { 1231 , 1223 ,123 , 123 , -9999 ,10210201 }) ));
	}
	
	
	@Test
	void testBmi1() {
		assertEquals("Thieu can", Main.bmi(40,2));
	}
	@Test
	void testBmi2() {
		assertEquals("Binh thuong", Main.bmi(80,2));
	}
	@Test
	void testBmi3() {
		assertEquals("Beo phi", Main.bmi(80, 1.7));
	}
	@Test
	void testBmi4() {
		assertEquals("Beo phi", Main.bmi(100, 1.2));
	}
	@Test
	void testBmi5() {
		assertEquals("Thua can", Main.bmi(80, 1.8));
	}
	
	

}
