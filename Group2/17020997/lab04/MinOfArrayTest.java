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
public class MinOfArrayTest {

   

   
    @Test
    public void testGtnn1() {

        int[] a = {1, 2, 3};
        int n = 3;
        int expResult = 1;
        int result = MinOfArray.gtnn(a, n);
        assertEquals(expResult, result);
       
    }

    public void testGtnn2() {

        int[] a = {-2, -1, 98, 4, 99};
        int n = 5;
        int expResult = -1;
        int result = MinOfArray.gtnn(a, n);
        assertEquals(expResult, result);

    }

    public void testGtnn3() {

        int[] a = {7};
        int n = 1;
        int expResult = 7;
        int result = MinOfArray.gtnn(a, n);
        assertEquals(expResult, result);

    }

    public void testGtnn4() {

        int[] a = null;
        int n = 0;
        int expResult = 0;
        int result = MinOfArray.gtnn(a, n);
        assertEquals(expResult, result);

    }

    public void testGtnn5() {

        int[] a = {7, 7, 7};
        int n = 3;
        int expResult = 7;
        int result = MinOfArray.gtnn(a, n);
        assertEquals(expResult, result);

    }
}
