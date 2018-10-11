package javaapplication1;


import org.junit.Test;
import static org.junit.Assert.*;


public class teTest {
    
    @Test
    public void testMax() {
  
        int a = 3;
        int b = 2;
        int expResult = 3;
        int result = te.max(a, b);
        assertEquals(expResult, result);
        
    }
    
    public void testMax2() {
        
        int a = 4;
        int b = 6;
        int expResult = 6;
        int result = te.max(a, b);
        assertEquals(expResult, result);
        
    }
    public void testMax3() {
    
        int a = 4;
        int b = 2;
        int expResult = 4;
        int result = te.max(a, b);
        assertEquals(expResult, result);
        
    }
    public void testMax4() {
    
        int a =132;
        int b = 2;
        int expResult = 132;
        int result = te.max(a, b);
        assertEquals(expResult, result);
        
    }
    public void testMax5() {
      
        int a = -2;
        int b = 2;
        int expResult = 2;
        int result = te.max(a, b);
        assertEquals(expResult, result);
        
    }
}

