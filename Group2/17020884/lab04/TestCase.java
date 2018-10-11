package t4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Test;

class TestCase {
	
	@Test
	public void TestNo1a() {
		MinMax.max(10, 10);
		assertEquals(MinMax.max(10, 10),10);
	}
	@Test
	public void TestNo2a() {
		assertEquals(MinMax.max(11, 13),13);
	}
	@Test
	public void TestNo3a() {
		assertEquals(MinMax.max(100, -0),100);
	}
	@Test
	public void TestNo4a() {
		assertEquals(MinMax.max(-100, 0),0);
	}
	@Test
	public void TestNo5a() {
		assertEquals(MinMax.max(-10, -10),-10);
	}
	@Test
	public void TestNo1b() {
		int[] a = { 1 , 4 , 3 , 5 , 7 , 5 , 6 };
		assertEquals(MinMax.min(a),1);
	}
	@Test
	public void TestNo2b() {
		int[] a = { 1 , 1 , 1 , 1 , 1 , 1 , 1 };
		assertEquals(MinMax.min(a),1);
	}
	@Test
	public void TestNo3b() {
		int[] a = new int[10];
		assertEquals(MinMax.min(a),0);
	}
	@Test
	public void TestNo4b() {
		int[] a = {-14, -4, -34,};
		assertEquals(MinMax.min(a),-34);
	}
	@Test
	public void TestNo5b() {
		int[] a =new int[100];		
		Random random = new Random();
		for (int j = 0; j < a.length; j++) {
			a[j] = random.nextInt(1000) +1000;
		}
		a[78]=135;
		assertEquals(MinMax.min(a),135);
	}
	@Test
	public void TestNo1c() {
		assertEquals(BMI.BMIresult(62, 1.71),"Bình thường");
	}
	@Test
	public void TestNo2c() {
		assertEquals(BMI.BMIresult(92, 1.71),"Béo phì");
	}
	@Test
	public void TestNo3c() {
		assertEquals(BMI.BMIresult(72, 1.71),"Thừa cân");
	}
	@Test
	public void TestNo4c() {
		assertEquals(BMI.BMIresult(52, 1.71),"Thiếu cân");
	}
	@Test
	public void TestNo5c() {
		assertEquals(BMI.BMIresult(67, 1.71),"Bình thường");
	}
}
