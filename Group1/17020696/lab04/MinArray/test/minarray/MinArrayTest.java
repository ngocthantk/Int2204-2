/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minarray;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen Ba Duc
 */
public class MinArrayTest {
    
    public MinArrayTest() {
    }

    /**
     * Test of main method, of class MinArray.
     */
   @Test
    public void testMinArray() {
        int[] array = {10,25,30,9,6,7,5};
        assertEquals(5,MinArray.minArray(array));
    }
    
    @Test
    public void testMinArray1() {
//        MinArray m = new MinArray();
        int[] array1 = {100,251,305,96,69,72,53};
        assertEquals(53,MinArray.minArray(array1));
    }
    
    @Test
    public void testMinArray2() {
        int[] array2 = {104,231,30,96,69,720,53};
        assertEquals(30,MinArray.minArray(array2));
    }
    
    @Test
    public void testMinArray3() {
        int[] array3 = {100,251,199,150};
        assertEquals(101,MinArray.minArray(array3));
    }
    
    @Test
    public void testMinArray4() {
        int[] array4 = {100,3,96,69,42,85,56,90,102,103,100,103,80,103};
        assertEquals(3,MinArray.minArray(array4));
    }
    
}
