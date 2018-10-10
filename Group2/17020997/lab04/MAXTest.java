/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticjunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MyPC
 */
public class MAXTest {
    
    public MAXTest() {
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
     * Test of gtln method, of class MAX.
     */
    @Test
    public void testGtln1() {
        //System.out.println("gtln");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = MAX.gtln(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testGtln2() {
        //System.out.println("gtln");
        int a = 9;
        int b = 99;
        int expResult = 99;
        int result = MAX.gtln(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testGtln3() {
        //System.out.println("gtln");
        int a = 198;
        int b = 189;
        int expResult = 199;
        int result = MAX.gtln(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testGtln4() {
        //System.out.println("gtln");
        int a = -99;
        int b = -199;
        int expResult = -99;
        int result = MAX.gtln(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testGtln5() {
        //System.out.println("gtln");
        int a = 4*65;
        int b = 65*4;
        int expResult = 260;
        int result = MAX.gtln(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
