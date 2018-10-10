import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMax {

	@Test
	public void test1() {
		assertEquals("Test 1",BT.max(1, 2), 2);
	}
	
	@Test
	public void test2() {
		assertEquals("Test 2",BT.max(10, -2), 10);
	}
	
	@Test
	public void test3() {
		assertEquals("Test 3",BT.max(400, 300), 400);
	}
	
	@Test
	public void test4() {
		assertEquals("Test 4",BT.max(23, 23), 23);
	}
	
	@Test
	public void test5() {
		assertEquals("Test 5",BT.max(4321, 1234), 4321);
	}

}
