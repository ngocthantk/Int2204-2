/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;
 import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
 /**
 *
 * @author CCNE
 */
public class Lab04Test {
    
    public Lab04Test() {
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
     * Test of getBmi method, of class getBMI.
     */
    @Test
    public void testMax1() {
        //System.out.println("getBmi");
        int result = Lab04.maxNum(6,9);
        assertEquals(result, 9);
    }
    @Test
    public void testMax2() {
        //System.out.println("getBmi");
        int result = Lab04.maxNum(-3,-2);
        assertEquals(result, -2);
    }
    @Test
    public void testMax3() {
        //System.out.println("getBmi");
        int result = Lab04.maxNum(5, -1);
        assertEquals(result, 5);
    }
    @Test
    public void testMax4() {
        //System.out.println("getBmi");
        int result = Lab04.maxNum(9, 6);
        assertEquals(result, 9);
    }
    @Test
    public void testMax5() {
        //System.out.println("getBmi");
        int result = Lab04.maxNum(5, 7);
        assertEquals(result, 7);
    }
    @Test
    public void testMin2() {
        int numArr[] = new int[] {1,2,3,4,5,6,7,8};
        int result = Lab04.minArray(numArr);
        assertEquals(result, 1);
    }
    @Test
    public void testMin3() {
        int numArr[] = new int[] {2, 6,9,0,7,3,5};
        int result = Lab04.minArray(numArr);
        assertEquals(result, 0);
    }
    @Test
    public void testMin4() {
        int numArr[] = new int[] {2, -2, -5, -9,5};
        int result = Lab04.minArray(numArr);
        assertEquals(result, -9);
    }
    @Test
    public void testMin5() {
        int numArr[] = new int[] {2,999,130, 1000, 6,7,3,5};
        int result = Lab04.minArray(numArr);
        assertEquals(result, 2);
    }
    @Test
    public void testMin1() {
        int numArr[] = new int[] {200,25, 99, 6,7,3,5};
        int result = Lab04.minArray(numArr);
        assertEquals(result, 3);
    }
}