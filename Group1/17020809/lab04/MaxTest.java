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
public class MaxTest {
    
    public MaxTest() {
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
     * Test of FindMax method, of class Max.
     */
    @Test
    public void testFindMax() {
        System.out.println("FindMax");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Max.FindMax(a, b);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testFindMax1() {
        System.out.println("FindMax");
        int a = 1;
        int b = 2;
        int expResult = 2;
        int result = Max.FindMax(a, b);
        assertEquals(expResult, result);
      
    }
    @Test
    public void testFindMax2() {
        System.out.println("FindMax");
        int a = 5;
        int b = 2;
        int expResult = 5;
        int result = Max.FindMax(a, b);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testFindMax3() {
        System.out.println("FindMax");
        int a = 3;
        int b = 0;
        int expResult = 3;
        int result = Max.FindMax(a, b);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testFindMax4() {
        System.out.println("FindMax");
        int a = 1;
        int b = 7;
        int expResult = 7;
        int result = Max.FindMax(a, b);
        assertEquals(expResult, result);
     
    }
    @Test
    public void testFindMax5() {
        System.out.println("FindMax");
        int a = 3;
        int b = 6;
        int expResult = 6;
        int result = Max.FindMax(a, b);
        assertEquals(expResult, result);
       
    }
}
