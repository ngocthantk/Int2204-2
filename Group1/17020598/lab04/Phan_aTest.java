/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AnhTam
 */
public class Phan_aTest {
    
    
    
    @Test
    public void Test_a() {
        int i = Phan_a.Max(12, 11);
        assertEquals(12, i);
    }
    @Test
     public void Test_a1() {
        int i = Phan_a.Max(10, 9);
        assertEquals(10, i);}
     @Test
     public void Test_a2() {
        int i = Phan_a.Max(11, 9);
        assertEquals(11, i);}
     @Test
     public void Test_a3() {
        int i = Phan_a.Max(1, 9);
        assertEquals(9, i);}
     @Test
      public void Test_a4() {
        int i = Phan_a.Max(5, 4);
        assertEquals(5, i);}
}
