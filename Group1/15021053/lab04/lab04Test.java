/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CCNE
 */
public class lab04Test {

    public lab04Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testMax1() {
//		fail("Not yet implemented");
        assertEquals(5, lab04.max(5, 2));
    }

    @Test
    public void testMax2() {
        assertEquals(99, lab04.max(15, 99));
    }

    @Test
    public void testMax3() {
        assertEquals(123, lab04.max(123, 53));
    }

    @Test
    public void testMax4() {
        assertEquals(-3, lab04.max(-3, -126));
    }

    @Test
    public void testMax5() {
        assertEquals(0, lab04.max(0, -12));
    }

    @Test
    public void testMin1() {
        int[] test1 = {152, 165, 2, 163, 35, 59, 39};
        assertEquals(2, lab04.min(test1));
    }

    @Test
    public void testMin2() {
        int[] test2 = {-1, 1651, 654, 32, 498, 78, 32};
        assertEquals(-1, lab04.min(test2));
    }

    @Test
    public void testMin3() {
        int[] test3 = {165, 325465, 132, 198, 126, 489, -2};
        assertEquals(-2, lab04.min(test3));
    }

    @Test
    public void testMin4() {
        int[] test4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(1, lab04.min(test4));
    }

    @Test
    public void testMin5() {
        int[] test5 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertEquals(1, lab04.min(test5));
    }

    @Test
    public void testBMI1() {
        assertEquals("Thieu can", lab04.BMI(40, 1.6));
    }

    @Test
    public void testBMI2() {
        assertEquals("Binh thuong", lab04.BMI(51.2, 1.6));
    }

    @Test
    public void testBMI3() {
        assertEquals("Thua can", lab04.BMI(61, 1.6));
    }

    @Test
    public void testBMI4() {
        assertEquals("Beo phi", lab04.BMI(78, 1.6));
    }

    @Test
    public void testBMI5() {
        assertEquals("Thua can", lab04.BMI(58.8673, 1.6));
    }
}
