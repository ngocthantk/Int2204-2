/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import static javaapplication6.Min.min;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FEELSBADMAN
 */
public class MinTest {

    public MinTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of min method, of class Min.
     */
    @Test
    public void test1() {
        int[] s = new int[100];
        for (int i = 0; i < 100; i++) {
            s[i] = (i + 1) * 10 % 111;
        }
        int i = min(s);
        assertEquals(1, i);

    }

    @Test
    public void test2() {
        int[] s = new int[100];
        for (int i = 0; i < 100; i++) {
            s[i] = (i + 1) * 10 % 141;
        }
        int i = min(s);
        assertEquals(3, i);
    }

    @Test
    public void test3() {
        int[] s = new int[100];
        for (int i = 0; i < 100; i++) {
            s[i] = (i + 1) * 10 % 157;
        }
        int i = min(s);
        assertEquals(2, i);

    }

    @Test
    public void test4() {
        int[] s = new int[100];
        for (int i = 0; i < 100; i++) {
            s[i] = (i + 1) * 10 % 159;
        }
        int i = min(s);
        assertEquals(1, i);

    }

    @Test
    public void test5() {
        int[] s = new int[100];
        for (int i = 0; i < 100; i++) {
            s[i] = (i + 1) * 10 % 191;
        }
        int i = min(s);
        assertEquals(5, i);

    }

}
