/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    public void testBmi() {
        System.out.println("bmi");
        double weight = 46;
        double hight = 1.6;
        String expResult = "Thieu can";
        String result = BMI.bmi(weight, hight);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBmi2() {
        System.out.println("bmi");
        double weight = 69;
        double hight = 1.5;
        String expResult = "Beo phi";
        String result = BMI.bmi(weight, hight);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBmi3() {
        System.out.println("bmi");
        double weight = 54;
        double hight = 1.7;
        String expResult = "Binh thuong";
        String result = BMI.bmi(weight, hight);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBmi4() {
        System.out.println("bmi");
        double weight = 70;
        double hight = 1.7;
        String expResult = "Thua can";
        String result = BMI.bmi(weight, hight);
        assertEquals(expResult, result);
    }
    
}
