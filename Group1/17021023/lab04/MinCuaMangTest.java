/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class MinCuaMangTest {
    
    public MinCuaMangTest() {
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
     * Test of MinMang method, of class MinCuaMang.
     */
    @Test
    public void testMinMang1() {
        System.out.println("MinMang");
        int[] a = {1,5,7,-9,10};
        int n = 5;
        int expResult = -9;
        int result = MinCuaMang.MinMang(a, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinMang2() {
        System.out.println("MinMang");
        int[] a = {1,5,7,-9,-10};
        int n = 5;
        int expResult = -10;
        int result = MinCuaMang.MinMang(a, n);
        assertEquals(expResult, result);
    }
    @Test
    public void testMinMang3() {
        System.out.println("MinMang");
        int[] a = {8,152,95,12,1,5,7,-9,-100};
        int n = 9;
        int expResult = -100;
        int result = MinCuaMang.MinMang(a, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinMang4() {
        System.out.println("MinMang");
        int[] a = {-888,152,95,12,1,5,7,-9,-100};
        int n = 9;
        int expResult = -888;
        int result = MinCuaMang.MinMang(a, n);
        assertEquals(expResult, result);
    }
}
