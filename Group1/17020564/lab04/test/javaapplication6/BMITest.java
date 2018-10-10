/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FEELSBADMAN
 */
public class BMITest {
    
    public BMITest() {
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

    /**
     * Test of bmi method, of class BMI.
     */
    @Test
    public void test1() {
        BMI a = new BMI();
        String b = a.bmi(16, 5);
        assertEquals("Thieu can", b);
    }
@Test
    public void test2() {
        BMI a = new BMI();
        String b = a.bmi(1000, 5);
        assertEquals("Beo phi", b);
    }
@Test
    public void test3() {
        BMI a = new BMI();
        String b = a.bmi(470, 5);
        assertEquals("Binh thuong", b);
    }
@Test
    public void test4() {
        BMI a = new BMI();
        String b = a.bmi(500, 5);
        assertEquals("Binh thuong", b);
    }
@Test
    public void test5() {
        BMI a = new BMI();
        String b = a.bmi(580, 5);
        assertEquals("Thua can", b);
    }
    
}
