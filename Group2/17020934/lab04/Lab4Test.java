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
 * @author tuann_000
 */
public class Lab4Test {
    
    //
    public int  SoLon(int a,int  b) {
        if (a>b) return a;
        else return b;
    }
    //
    public  int MinArray(int arr[],int  n){
        int Min=arr[0];
        for (int i=0;i<n;i++){
            if (arr[i]<Min) Min=arr[i];
        }
           return Min; 
    }
    //
       public String BMI(double cannang,double chieucao){
           double chiso = cannang/chieucao/chieucao;
           String s = "";
           if (chiso<18.5) {
              return  "Thieu can";
               
           }
           if (chiso >=18.5 && chiso <=22.99) {
               return "Binh thuong";
           }
           if (chiso >22.99 && chiso <=24.99) {
               return "Thua can";
           }
           else  {
               return  "Beo phi";
           }
       }
    // 5 hàm test số lớn hơn trong 2 số
    @Test
    public void testSoLon(){
        //
        assertEquals(5,SoLon(5, 3) );
    }
    @Test
    public void testSoLon1(){
        //
        assertEquals(200,SoLon(200,100) );
    }
    @Test
    public void testSoLon2(){
        //
        assertEquals(12,SoLon(12, 3) );
    }
    @Test
    public void testSoLon3(){
        //
        assertEquals(6,SoLon(5, 6) );
    }
    @Test
    public void testSoLon4(){
        //
        assertEquals(5,SoLon(5, 3) );  
    }
    //
    @Test
    public void TestMinArray(){
        int arr[] = {1,2,3,10};
        assertEquals(1, MinArray(arr, 4));
    }
    @Test
    public void TestMinArray1(){
        int arr[] = {1,2,3,-5};
        assertEquals(-5, MinArray(arr, 4));
    }
    @Test
    public void TestMinArray2(){
        int arr[] = {1,2,3,4,5,-6,7,8,9,10};
        assertEquals(-6, MinArray(arr, 10));
    }
    @Test
    public void TestMinArray3(){
        int arr[] = {1};
        assertEquals(1, MinArray(arr, 1));
    }
    @Test
    public void TestMinArray4(){
        int arr[] = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
        assertEquals(1, MinArray(arr, 15));
    }
    // 5 test BMI
    @Test
    public void TestBMI(){
        double w=54;
        double h=1.69;
        assertEquals("Binh thuong", BMI(w, h));
    }
    @Test
    public void TestBMI1(){
        double w=70;
        double h=1.69;
        assertEquals("Thua can", BMI(w, h));
    }
    @Test
    public void TestBMI2(){
        double w=45;
        double h=1.69;
        assertEquals("Thieu can", BMI(w, h));
    }
    @Test
    public void TestBMI3(){
        double w=90;
        double h=1.69;
        assertEquals("Beo phi", BMI(w, h));
    }
    @Test
    public void TestBMI4(){
        double w=50;
        double h=1.69;
        assertEquals("Thieu can", BMI(w, h));
    }
}
