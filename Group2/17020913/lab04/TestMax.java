package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMax {

	@Test
	public void test() {
		
		int n = Main.Solon(4, 6);
		assertEquals(6, n);
	} 
	@Test
	public void test1() {
		
		int n = Main.Solon(3, 4);
		assertEquals(4, n);
	} 
	@Test
	public void test2() {
		
		int n = Main.Solon(15, 6);
		assertEquals(15, n);
	} 
	@Test
	public void test3() {
		
		int n = Main.Solon(15, 15);
		assertEquals(15, n);
	} 
	@Test
	public void test4() {
		
		int n = Main.Solon(6, 6);
		assertEquals(5, n);
	} 
	@Test
	public void test5() {
		
		int n = Main.Solon(4, 6);
		assertEquals(4,n);
		
	} 


}
