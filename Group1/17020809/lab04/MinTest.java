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
public class MinTest {
    
    public MinTest() {
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
     * Test of FindMin method, of class Min.
     */
    @Test
    public void testFindMin() {
        System.out.println("FindMin");
        int[] a = { 3, 4, 3, 2 ,7};
        int expResult = 2;
        int result = Min.FindMin(a);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testFindMin1() {
        System.out.println("FindMin");
        int[] a = { 2, 1, 5,7};
        int expResult = 1;
        int result = Min.FindMin(a);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testFindMin2() {
        System.out.println("FindMin");
        int[] a = { 1, 4, 7, 9, 0, 8};
        int expResult = 0;
        int result = Min.FindMin(a);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testFindMin3() {
        System.out.println("FindMin");
        int[] a = { 3, 6, 9};
        int expResult = 3;
        int result = Min.FindMin(a);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testFindMin4() {
        System.out.println("FindMin");
        int[] a = { 9, 6, 3, 2, 7};
        int expResult = 2;
        int result = Min.FindMin(a);
        assertEquals(expResult, result);
       
    }
    
    
}
