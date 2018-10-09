/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import static javaapplication6.Max.max;
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
public class MaxTest {

    public MaxTest() {
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
     * Test of max method, of class Max.
     */
    @Test
    public void test1() {
        int i = max(1, 4);
        assertEquals(4, i);
    }

    @Test
    public void test2() {
        int i = max(2, 5);
        assertEquals(5, i);
    }

    @Test
    public void test3() {
        int i = max(3, 1);
        assertEquals(3, i);
    }

    @Test
    public void test4() {
        int i = max(5, 4);
        assertEquals(5, i);
    }

    @Test
    public void test5() {
        int i = max(4, 7);
        assertEquals(7, i);
    }

}
