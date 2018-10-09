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
public class Phan_bTest {
   

    @Test
    public void Test_b() {
        int n = 6;
        int a[] = {1, 2, 3 , 4, 5, 6};
        int min = Phan_b.Min(a, n);
        assertEquals(1, min);
    }
    @Test
    public void Test_b2() {
        int n = 6;
        int a[] = {1, 2, 3 , 4, 5, 6};
        int min = Phan_b.Min(a, n);
        assertEquals(1, min);
    }
    @Test
    public void Test_b1() {
        int n = 6;
        int a[] = {15, 10, 3 , 4, 5, 6};
        int min = Phan_b.Min(a, n);
        assertEquals(3, min);
    }
    @Test
    public void Test_b6() {
        int n = 3;
        int a[] = {1, 2, 3 };
        int min = Phan_b.Min(a, n);
        assertEquals(1, min);
    }
    @Test
    public void Test_b3() {
        int n = 4;
        int a[] = {3 , 4, 5, 6};
        int min = Phan_b.Min(a, n);
        assertEquals(3, min);
    }
    @Test
    public void Test_b4() {
        int n = 5;
        int a[] = {2, 3 , 4, 5, 6};
        int min = Phan_b.Min(a, n);
        assertEquals(2, min);
    }
}
