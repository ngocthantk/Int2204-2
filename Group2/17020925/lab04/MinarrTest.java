package minarr;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MinarrTest {
  
    @Test
    public void test1Gtnn() {
        System.out.println("gtnn");
        int[] a = {1,2,3,4};
        int expResult = 4;
        int result = Minarr.gtnn(a);
        assertEquals(expResult, result);
       
    }
    @Test
    public void test2Gtnn() {
        System.out.println("gtnn");
        int[] a = {-15,4,50,97};
        int expResult = -15;
        int result = Minarr.gtnn(a);
        assertEquals(expResult, result);
    }
    @Test
    public void test3Gtnn() {
        System.out.println("gtnn");
        int[] a = {11,-9,-5,999};
        int expResult = -9;
        int result = Minarr.gtnn(a);
        assertEquals(expResult, result);
    }
    @Test
    public void test4Gtnn() {
        System.out.println("gtnn");
        int[] a = {-4,-60,59,-5};
        int expResult = -5;
        int result = Minarr.gtnn(a);
        assertEquals(expResult, result);
    }
    @Test
    public void test5Gtnn() {
        System.out.println("gtnn");
        int[] a = {49,22,25,859};
        int expResult = 25;
        int result = Minarr.gtnn(a);
        assertEquals(expResult, result);
    }
}
