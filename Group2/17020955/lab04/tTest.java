package javaapplication1;


import org.junit.Test;
import static org.junit.Assert.*;


public class tTest {

    
    
    @Test
    public void testGTNN() {
        
        int[] a = {2,5,3,4};
        int expResult = 2;
        int result = t.GTNN(a);
        assertEquals(expResult, result);
    } 
    
    public void testGTNN2() {
            int[] a = {9, 5,12,6};
            int expResult = 5;
            int result =t.GTNN(a);
            assertEquals(expResult, result);
        }
    public void testGTNN3() {
            int[] a = {3, 5,-2,6};
            int expResult = -2;
            int result =t.GTNN(a);
            assertEquals(expResult, result);
        }
    public void testGTNN4() {
            int[] a = {9, 5,4,3};
            int expResult = 3;
            int result =t.GTNN(a);
            assertEquals(expResult, result);
        }
    public void testGTNN5() {
            int[] a = {-1, -2,-3,-4,-5};
            int expResult = -5;
            int result =t.GTNN(a);
            assertEquals(expResult, result);
        }
    
}

