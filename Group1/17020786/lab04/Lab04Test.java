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
public class Lab04Test {
    
    public Lab04Test() {
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
     * Test of findLager method, of class Lab04.
     */
    @Test
    public void testFindLager1() {
        System.out.println("findLager");
        int a = 2;
        int b = 1;
        int expResult = 2;
        int result = Lab04.findLager(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindLager2() {
        System.out.println("findLager");
        int a = 1;
        int b = 1;
        int expResult = 1;
        int result = Lab04.findLager(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindLager3() {
        System.out.println("findLager");
        int a = 2;
        int b = 3;
        int expResult = 3;
        int result = Lab04.findLager(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindLager4() {
        System.out.println("findLager");
        int a = -2;
        int b = 1;
        int expResult = 1;
        int result = Lab04.findLager(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindLager5() {
        System.out.println("findLager");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Lab04.findLager(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of findMin method, of class Lab04.
     */
    @Test
    public void testFindMin1() {
        System.out.println("findMin");
        int[] a = {1,2,3};
        int n = 3;
        int expResult = 1;
        int result = Lab04.findMin(a, n);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindMin2() {
        System.out.println("findMin");
        int[] a = {1,1,1};
        int n = 3;
        int expResult = 1;
        int result = Lab04.findMin(a, n);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindMin3() {
        System.out.println("findMin");
        int[] a = {-9,2,3};
        int n = 3;
        int expResult = -9;
        int result = Lab04.findMin(a, n);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindMin4() {
        System.out.println("findMin");
        int[] a = {5,2,3,8,9,1,0,-2};
        int n = 8;
        int expResult = -2;
        int result = Lab04.findMin(a, n);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindMin5() {
        System.out.println("findMin");
        int[] a = {0};
        int n = 1;
        int expResult = 0;
        int result = Lab04.findMin(a, n);
        assertEquals(expResult, result);
    }    
}
