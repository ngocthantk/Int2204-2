/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class timMinTest {
    @Test
    public void testMin()
    {
        int b[]={-1,2,3,5,1};
        int i=timMin.find(b);
        assertEquals(i,-1);
    }
    
    @Test
    public void testMin1()
    {
        int b[]={6,5,3,4,2};
        int i=timMin.find(b);
        assertEquals(i,2);
    }
    
    @Test
    public void testMin2()
    {
        int b[]={-1,-10,-5,-2,-100};
        int i=timMin.find(b);
        assertEquals(i,-100);
    }
    
    @Test
    public void testMin3()
    {
        int b[]={1,1,1,1,1};
        int i=timMin.find(b);
        assertEquals(i,1);
    }
    
    @Test
    public void testMin4()
    {
        int b[]={5,4,3,2,1};
        int i=timMin.find(b);
        assertEquals(i,1);
    }
   
}
