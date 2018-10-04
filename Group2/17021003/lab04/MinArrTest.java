/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

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
public class MinArrTest {
    
    public MinArrTest() {
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
     * Test of MinArr method, of class MinArr.
     */
    @Test
    public void testMinArr1() {
        System.out.println("MinArr");
        int[] a = {15,16,17,18};
        int expResult = 15;
        int result = MinArr.MinArr(a);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testMinArr2() {
        System.out.println("MinArr");
        int[] a = {10,9,8,7,6,5,4,3,2,1};
        int expResult = 1;
        int result = MinArr.MinArr(a);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testMinArr3() {
        System.out.println("MinArr");
        int[] a = {1,2};
        int expResult = 1;
        int result = MinArr.MinArr(a);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testMinArr4() {
        System.out.println("MinArr");
        int[] a = {18,26,1,188};
        int expResult = 1;
        int result = MinArr.MinArr(a);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testMinArr5() {
        System.out.println("MinArr");
        int[] a = {1,3,5,7,9,2,4,6,8};
        int expResult = 1;
        int result = MinArr.MinArr(a);
        assertEquals(expResult, result);
        
    }
    
}
