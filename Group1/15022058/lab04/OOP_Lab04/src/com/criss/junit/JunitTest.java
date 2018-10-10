package com.criss.junit;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;
import junit.framework.TestCase;

public class JunitTest extends TestCase {
	// Cau 1:
	@Test
	public void testMaxHaiSo1() {
		int ketQua1 = Junit.maxHaiSo(12, 101);
		assertEquals(101, ketQua1);
	}

	@Test
	public void testMaxHaiSo2() {
		int ketQua2 = Junit.maxHaiSo(99, 10);
		assertEquals(99, ketQua2);
	}

	@Test
	public void testMaxHaiSo3() {
		int ketQua3 = Junit.maxHaiSo(999, 10);
		assertEquals(999, ketQua3);
	}

	@Test
	public void testMaxHaiSo4() {
		int ketQua4 = Junit.maxHaiSo(99, 100);
		assertEquals(100, ketQua4);
	}

	@Test
	public void testMaxHaiSo5() {
		int ketQua5 = Junit.maxHaiSo(99, 200);
		assertEquals(200, ketQua5);
	}

	// Cau 2:
	@Test
	public void testMinArray1() {
		assertEquals(11, Junit.minArray());
	}

	@Test
	public void testMinArray2() {
		assertEquals(12, Junit.minArray());
	}

	@Test
	public void testMinArray3() {
		assertEquals(13, Junit.minArray());
	}

	@Test
	public void testMinArray4() {
		assertEquals(14, Junit.minArray());
	}

	@Test
	public void testMinArray5() {
		assertEquals(15, Junit.minArray());
	}

	// Cau 3:
	@Test
	public void testBMITest1() {
		assertEquals("Thieu Can", Junit.BMITest(50, (float) 1.8));
	}

	@Test
	public void testBMITest2() {
		assertEquals("Binh Thuong", Junit.BMITest(65, (float) 1.8));
	}

	@Test
	public void testBMITest3() {
		assertEquals("Thua Can", Junit.BMITest(75, (float) 1.8));
	}

	@Test
	public void testBMITest4() {
		assertEquals("Beo Phi", Junit.BMITest(80, (float) 1.6));
	}

	@Test
	public void testBMITest5() {
		assertEquals("Thieu Can", Junit.BMITest(50, (float) 1.7));
	}
}
