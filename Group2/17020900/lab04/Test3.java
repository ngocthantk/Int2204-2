package minh.dim;

import junit.framework.TestCase;

public class Test3 extends TestCase {
	public void testc1() {
		String string_1 = Homework.NumberBMI(49.5,1.65);  // test 1
		assertEquals("Thiếu cân", string_1);
	}	
	public void testc2() {
		String string_2 = Homework.NumberBMI(55.0, 1.60);  // test 2
		assertEquals("Bình thường", string_2);   
	}	
	public void testc3() {
		String string_3 = Homework.NumberBMI(70.0, 1.70);  // test 3
		assertEquals("Thừa cân", string_3); 
	}
	public void testc4() {
		String string_4 = Homework.NumberBMI(85.5, 1.75);  // test 4
		assertEquals("Béo phì", string_4); 
	}
	public void testc5() {
		String string_5 = Homework.NumberBMI(60.0, 1.70);  // test 4
		assertEquals("Bình thường", string_5); 
	}
}
