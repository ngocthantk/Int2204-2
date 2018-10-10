package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTest {

	@Test
	public void test01() {
		assertEquals(8, Max.max(2,3));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test02() {
		assertEquals(4, Max.max(4,3));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test03() {
		assertEquals(87, Max.max(8,3));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test04() {
		assertEquals(84, Max.max(2,84));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test05() {
		assertEquals(8, Max.max(8,3));
		//fail("Not yet implemented");
	}
	

}

