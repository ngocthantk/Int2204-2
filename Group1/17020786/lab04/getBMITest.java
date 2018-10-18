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
public class getBMITest {
    
    public getBMITest() {
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
     * Test of getBmi method, of class getBMI.
     */
    @Test
    public void testGetBmi1() {
        System.out.println("getBmi");
        double h = 0.0;
        double w = 0.0;
        String expResult = "Thieu can";
        String result = getBMI.getBmi(h, w);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetBmi2() {
        System.out.println("getBmi");
        double h = 1.0;
        double w = 22.95;

        String expResult = "Binh thuong";
        String result = getBMI.getBmi(h, w);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetBmi3() {
        System.out.println("getBmi");
        double h = 1.65;
        double w = 62;
        String expResult = "Binh thuong";
        String result = getBMI.getBmi(h, w);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetBmi4() {
        System.out.println("getBmi");
        double h = 1;
        double w = 24.995;
        String expResult = "Beo phi";
        String result = getBMI.getBmi(h, w);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetBmi5() {
        System.out.println("getBmi");
        double h = 1.0;
        double w = 24.99;
        String expResult = "Beo phi";
        String result = getBMI.getBmi(h, w);
        assertEquals(expResult, result);
    }
}
