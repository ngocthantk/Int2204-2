import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMax1 {
	@Test
	void testLan1() {
		int i=TimGTLN.Max1(2,5);
		assertEquals(5,i);
	}
	
	@Test
	void testLan2()
	{
		int i=TimGTLN.Max1(3,5);
		assertEquals(2,i);
	}
	@Test
	void testLan3() {
		int i=TimGTLN.Max1(100,5);
		assertEquals(7,i);
	}
	@Test
	void testLan4() {
		int i=TimGTLN.Max1(7,6);
		assertEquals(130,i);
	}
	@Test
	void testLan5() {
		int i=TimGTLN.Max1(-10,3);
		assertEquals(4,i);
	}
}
