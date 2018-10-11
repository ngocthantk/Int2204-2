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
public class BMI_HamTest {
    @Test
    public void testSomeMethod() {
        String a = BMI_Ham.BMI(54, 1.5);
        assertEquals(a, "Thua can");
        
    }
    @Test
    public void testSomeMethod4() {
        String a = BMI_Ham.BMI(50, 1.6);
        assertEquals(a, "Binh thuong");
        
    }
    @Test
    public void testSomeMethod1() {
        String a = BMI_Ham.BMI(30, 1.5);
        assertEquals(a, "Thieu can");
        
    }
    @Test
    public void testSomeMethod2() {
        String a = BMI_Ham.BMI(70, 1.5);
        assertEquals(a, "Beo phi");
        
    }
    @Test
    public void testSomeMethod3() {
        String a = BMI_Ham.BMI(54, 1.7);
        assertEquals(a, "Binh thuong");
        
    }
        
    }
   
