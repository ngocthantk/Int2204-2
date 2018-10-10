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
public class MaxTest {
    

    /**
     * Test of Max method, of class Max.
     */
    @Test
    public void testMax1() {
        System.out.println("Max");
        int a = 3;
        int b = 2;
        int expResult = 3;
        int result = Max.Max(a, b);
        assertEquals(expResult, result);
       
    }
      @Test
    public void testMax2() {
        System.out.println("Max");
        int a = 105;
        int b = 2;
        int expResult = 105;
        int result = Max.Max(a, b);
        assertEquals(expResult, result);
       
    }
      @Test
    public void testMax3() {
        System.out.println("Max");
        int a = 12;
        int b = 23;
        int expResult = 23;
        int result = Max.Max(a, b);
        assertEquals(expResult, result);
       
    }
      @Test
    public void testMax4() {
        System.out.println("Max");
        int a = 65;
        int b = 23;
        int expResult = 65;
        int result = Max.Max(a, b);
        assertEquals(expResult, result);
       
    }
      @Test
    public void testMax5() {
        System.out.println("Max");
        int a = 98;
        int b = 1110;
        int expResult = 1110;
        int result = Max.Max(a, b);
        assertEquals(expResult, result);
       
    }
    
}
