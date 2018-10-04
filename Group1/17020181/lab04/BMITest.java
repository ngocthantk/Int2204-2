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
     * Test of Bmi method, of class BMI.
     */
    @Test
    public void testBmi1() {
        System.out.println("Bmi");
        double h = 1.54;
        double kg = 42.0;
        String expResult = "Thiếu cân";
        String result = BMI.Bmi(h, kg);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testBmi2() {
        System.out.println("Bmi2");
        double h = 1.6;
        double kg = 49.0;
        String expResult = "Bình thường";
        String result = BMI.Bmi(h, kg);
        assertEquals(expResult, result);
    }
     @Test
    public void testBmi3() {
        System.out.println("Bmi3");
        double h = 1.5;
        double kg = 62.0;
        String expResult = "Béo phì";
        String result = BMI.Bmi(h, kg);
        assertEquals(expResult, result);
    }
     @Test
    public void testBmi4() {
        System.out.println("Bmi4");
        double h = 1.68;
        double kg = 58.0;
        String expResult = "Bình thường";
        String result = BMI.Bmi(h, kg);
        assertEquals(expResult, result);
    }
     @Test
    public void testBmi5() {
        System.out.println("Bmi5");
        double h = 1.5;
        double kg = 53.0;
        String expResult = "Thừa cân";
        String result = BMI.Bmi(h, kg);
        assertEquals(expResult, result);
    }
}
