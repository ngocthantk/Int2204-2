/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minarray;

/**
 *
 * @author Nguyen Ba Duc
 */
public class MinArray {
   
    
    public static int minArray(int[] a){
        int m = a[0];
        for(int i = 0;i < a.length;i++){
            if(a[i] < m) m = a[i];
        }
        return m;
    }
    
    
     
}
