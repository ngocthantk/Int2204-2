package max;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest {
   
    @Test
    public void test1Maxab() {
        System.out.println("maxab");
        int a = 5;
        int b = 0;
        int expResult = 5;
        int result = Max.maxab(a, b);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void test2Maxab() {
        System.out.println("maxab");
        int a = -39;
        int b = 1;
        int expResult = -39;
        int result = Max.maxab(a, b);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void test3Maxab() {
        System.out.println("maxab");
        int a = 950;
        int b = 590;
        int expResult = 590;
        int result = Max.maxab(a, b);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void test4Maxab() {
        System.out.println("maxab");
        int a = 69;
        int b = 96;
        int expResult = 96;
        int result = Max.maxab(a, b);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void test5Maxab() {
        System.out.println("maxab");
        int a = 999;
        int b = 789;
        int expResult = 987;
        int result = Max.maxab(a, b);
        assertEquals(expResult, result);
       
    }
}
