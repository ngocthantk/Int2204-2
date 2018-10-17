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
public class MINTest {
    
    public MINTest() {
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
     * Test of min method, of class MIN.
     */
    @Test
    public void testMin1() {
        System.out.println("min1");
        int[] a ={ 1, 2, 4, 7, 9};
        int n = 5;
        int expResult = 1;
        int result = MIN.min(a, n);
        assertEquals(expResult, result);
    }
    @Test
    public void testMin2() {
        System.out.println("min2");
        int[] a = {5, 3, 7};
        int n = 3;
        int expResult = 3;
        int result = MIN.min(a, n);
        assertEquals(expResult, result);
    }
    @Test
    public void testMin3() {
        System.out.println("min3");
        int[] a = {9,5,2,4,6};
        int n = 5;
        int expResult = 2;
        int result = MIN.min(a, n);
        assertEquals(expResult, result);
    }
    @Test
    public void testMin4() {
        System.out.println("min4");
        int[] a = {2,5,7,2,1,6,8};
        int n = 7;
        int expResult = 1;
        int result = MIN.min(a, n);
        assertEquals(expResult, result);
    }
    @Test
    public void testMin5() {
        System.out.println("min5");
        int[] a = {5,24,2,6};
        int n = 4;
        int expResult = 2;
        int result = MIN.min(a, n);
        assertEquals(expResult, result);
    }
    
    
    
}
