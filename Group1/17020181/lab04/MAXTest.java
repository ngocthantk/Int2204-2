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
     * Test of max method, of class MAX.
     */
    @Test
    public void testMax1() {
        System.out.println("max");
        int a = 1;
        int b = 2;
        int expResult = 2;
        int result = MAX.max(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testMax2() {
        System.out.println("max");
        int a = 3;
        int b = 2;
        int expResult = 3;
        int result = MAX.max(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testMax3() {
        System.out.println("max");
        int a = 45;
        int b = 21;
        int expResult = 45;
        int result = MAX.max(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax4() {
        System.out.println("max");
        int a = 34;
        int b = 34;
        int expResult = 34;
        int result = MAX.max(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax5() {
        System.out.println("max");
        int a = 23;
        int b = 32;
        int expResult = 32;
        int result = MAX.max(a, b);
        assertEquals(expResult, result);
        
    }
    
    
}
