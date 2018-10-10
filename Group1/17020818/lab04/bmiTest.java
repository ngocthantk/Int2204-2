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
public class bmiTest {
    
    public bmiTest() {
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
    public void testBmi1() {
        //System.out.println("getBmi");
        double height = 45;
        double weight = 1.67;
        String expResult = "Thieu can";
        String result = bmi.chiSoBmi(height, weight);
        assertEquals(expResult, result);
    }
    @Test
    public void testBmi2() {
        //System.out.println("getBmi");
        double height = 55;
        double weight = 1.6;
        String expResult = "Binh thuong";
        String result = bmi.chiSoBmi(height, weight);
        assertEquals(expResult, result);
    }
    @Test
    public void testBmi3() {
        //System.out.println("getBmi");
        double height = 69;
        double weight = 1.58;
        String expResult = "Beo phi";
        String result = bmi.chiSoBmi(height, weight);
        assertEquals(expResult, result);
    }
    @Test
    public void testBmi4() {
        //System.out.println("getBmi");
        double height = 40;
        double weight = 1.7;
        String expResult = "Thieu can";
        String result = bmi.chiSoBmi(height, weight);
        assertEquals(expResult, result);
    }
    @Test
    public void testBmi5() {
        //System.out.println("getBmi");
        double height = 58;
        double weight = 1.55;
        String expResult = "Thua can";
        String result = bmi.chiSoBmi(height, weight);
        assertEquals(expResult, result);
    }
    
}