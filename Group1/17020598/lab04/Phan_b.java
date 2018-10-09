/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author AnhTam
 */
public class Phan_b {
    public static int Min(int[] a)
    {
        int min = a[0];
        int i;
        for(i=0;i<a.length;i++)
        {
            if(min>a[i]) min = a[i];
        }
        return min;
    }
    
}
