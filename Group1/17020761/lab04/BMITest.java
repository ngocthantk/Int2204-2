package chap04.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BMITest {

	@Test
	public void test() {
	assertEquals("Thiếu cân", BMI.BMIresult(55,1.75));
	}
	@Test
	public void test1() {
	assertEquals("Bình thường", BMI.BMIresult(70,1.78));
	}
	@Test
	public void test2() {
	assertEquals("Thừa cân", BMI.BMIresult(80,1.73));
	}
	@Test
	public void test3() {
	assertEquals("Thừa cân", BMI.BMIresult(68.2,1.72));
	}
	@Test
	public void test4() {
	assertEquals("Béo phì", BMI.BMIresult(80,1.78));
	}
}
