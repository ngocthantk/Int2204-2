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
     * Test of FindBMI method, of class BMI.
     */
    @Test
    public void testFindBMI() {
        System.out.println("FindBMI");
        double h = 1.5;
        double m = 70;
        String expResult = "Beo phi";
        String result = BMI.FindBMI(h, m);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testFindBMI1() {
        System.out.println("FindBMI");
        double h = 1.7;
        double m = 54;
        String expResult = "Binh thuong";
        String result = BMI.FindBMI(h, m);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testFindBMI2() {
        System.out.println("FindBMI");
        double h = 1.56;
        double m = 43;
        String expResult = "Thieu can";
        String result = BMI.FindBMI(h, m);
        assertEquals(expResult, result);
    }
     @Test
    public void testFindBMI3() {
        System.out.println("FindBMI");
        double h = 1.57;
        double m = 60;
        String expResult = "Thua can";
        String result = BMI.FindBMI(h, m);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testFindBMI4() {
        System.out.println("FindBMI");
        double h = 1.6;
        double m = 52;
        String expResult = "Binh thuong";
        String result = BMI.FindBMI(h, m);
        assertEquals(expResult, result);
       
    }
}
